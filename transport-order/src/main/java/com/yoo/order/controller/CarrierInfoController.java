package com.yoo.order.controller;

import com.baomidou.mybatisplus.plugins.Page;
import com.yoo.order.entity.CarrierInfo;
import com.yoo.order.service.ICarrierInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 承运商 前端控制器
 * </p>
 *
 * @author Yoo.biao
 * @since 2018-09-27
 */
@RestController
@RequestMapping("/order/carrierInfo")
public class CarrierInfoController {

	@Autowired
	private ICarrierInfoService carrierInfoService;

	@GetMapping("/hello")
	public Object getUserInfo(String userId) {
		return carrierInfoService.selectById(userId);
	}

	@GetMapping("/list")
	public Object list(String name) {
		Page<CarrierInfo> page = new Page<>(1, 3);
		return carrierInfoService.selectById(1);
	}

}
