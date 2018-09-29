package com.yoo.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author yub
 * @describe talk something
 * @date 2018/9/11 00119:55
 */
@RestController
public class TestController {

	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/add")
	public String add(String string) {
		return restTemplate.getForEntity("http://CalculatorServer/getInfo",String.class).getBody();
	}
}
