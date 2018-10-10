package com.yoo.capacity.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.yoo.capacity.entity.DriverInfo;
import com.yoo.capacity.mapper.DriverInfoMapper;
import com.yoo.capacity.service.IDriverInfoService;
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
