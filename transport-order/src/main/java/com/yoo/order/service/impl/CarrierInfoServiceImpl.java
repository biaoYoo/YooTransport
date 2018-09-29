package com.yoo.order.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.yoo.order.entity.CarrierInfo;
import com.yoo.order.mapper.CarrierInfoMapper;
import com.yoo.order.service.ICarrierInfoService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 承运商 服务实现类
 * </p>
 *
 * @author Yoo.biao
 * @since 2018-09-27
 */
@Service
public class CarrierInfoServiceImpl extends ServiceImpl<CarrierInfoMapper, CarrierInfo> implements ICarrierInfoService {

	@Override
	public CarrierInfo selectCarrier(String name) {
		/*
		 * 实体带查询使用方法  输出看结果
		 */
		EntityWrapper<CarrierInfo> ew = new EntityWrapper<>();
		ew.where("carrier_name={0}", name);
		baseMapper.selectMaps(ew);
		return ew.getEntity();
	}
}
