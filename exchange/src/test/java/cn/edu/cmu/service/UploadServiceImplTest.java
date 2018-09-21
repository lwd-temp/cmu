package cn.edu.cmu.service;

import cn.edu.cmu.base.SpringIOC;
import cn.edu.cmu.domain.Upload;
import cn.edu.cmu.domain.User;
import cn.edu.cmu.framework.utils.CmuStringUtil;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;
import java.util.List;


/**
 * Service层的测试类
 *
 * 增加删改查
 */
public class UploadServiceImplTest extends SpringIOC {

    UploadService service;

    @Before
    public  void init(){
        service = ac.getBean(UploadService.class);
    }
    //保存
    @Test
    public void save() {
        Upload upload = new Upload(CmuStringUtil.UUID(),"01", new Date(), "01", "01", "01",null,null);
        boolean success = service.insert(upload);
        System.out.println("Upload:"+upload);
        System.out.println("success:"+success);
        Assert.assertTrue(success);
    }
    //根据主键查询
    @Test
    public void selectByPrimaryKey() {
        String keyId = "485600be9cb34b20b0340a376756f064";
        Upload upload = service.queryById(keyId);
        System.out.println(upload);
        Assert.assertTrue(upload!=null);
    }
    //根据条件查询
    @Test
    public void list() {
        Upload uploadParam = new Upload();
        uploadParam.setUploadPath("0");
        List<Upload> uploads = service.list(uploadParam);
        for (Upload upload : uploads ) {
            System.out.println(upload);
        }
        Assert.assertTrue(uploads.size()>0);
    }
    //更新
    @Test
    public void update() {
        String keyId = "485600be9cb34b20b0340a376756f064";
        Upload upload = service.queryById(keyId);
        System.out.println("更新前:"+upload);
        upload.setUploadPath("02");
        boolean success = service.updateById(upload);
        System.out.println("success:"+success);
        Upload newUpload = service.queryById(keyId);
        System.out.println("更新后:"+newUpload);
        Assert.assertTrue(newUpload.getUploadPath().contains("02"));
    }
    //根据主键删除
    @Test
    public void deleteById() {
        String keyId = CmuStringUtil.UUID();
        Upload upload = new Upload(keyId,"01", new Date(), "01", "01", "01",null,null);
        boolean success = service.insert(upload);
        System.out.println("保存成功："+success);
        Upload queryUpload = service.queryById(keyId);
        System.out.println("插入后查询"+queryUpload);
        queryUpload.setValid("0");
        queryUpload.setCreateTime(new Date());
        success = service.updateByIdAllColumn(queryUpload);
        System.out.println("删除成功："+success);
        Assert.assertTrue(success);
    }
}