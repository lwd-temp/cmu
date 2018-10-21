package cn.edu.cmu.controller;
import cn.edu.cmu.domain.Hzxy;
import cn.edu.cmu.domain.HzxyGb;
import cn.edu.cmu.framework.web.BaseController;
import cn.edu.cmu.service.HzxyGbService;
import cn.edu.cmu.service.JlxyService;
import cn.edu.cmu.vo.HzxyVo;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/jlxy")
public class JlxyController extends BaseController {

    @Autowired
    JlxyService jlxyService;

    @Autowired
    HzxyGbService hzxyGbService;

    /**
     * 分页查询
     * @param hzxy 查询条件
     * @param orderCol 排序字段
     * @param orderType 排序方式 asc desc
     * @param page   分页对象页号，即想查询第几页
     * @param rows   分页对象每页行数   默认10
     * @return
     * @throws Exception
     */
    @RequestMapping("/list")
    @ResponseBody
    public Map list(Hzxy hzxy, //一个 查询条件
                    String orderCol,    // 排序 字段   order by   【name】
                    String orderType,// 排序 类型  asc   desc
                    @RequestParam(defaultValue = "1",required = false )Integer  page,
                    @RequestParam(defaultValue = "10",required = false) Integer rows  ) throws Exception {

        logger.debug("condition:"+hzxy);
        //开启分页
        Page<Object> pageInfo = PageHelper.startPage(page, rows);
        //查询
        List list = jlxyService.list(hzxy,orderCol,orderType);
        logger.info("list:"+list);
        //返回带【分页】 的表格JSON 信息
        return super.pagingInfo(pageInfo,list);
    }


    /**
     * 如果对象存在key 则说明是修改，否则是新增
     * @param
     * @return
     * @throws Exception
     */
    @RequestMapping("/save")
    @ResponseBody
    public Map add(HzxyVo hzxyVo) throws Exception {

        boolean success =false;
        if(!StringUtils.isEmpty(hzxyVo.getHzxy().getXyid())){
            success = jlxyService.updateSave(hzxyVo);
        }else{
            success = jlxyService.insertSave(hzxyVo);
        }

        return super.ajaxStatus(success,hzxyVo);
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

        Hzxy hzxy = jlxyService.queryById(id);
        HzxyGb hzxyGb = new HzxyGb();
        hzxyGb.setXyid(id);
        List gbList = new ArrayList();
        gbList = hzxyGbService.list(hzxyGb);

        List list = new ArrayList();
        if(gbList.size()>0){
            for (int i = 0; i < gbList.size(); i++) {
                HzxyGb gb = new HzxyGb();
                gb = (HzxyGb) gbList.get(i);
                list.add(gb.getGjdm());
            }
        }
        //hzxy.setGbs(list);
        model.addAttribute("jlxy",hzxy);
        model.addAttribute("gbList",list);
        logger.info(hzxy);
        return "jlxy/jlxy_edit";
    }
    /**
     * 根据id删除
     * @param id
     * @return
     * @throws Exception
     */
    @RequestMapping("/delById")
    @ResponseBody
    public Map delById(String id) throws Exception {

        boolean success = jlxyService.deleteById(id);

        return super.ajaxStatus(success);
    }


    /**
     * 上传文件成功后更新协议表中 文件id
     * @param fileId
     * @param xyid
     */
    @ResponseBody
    @RequestMapping("/updateUploadId")
    public Map uploadXy(String fileId, String xyid) throws Exception {
        Hzxy xy = jlxyService.queryById(xyid);
        xy.setUploadId(fileId);

        boolean success = jlxyService.updateById(xy);

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

        boolean success = jlxyService.deleteMulti(ids);

        return super.ajaxStatus(success);
    }



}
