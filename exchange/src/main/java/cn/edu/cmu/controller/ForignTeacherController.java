package cn.edu.cmu.controller;

import cn.edu.cmu.domain.ForeignTeacher;
import cn.edu.cmu.domain.Upload;
import cn.edu.cmu.domain.WjjsZjxx;
import cn.edu.cmu.framework.CmuConstants;
import cn.edu.cmu.framework.util.AccessUtils;
import cn.edu.cmu.framework.util.CmuStringUtil;
import cn.edu.cmu.framework.util.DownLoadUtils;
import cn.edu.cmu.framework.util.ExcelUtils;
import cn.edu.cmu.framework.web.BaseController;
import cn.edu.cmu.service.ForeignTeacherService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.StringUtil;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @Author: jshand
 * @Date: 2018/10/28 13:22
 * @site https://github.com/jshand
 * @Project cmu
 * @Version 1.0
 */

@Controller
@RequestMapping("/wjjs")
public class ForignTeacherController  extends BaseController {


    @Autowired
    ForeignTeacherService foreignTeacherService;


    /**
     * 分页查询
     * @param foreignTeacher 查询条件
     * @param orderCol 排序字段
     * @param orderType 排序方式 asc desc
     * @param page   分页对象页号，即想查询第几页
     * @param rows   分页对象每页行数   默认10
     * @return
     * @throws Exception
     */
    @RequestMapping("/list")
    @ResponseBody
    public Map list(ForeignTeacher foreignTeacher,
                    String orderCol,
                    String orderType,
                    @RequestParam(defaultValue = "1",required = false )Integer  page,
                    @RequestParam(defaultValue = "10",required = false) Integer rows  ) throws Exception {

        logger.debug("foreignTeacher:"+foreignTeacher);
        //开启分页
        Page<Object> pageInfo = PageHelper.startPage(page, rows);
        //查询
        List list = foreignTeacherService.list(foreignTeacher,orderCol,orderType);//demoList();

        //返回带【分页】 的表格JSON 信息
        return super.pagingInfo(pageInfo,list);
    }


    /**
     * 如果对象存在key 则说明是修改，否则是新增
     * @param foreignTeacher
     * @return
     * @throws Exception
     */
    @RequestMapping("/save")
    @ResponseBody
    public Map add(ForeignTeacher foreignTeacher ) throws Exception {
        boolean isEdit = false;//是否修改标志
        if(StringUtil.isEmpty(foreignTeacher.getTid())){
            String keyId = CmuStringUtil.UUID();
            foreignTeacher.setTid(keyId);
        }else{//如果存在id则说明是修改
            isEdit = true;
        }

        logger.debug("待保存的 foreignTeacher:"+foreignTeacher);
        boolean success =false;
        if(isEdit){
            success = foreignTeacherService.updateById(foreignTeacher);
        }else{
            success = foreignTeacherService.insert(foreignTeacher);
        }

        logger.debug("保存 foreignTeacher 结果 :"+success);

        //返回带【分页】 的表格JSON 信息
        return super.ajaxStatus(success,foreignTeacher);
    }


    /**
     * 跳转到修改页面
     * @param id
     * @param model
     * @return
     * @throws Exception
     */
    @RequestMapping("/toEdit")
    public String toEdit(String id, Model model) throws Exception {

        ForeignTeacher foreignTeacher = foreignTeacherService.queryById(id);

        model.addAttribute("teacher",foreignTeacher);

        return "jsgl/jsgl_edit";
    }
    /**
     * 根据id删除角色
     * @param id
     * @return
     * @throws Exception
     */
    @RequestMapping("/delById")
    @ResponseBody
    public Map delById(String id) throws Exception {

        boolean success = foreignTeacherService.deleteById(id);

        return super.ajaxStatus(success);
    }

    /**
     * 删除多条
     * @param ids
     * @return
     * @throws Exception
     */
    @RequestMapping("/delMulti")
    @ResponseBody
    public Map delMulti(String[] ids) throws Exception {

        boolean success = foreignTeacherService.deleteMulti(ids);

        return super.ajaxStatus(success);
    }



    @RequestMapping("/uploadZj")
    @ResponseBody
    public Map uploadZj(HttpServletRequest request,HttpSession session, MultipartFile[] file, String[] zjms,String tid) throws Exception {

        //FileUpAndDownloadController.BASE_DIR

        System.out.println(file);

        List<WjjsZjxx> zjs = new ArrayList();
        WjjsZjxx zj = null;


        String userName = (String)session.getAttribute(CmuConstants.SESSION.USER_NAME);

        Date now = new Date();
        String requestIP = AccessUtils.getIpAddress(request);//操作ip
        List<Upload> uploads = new ArrayList<Upload>();

        for (int i = 0; i < file.length; i++) {
            MultipartFile f = file[i];

            String oriFileName = f.getOriginalFilename();
            long size = f.getSize();

            logger.info(String.format("用户:%s ,ip:%s上传文件,原始文件名:%s,大小:%d", userName, requestIP, oriFileName, size));

            String fileId = CmuStringUtil.UUID();
            String ext = CmuStringUtil.fileExt(oriFileName);//文件扩展名
            String realName = fileId + "." + ext;        //真是的文件名称
            String relativePath = CmuStringUtil.getRelativeDatePath() + realName; //相对完整路径
            String uploadPath = FileUpAndDownloadController.BASE_DIR + relativePath; //完整的上传路径
            File dest = new File(uploadPath);//File类型的上传文件转储对象

            if (!dest.getParentFile().exists()) {
                dest.getParentFile().mkdirs();
            }
            //将临时目录文件转储到指定的文件位置
            f.transferTo(dest);

            //生成待保存的 上传信息数据
            Upload upload = new Upload(fileId, relativePath, ext, userName, requestIP, null, null);
            uploads.add(upload);//所有上传文件


            zj = new WjjsZjxx();
            zj.setId(fileId);//对象id 跟上传文件id使用一个即可，不用单独生成(因为是不同表的主键)
            zj.setFid(fileId);
            zj.setTid(tid);
            zj.setZjms(zjms[i]);
            zjs.add(zj);

        }


        boolean success = foreignTeacherService.uploadZj(uploads,zjs);


        return super.ajaxStatus(success);

    }


    @RequestMapping("/toShowZj")
    public String toShowZj(String tid, Model model) throws Exception {

        List<WjjsZjxx>  zjs= foreignTeacherService.queryZjs(tid);

        model.addAttribute("zjs",zjs);

        return "jsgl/jsgl_zjgl";
    }

    /*
    外籍教师信息下载
     */
    @RequestMapping("/download")
    public void download(ForeignTeacher wjjs,String orderCol, String orderType, HttpServletRequest request,HttpServletResponse response)throws Exception{

        List<ForeignTeacher> list = foreignTeacherService.wjjslistExp(wjjs, orderCol, orderType);//demoList();

        logger.info(String.format("导出教师信息，共计: %d 条",(CollectionUtils.isEmpty(list)?0:list.size())));

        String downFileName = "外籍教师汇总.xls";

        //设置下载文件Header信息
        DownLoadUtils.setDownLoadHeaders(request,response,downFileName);

        ServletOutputStream out = response.getOutputStream();

        String excelTempPath = "js/wjjs.xls";
        ExcelUtils.expExcel(list,excelTempPath,out);
    }


}
