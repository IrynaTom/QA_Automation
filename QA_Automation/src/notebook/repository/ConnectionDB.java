package notebook.repository;
import org.apache.commons.dbutils.DbUtils;
import sun.security.pkcs11.Secmod;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by 1512 on 09.03.2016.
 */
public class ConnectionDB {
    private static final String url = "jdbc:mysql://127.0.0.1:3306/test";
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String usr = "root";
    private static final String pwd = "111111";

    public static Connection getConnection() {
        DbUtils.loadDriver(driver);
        try {
            return DriverManager.getConnection(url, usr, pwd);
        } catch (SQLException e) {
            System.out.println("Oops! Can't set connection with db");
            throw new RuntimeException("Problem to set db connection !!! " + e);
        }
    }

}
