package JDBCUtils;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class JDBCUtils {
    private static String driver;
    private static String url;
    private static String user;
    private static String password;
    static{
        Properties properties = new Properties();
        FileReader fileReader = null;
        try {
            fileReader = new FileReader("db.properties");
            properties.load(fileReader);
            driver = properties.getProperty("driver");
            url = properties.getProperty("url");
            user = properties.getProperty("user");
            password = properties.getProperty("password");
            try {
                Class.forName("driver");
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
    public static Connection getConnection()throws SQLException{
        Connection connection = DriverManager.getConnection(url,user,password);
        return connection;
    }
}
