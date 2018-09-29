package com.yoo.order.service.impl;

import com.yoo.order.entity.UserInfo;
import com.yoo.order.mapper.UserInfoMapper;
import com.yoo.order.service.IUserInfoService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户信息 服务实现类
 * </p>
 *
 * @author Yoo.biao
 * @since 2018-09-27
 */
@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements IUserInfoService {
	
}
