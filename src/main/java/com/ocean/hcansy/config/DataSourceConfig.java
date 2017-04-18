package com.ocean.hcansy.config;

import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;

/**
 * 数据源配置
 * @author yunhai
 *
 */
@Configuration
@ConfigurationProperties(prefix = "db.datasource")
@PropertySource(value = "classpath:db.properties")
public class DataSourceConfig {
	
	/**
     * 数据源类型
     */
    private Class<? extends DataSource> type;

    /**
     * 创建主数据源
     * @return DataSource
     */
    @Bean(name = "dataSource")
    @Primary
    @ConfigurationProperties(prefix = "db.datasource")
    public DataSource dataSource() {
        return DataSourceBuilder.create().type(type).build();
    }

    public Class<? extends DataSource> getType() {
        return type;
    }

    public void setType(Class<? extends DataSource> type) {
        this.type = type;
    }

}
