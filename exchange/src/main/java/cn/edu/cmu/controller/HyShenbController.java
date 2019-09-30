package cn.edu.cmu.controller;

import cn.edu.cmu.domain.*;
import cn.edu.cmu.framework.util.ExcelUtils;
import cn.edu.cmu.framework.util.WebAppContextUtils;
import cn.edu.cmu.framework.web.BaseController;
import cn.edu.cmu.service.HyJhService;
import cn.edu.cmu.service.HySbrymdService;
import cn.edu.cmu.service.HyShenbService;
import cn.edu.cmu.vo.HysbVO;
import com.deepoove.poi.XWPFTemplate;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/hysb")
public class HyShenbController extends BaseController {

    @Autowired
    HyJhService hyJhService;

    @Autowired
    HyShenbService hyShenbService;

    @Autowired
    HySbrymdService hySbrymdService;



    /**
     * 分页查询
     * @param hyShenb 查询条件
     * @param orderCol 排序字段
     * @param orderType 排序方式 asc desc
     * @param page   分页对象页号，即想查询第几页
     * @param rows   分页对象每页行数   默认10
     * @return
     * @throws Exception
     */
    @RequestMapping("/list")
    @ResponseBody
    public Map list(HyShenb hyShenb,
                    String orderCol,
                    String orderType,
                    @RequestParam(defaultValue = "1",required = false )Integer  page,
                    @RequestParam(defaultValue = "10",required = false) Integer rows  ) throws Exception {

        logger.debug("condition:"+hyShenb);
        //开启分页
        Page<Object> pageInfo = PageHelper.startPage(page, rows);
        //查询
        List list = hyShenbService.list(hyShenb,orderCol,orderType);

        //返回带【分页】 的表格JSON 信息
        return super.pagingInfo(pageInfo,list);
    }


    /**
     * 如果对象存在key 则说明是修改，否则是新增
     * @param hysbVO
     * @return
     * @throws Exception
     */
    @RequestMapping("/save")
    @ResponseBody
    public Map save(HysbVO hysbVO ) throws Exception {


        boolean success = hyShenbService.save(hysbVO);


        //返回带【分页】 的表格JSON 信息
        return super.ajaxStatus(success,hysbVO);
    }


    /**
     * 跳转到修改页面
     * @param id
     * @param model
     * @return
     * @throws Exception
     */
    @RequestMapping("/jh2sb")
    public String jh2sb(String id,Model model) throws Exception {

        HyJh hyJh = hyJhService.queryById(id);
        List<HyRymd> ryList = hyJhService.rymcList(id);

        HyShenb hysb = new HyShenb();
        BeanUtils.copyProperties(hysb,hyJh);

        HySbrymd sbRy = null;
        List<HySbrymd> sbRymds = new ArrayList<HySbrymd>(0);

        for (HyRymd hyRymd : ryList) {
            sbRy = new HySbrymd();
            BeanUtils.copyProperties(sbRy,hyRymd);//计划人员名单，copy到申报人员名单中
            sbRymds.add(sbRy);
        }

        model.addAttribute("hysb",hysb);
        model.addAttribute("sbRymds",sbRymds);

        return "gjhy/gjhy_sb_add";
    }




    /**
     * 跳转到修改页面
     * @param id
     * @param model
     * @return
     * @throws Exception
     */
    @RequestMapping("/toEdit")
    public String toEdit(String id,String type ,Model model) throws Exception {

        HyShenb hysb = hyShenbService.queryById(id);
        List<HySbrymd> sbRymds = hyShenbService.rymcList(id);

        model.addAttribute("hysb",hysb);
        model.addAttribute("sbRymds",sbRymds);
        if("show".equals(type)){//查看
            return  "gjhy/gjhy_sb_show";
        }else if("sh".equals(type)){//审核查看
            return  "gjhy/gjhy_sh_show";
        }
        return "gjhy/gjhy_sb_edit";
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

        boolean success = hyShenbService.deleteById(id);

        return super.ajaxStatus(success);
    }

    /**
     * 审核更新申报状态
     * @param shenb
     * @return
     * @throws Exception
     */
    @RequestMapping("/sh")
    @ResponseBody
    public Map sh(HyShenb shenb) throws Exception {

        boolean success = hyShenbService.sh(shenb);

        return super.ajaxStatus(success);
    }


    /**
     * 会议申报下载
     */
    @RequestMapping("/download")
    public void export(String id, HttpServletRequest request, HttpServletResponse response) throws Exception {
        String application = WebAppContextUtils.REAL_CONTEXT_PATH;
        HyShenb domain = hyShenbService.queryById(id);
        String gjhy;
        String fileName;
        if (domain.getHylx().equals("01")){
            gjhy="/download_template/word/gjhy/gjhy.docx";
            fileName = "中国医科大学举办国际学术会议申报表.doc";
        }else {
            gjhy="/download_template/word/gjhy/lgjhy.docx";
            fileName = "中国医科大学举办两国间、同港澳台地区间会议、论坛、讲座、报告会申报表.doc";
        }
        FileInputStream is = new FileInputStream(new File(application+gjhy));
        XWPFTemplate template = XWPFTemplate.compile(is);
        HashMap<String, Object> data = new HashMap<String, Object>();
        data.put("hymc",domain.getHymc());
        data.put("hymcEn",domain.getHymcEn());
        data.put("zbdw",domain.getZbdw());
        data.put("dd",domain.getDd());
        data.put("bjjbyx",domain.getBjjbyx());
        data.put("jfly",domain.getJfly());
        data.put("fzrxm",domain.getFzrxm());
        data.put("operator",domain.getOperator());
        data.put("fzrdh",domain.getFzrdh());
        data.put("hygm",domain.getHygm());
        if(domain.getJxrqKs()!=null){
            data.put("jxrqKs", new SimpleDateFormat("yyyy-MM-dd").format(domain.getJxrqKs()).toString());
        }else{
            data.put("jxrqKs", domain.getJxrqKs());
        }
        if(domain.getJxrqJs()!=null){
            data.put("jxrqJs", new SimpleDateFormat("yyyy-MM-dd").format(domain.getJxrqJs()).toString());
        }else{
            data.put("jxrqJs", domain.getJxrqJs());
        }

        template.render(data);
        response.reset();
        response.setContentType("application/x-msdownload");
        response.setHeader("Content-Type", "application/octet-stream");
        String agent = request.getHeader("User-Agent").toUpperCase(); //获得浏览器信息并转换为大写
        if (agent.indexOf("MSIE") > 0 || (agent.indexOf("GECKO")>0 && agent.indexOf("RV:11")>0)) {  //IE浏览器和Edge浏览器
            fileName = URLEncoder.encode(fileName, "UTF-8");
        } else {  //其他浏览器
            fileName = new String(fileName.getBytes("UTF-8"), "iso-8859-1");
        }
        response.setHeader("content-disposition", "attachment;filename=" + fileName);
        ServletOutputStream os = response.getOutputStream();
        template.write(os);
        os.flush();
        os.close();
        template.close();
    }



}
