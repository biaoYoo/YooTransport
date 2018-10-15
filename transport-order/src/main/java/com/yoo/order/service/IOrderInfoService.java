package com.yoo.order.service;

import com.baomidou.mybatisplus.service.IService;
import com.yoo.order.entity.OrderInfo;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * <p>
 * 订单信息 服务类
 * </p>
 *
 * @author Yoo.biao
 * @since 2018-09-27
 */
public interface IOrderInfoService extends IService<OrderInfo> {


}
