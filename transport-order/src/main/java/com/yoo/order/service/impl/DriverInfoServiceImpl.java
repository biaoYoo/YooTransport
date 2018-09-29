package com.yoo.order.service.impl;

import com.yoo.order.entity.DriverInfo;
import com.yoo.order.mapper.DriverInfoMapper;
import com.yoo.order.service.IDriverInfoService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 司机 服务实现类
 * </p>
 *
 * @author Yoo.biao
 * @since 2018-09-27
 */
@Service
public class DriverInfoServiceImpl extends ServiceImpl<DriverInfoMapper, DriverInfo> implements IDriverInfoService {
	
}
