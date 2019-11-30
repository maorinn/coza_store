package tuil;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;
/*
 * 数据库操作工具类
 * */
public class SqlUtil {
    private Connection conn;
    public Connection getConn() throws Exception {
        Properties properties=new Properties();
        properties.load(new FileInputStream("src/druid.properties"));
        DataSource ds = DruidDataSourceFactory.createDataSource(properties);
        conn = ds.getConnection();
        return conn;
    }
    public void closConn() throws SQLException {
        conn.close();
    }
}
