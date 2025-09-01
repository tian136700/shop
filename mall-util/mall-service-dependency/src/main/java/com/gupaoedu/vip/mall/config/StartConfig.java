package com.gupaoedu.vip.mall.config;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StartConfig {

    /**
     * 分页拦截器配置
     * 必须添加@Bean注解才能生效
     * 达梦数据库
     * 部署：东方通 金蝶 TOMCAT
        服务器:麒麟
       国产化
     */
    @Bean
    public PaginationInnerInterceptor paginationInnerInterceptor() {
        PaginationInnerInterceptor pageInnerInterceptor = new PaginationInnerInterceptor();
        pageInnerInterceptor.setDbType(DbType.MYSQL);
        return pageInnerInterceptor;
    }
}
