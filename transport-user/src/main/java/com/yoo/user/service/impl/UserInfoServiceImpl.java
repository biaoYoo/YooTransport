package com.yoo.user.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.yoo.user.entity.UserInfo;
import com.yoo.user.mapper.UserInfoMapper;
import com.yoo.user.service.IUserInfoService;
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
