package cn.edu.cmu.controller;

import cn.edu.cmu.domain.Contact;
import cn.edu.cmu.framework.util.CmuStringUtil;
import cn.edu.cmu.framework.util.DownLoadUtils;
import cn.edu.cmu.framework.util.ExcelUtils;
import cn.edu.cmu.framework.web.BaseController;
import cn.edu.cmu.service.ContactService;
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

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/lxr")
public class LxrController extends BaseController {

    @Autowired
    ContactService contactService;


    /**
     * 分页查询
     * @param contact 查询条件
     * @param orderCol 排序字段
     * @param orderType 排序方式 asc desc
     * @param page   分页对象页号，即想查询第几页
     * @param rows   分页对象每页行数   默认10
     * @return
     * @throws Exception
     */
    @RequestMapping("/list")
    @ResponseBody
    public Map list(Contact contact,
                    String orderCol,
                    String orderType,
                    @RequestParam(defaultValue = "1",required = false )Integer  page,
                    @RequestParam(defaultValue = "10",required = false) Integer rows  ) throws Exception {

        logger.debug("condition:"+contact);
        //开启分页
        Page<Object> pageInfo = PageHelper.startPage(page, rows);
        //查询
        List list = contactService.list(contact,orderCol,orderType);//demoList();

        //返回带【分页】 的表格JSON 信息
        return super.pagingInfo(pageInfo,list);
    }


    /**
     * 如果对象存在key 则说明是修改，否则是新增
     * @param contact
     * @return
     * @throws Exception
     */
    @RequestMapping("/save")
    @ResponseBody
    public Map add(Contact contact ) throws Exception {
        boolean isEdit = false;//是否修改标志
        if(StringUtil.isEmpty(contact.getLxrId())){
            String keyId = CmuStringUtil.UUID();
            contact.setLxrId(keyId);
        }else{//如果存在id则说明是修改
            isEdit = true;
        }

        logger.debug("待保存的 contact:"+contact);
        boolean success =false;
        if(isEdit){
            success = contactService.updateById(contact);
        }else{
            success = contactService.insert(contact);
        }

        logger.debug("保存 user 结果 :"+success);

        //返回带【分页】 的表格JSON 信息
        return super.ajaxStatus(success,contact);
    }


    /**
     * 跳转到修改页面
     * @param id
     * @param model
     * @return
     * @throws Exception
     */
    @RequestMapping("/toEdit")
    public String toEdit(String id,Model model) throws Exception {

        Contact contact = contactService.queryById(id);

        model.addAttribute("contact",contact);

        return "lxr/lxr_edit";
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

        boolean success = contactService.deleteById(id);

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

        boolean success = contactService.deleteMulti(ids);

        return super.ajaxStatus(success);
    }

    /*
   国际交流联系人下载
    */
    @RequestMapping("/download")
    public void download(Contact lxr, String orderCol, String orderType, HttpServletRequest request, HttpServletResponse response) throws Exception{

        logger.info("联系人姓名:"+lxr.getName());
        List<Contact> list = contactService.lxrlistExp(lxr, orderCol, orderType);//demoList();

        logger.info(String.format("导出联系人信息，共计: %d 条",(CollectionUtils.isEmpty(list)?0:list.size())));

        String downFileName = "国际交流联系人汇总.xls";

        //设置下载文件Header信息
        DownLoadUtils.setDownLoadHeaders(request,response,downFileName);

        ServletOutputStream out = response.getOutputStream();

        String excelTempPath = "contact/lxr.xls";
        ExcelUtils.expExcel(list,excelTempPath,out);
    }

}
