package com.yoo.capacity;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * @author yub
 * @describe talk something
 * @date 2018/9/11 001116:34
 */
public class ApplicationStart extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(ApplicationStart.class);
	}

}
