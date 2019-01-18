package com.config.config.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yub
 * @describe talk something
 * @date 2019/1/17 001715:32
 */
@RestController
public class HelloController {

	@GetMapping("hello")
	public String getHello() {
		return "hello";
	}

}
