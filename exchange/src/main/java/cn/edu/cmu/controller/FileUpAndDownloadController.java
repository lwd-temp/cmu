package cn.edu.cmu.controller;

import cn.edu.cmu.domain.Upload;
import cn.edu.cmu.framework.CmuConstants;
import cn.edu.cmu.framework.util.*;
import cn.edu.cmu.framework.web.BaseController;
import cn.edu.cmu.service.UploadService;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.FileInputStream;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/sys/file")
public class FileUpAndDownloadController extends BaseController {

    //上传文件的基本路径:如d:\\upload\\  或者 /home/weblogic/upload/
    public static final String BASE_DIR = (String) YmlUtils.getProperty("sys.upload.base_dir");


    @Autowired
    UploadService uploadService;


    public static final String SINGLE_FILE = "single";
    public static final String MULTIPLE_FILE = "multiple";

    @RequestMapping("/uppage")
    public String upload_page(Model model, String type, String targetUrl, HttpServletRequest request) {

        String uploadPage = "upload/upload_single";

        model.addAttribute("successParams", successParams(request));
        model.addAttribute("targetUrl", targetUrl);
        //单文件上传
        if (StringUtils.isEmpty(type) || SINGLE_FILE.equals(type)) {
            uploadPage = "upload/upload_single";
        }
        //多个文件
        else if (MULTIPLE_FILE.equals(type)) {
            uploadPage = "upload/upload_multiple";
        }


        return uploadPage;
    }


    @ResponseBody
    @RequestMapping("/upload")
    public Map upload(@RequestParam("file") CommonsMultipartFile[] file, HttpServletRequest request, HttpSession session) {
        try {

            String userName = (String)session.getAttribute(CmuConstants.SESSION.USER_NAME);

            Date now = new Date();
            String requestIP = AccessUtils.getIpAddress(request);//操作ip
            List<String> uploadFileIds = new ArrayList();
            List<Upload> uploads = new ArrayList<Upload>();

            for (int i = 0; i < file.length; i++) {
                CommonsMultipartFile commonsMultipartFile = file[i];

                String oriFileName = commonsMultipartFile.getOriginalFilename();
                long size = commonsMultipartFile.getSize();

                logger.info(String.format("用户:%s ,ip:%s上传文件,原始文件名:%s,大小:%d", userName, requestIP, oriFileName, size));

                String fileId = CmuStringUtil.UUID();
                String ext = CmuStringUtil.fileExt(oriFileName);//文件扩展名
                String realName = oriFileName;        //真是的文件名称
                String relativePath = CmuStringUtil.getRelativeDatePath() + realName; //相对完整路径
                String uploadPath = BASE_DIR + relativePath; //完整的上传路径
                File dest = new File(uploadPath);//File类型的上传文件转储对象

                if (!dest.getParentFile().exists()) {
                    dest.getParentFile().mkdirs();
                }
                //将临时目录文件转储到指定的文件位置
                commonsMultipartFile.transferTo(dest);

                //生成待保存的 上传信息数据
                Upload upload = new Upload(fileId, relativePath, ext, userName, requestIP, null, null);

                uploadFileIds.add(fileId);//追加所有上传文件的id（uuid）
                uploads.add(upload);//所有上传文件
            }


            boolean success = uploadService.upload(uploads);

            return super.ajaxStatus(success, uploadFileIds);

        } catch (Exception e) {
            e.printStackTrace();
            return super.ajaxStatus(false, "上传失败，请联系管理员...");
        }

    }


    private String successParams(HttpServletRequest request) {
        StringBuffer sb = new StringBuffer();

        Map<String, String[]> pMap = request.getParameterMap();
        for (String pName : pMap.keySet()) {
            if ("targetUrl".equals(pName)) {//这个是上传成功后请求的路径，不算做参数的一部分
                continue;
            }
            String[] pValues = pMap.get(pName);
            for (String pValue : pValues) {
                sb.append(pName);
                sb.append("=");
                sb.append(pValue);
                sb.append("&");
            }
        }

        if (sb.lastIndexOf("&") == sb.length() - 1) {
            sb.deleteCharAt(sb.length() - 1);
        }

        return sb.toString();
    }

    /**
     * 以特定文件名下载
     * @param request
     * @param response
     * @param fileName
     * @param fileId
     * @throws Exception
     */

    @RequestMapping("/download")
    public void download(HttpServletRequest request, HttpServletResponse response,String fileName, String fileId) throws Exception {


        fileName = URLDecoder.decode(fileName);

        logger.debug("想要下载的文件id为："+fileId);
        HttpHeaders headers = new HttpHeaders();


        Upload upload = uploadService.queryById(fileId);

        String absolutePath = BASE_DIR + upload.getUploadPath(); //完整的上传路径
        logger.debug("下载文件对应的完成路为："+absolutePath);

        File file = new File(absolutePath);

        fileName = upload.getExt();//fileName+(StringUtils.isEmpty(upload.getExt())?"":"."+upload.getExt());

        DownLoadUtils.setDownLoadHeaders(request,response,fileName);
        DownLoadUtils.writeToResponse(response,new FileInputStream(file));
    }

    /**
     * 以上传文件名下载
     * @param request
     * @param response80081
     * @param fileName
     * @param fileId
     * @throws Exception
     */
    @RequestMapping("/jlxydownload")
    public void jlxydownload(HttpServletRequest request, HttpServletResponse response,String fileName, String fileId) throws Exception {


//        fileName = URLDecoder.decode(fileName);

        logger.debug("想要下载的文件id为："+fileId);
        HttpHeaders headers = new HttpHeaders();


        Upload upload = uploadService.queryById(fileId);

        String absolutePath = BASE_DIR + upload.getUploadPath(); //完整的上传路径
        logger.debug("下载文件对应的完成路为："+absolutePath);

        File file = new File(absolutePath);
        if (upload.getExt().length() < 4){
            fileName = upload.getUploadPath().substring(10,upload.getUploadPath().length()-4);
        }else {
            fileName = upload.getUploadPath().substring(10,upload.getUploadPath().length()-5);
        }
        fileName = fileName+(StringUtils.isEmpty(upload.getExt())?"":"."+upload.getExt());

        DownLoadUtils.setDownLoadHeaders(request,response,fileName);
        DownLoadUtils.writeToResponse(response,new FileInputStream(file));
    }


    /**
     * 常用下载
     * @param request
     * @param response
     * @throws Exception
     */
    @RequestMapping("/cydownload")
    public void cydownload(HttpServletRequest request, HttpServletResponse response) throws Exception {

        String application = WebAppContextUtils.REAL_CONTEXT_PATH;

        String fileName = "免责声明.docx";

        HttpHeaders headers = new HttpHeaders();

        String absolutePath = application+"/download_template/word/xm/mzsm.docx"; //下载文件位置
        logger.debug("下载文件对应的完成路为："+absolutePath);

        File file = new File(absolutePath);


        DownLoadUtils.setDownLoadHeaders(request,response,fileName);
        DownLoadUtils.writeToResponse(response,new FileInputStream(file));
    }

}
