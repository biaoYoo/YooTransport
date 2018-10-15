package com.yoo.order.service.impl;

import com.yoo.order.entity.OrderInfo;
import com.yoo.order.mapper.OrderInfoMapper;
import com.yoo.order.service.IOrderInfoService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * <p>
 * 订单信息 服务实现类
 * </p>
 *
 * @author Yoo.biao
 * @since 2018-09-27
 */
@Service
public class OrderInfoServiceImpl extends ServiceImpl<OrderInfoMapper, OrderInfo> implements IOrderInfoService {

}
