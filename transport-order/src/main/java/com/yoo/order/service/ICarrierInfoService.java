package com.yoo.order.service;

import com.baomidou.mybatisplus.service.IService;
import com.yoo.order.entity.CarrierInfo;

/**
 * <p>
 * 承运商 服务类
 * </p>
 *
 * @author Yoo.biao
 * @since 2018-09-27
 */
public interface ICarrierInfoService extends IService<CarrierInfo> {

	/**
	 * 功能描述: 条件查询
	 *
	 * @auther: YooB
	 * @date: 2018/9/27 0027 17:30
	 */
	CarrierInfo selectCarrier(String name);
}
