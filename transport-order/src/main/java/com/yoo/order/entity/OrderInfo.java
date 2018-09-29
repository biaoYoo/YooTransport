package com.yoo.order.entity;

import java.math.BigDecimal;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 订单信息
 * </p>
 *
 * @author Yoo.biao
 * @since 2018-09-27
 */
@TableName("order_info")
public class OrderInfo extends Model<OrderInfo> {

    private static final long serialVersionUID = 1L;

    /**
     * 运单主键
     */
    @TableId("order_id")
	private String orderId;
    /**
     * 主键
     */
	@TableField("driver_id")
	private String driverId;
    /**
     * 运单号
     */
	@TableField("order_number")
	private String orderNumber;
    /**
     * 创建时间
     */
	@TableField("create_date")
	private Date createDate;
    /**
     * 订单类型
     */
	@TableField("order_type")
	private Integer orderType;
    /**
     * 重量
     */
	private BigDecimal weight;


	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getDriverId() {
		return driverId;
	}

	public void setDriverId(String driverId) {
		this.driverId = driverId;
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Integer getOrderType() {
		return orderType;
	}

	public void setOrderType(Integer orderType) {
		this.orderType = orderType;
	}

	public BigDecimal getWeight() {
		return weight;
	}

	public void setWeight(BigDecimal weight) {
		this.weight = weight;
	}

	@Override
	protected Serializable pkVal() {
		return this.orderId;
	}

}
