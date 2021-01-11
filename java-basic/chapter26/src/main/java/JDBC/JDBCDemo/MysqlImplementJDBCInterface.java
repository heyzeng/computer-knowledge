package JDBC.JDBCDemo;

/**
 * Author:Jude
 * Date:2021-01-09 下午5:51
 */
//mysql数据库公司的实现 接口类
public class MysqlImplementJDBCInterface implements JDBCInterface {
    @Override
    public void connection() {
        System.out.println("mysql连接");
    }

    @Override
    public void crud() {
        System.out.println("mysql crud");
    }

    @Override
    public void close() {
        System.out.println("mysql close");
    }
}
