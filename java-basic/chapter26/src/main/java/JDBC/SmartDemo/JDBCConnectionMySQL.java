package JDBC.SmartDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Author:Jude
 * Date:2021-01-09 下午5:57
 */
public class JDBCConnectionMySQL {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        //1. 注册驱动
        Class.forName("com.mysql.cj.jdbc.Driver");

        //2. 通过DriverManager 来获取连接
        //(1) url 连接哪个数据库
        Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test?useUnicode=true&characterEncoding=UTF-8&serverTimezone=Asia/Shanghai", "root", "123456");

        System.out.println(connection);

        //3. 创建 Statement , 用于发送 sql 给db
        Statement statement = connection.createStatement();

       // String sql = "insert into beauty values (1, '貂蝉', '女', '1390-11-11', '112')";

        String sql = "update beauty set name = 'tom' where id = 200";
        int executeUpdate = statement.executeUpdate(sql);

        System.out.println(executeUpdate > 0 ? "ok" : "fail");

        //关闭数据连接
        statement.close();
        connection.close();

    }

}
