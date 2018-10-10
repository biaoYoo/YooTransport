package com.yoo.capacity.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;

/**
 * <p>
 * 司机
 * </p>
 *
 * @author Yoo.biao
 * @since 2018-09-27
 */
@TableName("driver_info")
public class DriverInfo extends Model<DriverInfo> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId("driver_id")
	private String driverId;
    /**
     * 承运商主键
     */
	@TableField("carrier_id")
	private String carrierId;
    /**
     * 用户主键
     */
	@TableField("user_id")
	private String userId;
    /**
     * 名称
     */
	@TableField("driver_name")
	private String driverName;


	public String getDriverId() {
		return driverId;
	}

	public void setDriverId(String driverId) {
		this.driverId = driverId;
	}

	public String getCarrierId() {
		return carrierId;
	}

	public void setCarrierId(String carrierId) {
		this.carrierId = carrierId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	@Override
	protected Serializable pkVal() {
		return this.driverId;
	}

}
