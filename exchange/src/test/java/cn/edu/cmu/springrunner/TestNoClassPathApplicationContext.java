package cn.edu.cmu.springrunner;

import com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlUpdateTableSource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/***
 * @pj: cmu
 * @author : jshand
 * @date: 2019/7/5
 * @time: 13:44
 * @site: http://314649444.iteye.com
 * @desc：测试springRunner类，自动装在配置工厂
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:/springmvc.xml" })
public class TestNoClassPathApplicationContext {
    @Autowired
    private DataSource dataSource;



    @Test
    public void test() throws SQLException {
        Connection conn = dataSource.getConnection();
        System.out.println(conn);
    }
}
