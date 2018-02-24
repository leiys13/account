package com.sadasen.account.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import com.sadasen.account.util.AccountUtil;
import com.zaxxer.hikari.HikariDataSource;

/**
 * @date 2018年2月2日
 * @author lei.ys
 * @desc
 */
@Configuration
public class DataSourceConfig {
	
	@Bean(name="dataSource")
	public DataSource dataSource(Environment env) {
		HikariDataSource ds = new HikariDataSource();
		ds.setJdbcUrl(env.getProperty("spring.datasource.url"));
		ds.setUsername(env.getProperty("spring.datasource.username"));
		ds.setPassword(AccountUtil.dbDecrypt(env.getProperty("spring.datasource.password")));
		ds.setDriverClassName(env.getProperty("spring.datasource.driverClassName"));
		return ds;
	}

}
