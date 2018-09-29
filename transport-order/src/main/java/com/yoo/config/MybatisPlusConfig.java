package com.yoo.config;

import com.baomidou.mybatisplus.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author yub
 * @describe talk something
 * @date 2018/9/26 002619:23
 */
@EnableTransactionManagement
@Configuration
//扫描dao或者是Mapper接口
@MapperScan("com.yoo.order.mapper")
public class MybatisPlusConfig {

	/**
	 * mybatis-plus 分页插件
	 */
	@Bean
	public PaginationInterceptor paginationInterceptor() {
		PaginationInterceptor page = new PaginationInterceptor();
		page.setDialectType("mysql");
		return page;
	}
}

