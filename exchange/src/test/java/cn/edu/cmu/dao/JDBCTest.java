package cn.edu.cmu.dao;

import org.junit.Test;

import java.sql.*;

/**
 * @Author: jshand
 * @Date: 2018/10/7 19:30
 * @site https://github.com/jshand
 * @Project cmu
 * @Version 1.0
 */
public class JDBCTest {


    @Test
    public void testConnect()  {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        StringBuffer sb = new StringBuffer();
        try {
            String userName = "exchange";
            String password = "exchange";

            String ip = "121.42.51.148";
            Class.forName("oracle.jdbc.OracleDriver");
            String url = "jdbc:oracle:thin:@"+ip+":1521:orcl";
            conn = DriverManager.getConnection(url, userName, password);

            stmt = conn.createStatement();
            rs = stmt.executeQuery("select * from dual ");
            ResultSetMetaData meta = rs.getMetaData();

            while(rs.next()){
                String columnName = meta.getColumnName(1);
                String value = rs.getString(columnName);
                sb.append("column :" +columnName);
                sb.append("value : "+value);
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                rs.close();
                stmt.close();
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
            }
        }

        System.out.println(sb.toString());
    }
}
