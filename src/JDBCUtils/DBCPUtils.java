package JDBCUtils;

import org.apache.commons.dbcp2.BasicDataSource;

import javax.sql.DataSource;

public class DBCPUtils {
    public static final String driver = "com.mysql.jdbc.Driver";
    public static final String url = "jdbc:mysql://localhost:3306/student1?useSSL=true";
    public static final String username = "root";
    public static final String password = "6237649019";
    public static BasicDataSource basicDataSource = new BasicDataSource();
    static {
        basicDataSource.setDriverClassName(driver);
        basicDataSource.setUrl(url);
        basicDataSource.setUsername(username);
        basicDataSource.setPassword(password);
    }
    public static DataSource getBasicDataSource(){
        return basicDataSource;
    }
}
