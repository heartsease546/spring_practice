package com.myblog.configure;

import com.alibaba.druid.pool.DruidDataSource;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.mybatis.spring.transaction.SpringManagedTransactionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import javax.sql.DataSource;
import java.io.IOException;
import java.util.Properties;

// @MapperScan(basePackages = {"com.myblog.dao"})
public class DatabaseConfig {

    // if append below codes, will prompt 'circular reference'
    // it may be due to this class will auto inject the relative class but we inject the class manually again
    // @Autowired
    // private DruidDataSource dataSource;
    // @Autowired
    // private SqlSessionFactoryBean sqlSessionFactoryBean;

    @Bean("dataSource")
    public DruidDataSource dataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        Properties prop = new Properties();
        try {
            // Below codes will not get the file correctly because the File is for the absolute path
            // prop.load(new FileInputStream(new File("jdbc.properties")));
            prop.load(new ClassPathResource("jdbc.properties").getInputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
        // database configuration
        dataSource.setDriverClassName(prop.getProperty("db.driver"));
        dataSource.setUrl(prop.getProperty("db.url"));
        dataSource.setUsername(prop.getProperty("db.user"));
        dataSource.setPassword(prop.getProperty("db.password"));
        // connection pool configuration
        dataSource.setInitialSize(Integer.parseInt(prop.getProperty("cp.initialSize")));
        dataSource.setMinIdle(Integer.parseInt(prop.getProperty("cp.minSize")));
        dataSource.setMaxActive(Integer.parseInt(prop.getProperty("cp.maxSize")));
        dataSource.setTimeBetweenEvictionRunsMillis(Long.parseLong(prop.getProperty("cp.checkConnectionInterval")));
        dataSource.setMinEvictableIdleTimeMillis(Long.parseLong(prop.getProperty("cp.connectionTimeout")));

        return dataSource;
    }

    @Bean("sqlSessionFactoryBean")
    public SqlSessionFactoryBean sqlSessionFactoryBean(DataSource dataSource) {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
        sqlSessionFactoryBean.setTransactionFactory(new SpringManagedTransactionFactory());
        sqlSessionFactoryBean.setTypeAliasesPackage("com.myblog.entity");
        sqlSessionFactoryBean.setMapperLocations(new Resource[]{
                new ClassPathResource("com/myblog/sql/AdminDao.xml")
        });
        return sqlSessionFactoryBean;
    }

    @Bean("sqlSession")
    public SqlSessionTemplate sqlSession(SqlSessionFactoryBean sqlSessionFactoryBean) {
        SqlSessionTemplate sqlSession = null;
        try {
            sqlSession = new SqlSessionTemplate(sqlSessionFactoryBean.getObject());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sqlSession;
    }

    // if use below codes and will prompt errors: dataSource is not identified
    // could use @MapperScan annotation
    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer() {
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        mapperScannerConfigurer.setBasePackage("com.myblog.dao");
        mapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactoryBean");
        return mapperScannerConfigurer;
    }
}
