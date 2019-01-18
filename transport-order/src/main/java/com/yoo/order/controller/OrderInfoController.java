package com.yoo.order.controller;

import com.yoo.order.service.OrderInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 订单信息 前端控制器
 * </p>
 *
 * @author Yoo.biao
 * @since 2018-09-27
 */
@RestController
public class OrderInfoController {

	@Autowired
	private OrderInfoService orderInfoService;

	@RequestMapping("/hi")
	public Object sayHi(String name) {
		return orderInfoService.sayHello(name);
	}

}
