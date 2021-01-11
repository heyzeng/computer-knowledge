package JDBC.JDBCDemo;

/**
 * Author:Jude
 * Date:2021-01-09 下午5:48
 */
public class JDBCJavaMain {

    public static void main(String[] args) {

        //java程序->mysql
        MysqlImplementJDBCInterface mysqlImplementJDBCInterface = new MysqlImplementJDBCInterface();

        mysqlImplementJDBCInterface.connection();
        mysqlImplementJDBCInterface.crud();
        mysqlImplementJDBCInterface.close();
    }
}
