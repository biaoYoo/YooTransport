package com.yoo.order;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yub
 * @describe talk something
 * @date 2018/9/11 00119:55
 */
@RestController
public class TestController {

	@GetMapping("/add")
	public String add(String string) {
		return string;
	}
}
