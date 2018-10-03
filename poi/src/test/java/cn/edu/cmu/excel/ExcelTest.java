package cn.edu.cmu.excel;

import cn.edu.cmu.framework.excel.ExcelUtil;
import org.junit.Test;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @Author: jshand
 * @Date: 2018/10/3 13:54
 * @site https://github.com/jshand
 * @Project cmu
 * @Version 1.0
 */
public class ExcelTest {

    @Test
    public void testExcel() throws IOException {

        OutputStream os = new FileOutputStream(new File("D:\\" + new SimpleDateFormat("yyyyMMdd_HH_mm_ss").format(new Date()) + ".xls"));
        List data = new ArrayList();

//        data.add(new User("001", "admin1", 18, new Date()));
//        data.add(new User("201", "admin2", 28, new Date(2018-1900,9,20)));
//        data.add(new User("301", "admin3", 38, new Date(2019-1900,8,21,17,19,25)));
//        data.add(new User("401", "admin4", 48, new Date(2020-1900,7,22)));
//        data.add(new User("501", "admin5", 58, new Date(2021-1900,6,23)));

        for (int i = 0; i < 10; i++) {
            Map user = new HashMap();
            user.put("tzh", "id" + i);
            user.put("userName", "us:" + i);
            user.put("age", 50 + i);
            user.put("birthDay", new Date());
            data.add(user);
        }

        ExcelUtil.expExcel(data, "excel_template/source.xls", os);
    }
}
