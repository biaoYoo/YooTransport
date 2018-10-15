package com.yoo.order.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author yub
 * @describe talk something
 * @date 2018/10/11 001111:36
 */
@FeignClient(value = "provider-capacity")
public interface OrderInfoService {

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	String sayHello(@RequestParam("userId") String userId);

}
