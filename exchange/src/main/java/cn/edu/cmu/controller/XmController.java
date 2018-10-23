package cn.edu.cmu.controller;

import cn.edu.cmu.domain.Xm;
import cn.edu.cmu.framework.web.BaseController;
import cn.edu.cmu.service.XmService;
import cn.edu.cmu.vo.XmVo;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/xm")
public class XmController extends BaseController {

    @Autowired
    XmService xmService;


    /**
     * 分页查询
     *
     * @param xm      查询条件
     * @param orderCol  排序字段
     * @param orderType 排序方式 asc desc
     * @param page      分页对象页号，即想查询第几页
     * @param rows      分页对象每页行数   默认10
     * @return
     * @throws Exception
     */
    @RequestMapping("/list")
    @ResponseBody
    public Map list(Xm xm,
                    String orderCol,
                    String orderType,
                    @RequestParam(defaultValue = "1", required = false) Integer page,
                    @RequestParam(defaultValue = "10", required = false) Integer rows) throws Exception {

        logger.debug("condition:" + xm);
        //开启分页
        Page<Object> pageInfo = PageHelper.startPage(page, rows);
        //查询
        List list = xmService.list(xm, orderCol, orderType);//demoList();

        //返回带【分页】 的表格JSON 信息
        return super.pagingInfo(pageInfo, list);
    }


    /**
     * 如果对象存在key 则说明是修改，否则是新增
     *
     * @param xmVo
     * @return
     * @throws Exception
     */
    @RequestMapping("/save")
    @ResponseBody
    public Map add(XmVo xmVo, HttpSession session) throws Exception {

        logger.debug("待保存的 xmVo:" + xmVo);


        boolean success = xmService.save(xmVo,session);


        //if(1==1){
        //    super.ajaxStatus(true, null);
        //}
       /* boolean isEdit = false;//是否修改标志
        if (StringUtil.isEmpty(xm.getXmId())) {
            String keyId = CmuStringUtil.UUID();
            xm.setXmId(keyId);
        } else {//如果存在id则说明是修改
            isEdit = true;
        }


        boolean success = false;
        if (isEdit) {
            success = xmService.updateById(xm);
        } else {
            success = xmService.insert(xm);
        }
*/
        //logger.debug("保存 xm 结果 :" + success);

        //返回带【分页】 的表格JSON 信息
        return super.ajaxStatus(success, xmVo);
    }


    /**
     * 跳转到修改页面
     *
     * @param id
     * @param model
     * @return
     * @throws Exception
     */
    @RequestMapping("/toEdit")
    public String toEdit(String id, Model model) throws Exception {

        Xm xm = xmService.queryById(id);

        model.addAttribute("xm", xm);

        return "xmgl/role/role_edit";
    }

    /**
     * 根据id删除角色
     *
     * @param id
     * @return
     * @throws Exception
     */
    @RequestMapping("/delById")
    @ResponseBody
    public Map delById(String id) throws Exception {

        boolean success = xmService.deleteById(id);

        return super.ajaxStatus(success);
    }

    /**
     * 根据id删除角色
     *
     * @param ids
     * @return
     * @throws Exception
     */
    @RequestMapping("/delMulti")
    @ResponseBody
    public Map delMulti(String[] ids) throws Exception {

        //boolean success = xmService.deleteMulti(ids);

        return super.ajaxStatus(false);
    }





}
