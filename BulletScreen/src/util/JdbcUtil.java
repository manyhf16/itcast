package util;

import com.alibaba.druid.pool.DruidDataSource;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author yihang
 */
public class JdbcUtil {
    static DruidDataSource dataSource;
    static {
        try (InputStream in = JdbcUtil.class.getClassLoader().getResourceAsStream("jdbc.properties")) {
            Properties properties = new Properties();
            properties.load(in);
            dataSource = new DruidDataSource();
            dataSource.setUsername(properties.getProperty("jdbc.username"));
            dataSource.setPassword(properties.getProperty("jdbc.password"));
            dataSource.setUrl(properties.getProperty("jdbc.url"));
        } catch (IOException e) {
        }
    }
    public static DataSource getDataSource() {
        return dataSource;
    }
}
