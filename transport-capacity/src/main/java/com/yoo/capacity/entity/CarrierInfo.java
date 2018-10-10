package com.yoo.capacity.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;

/**
 * <p>
 * 承运商
 * </p>
 *
 * @author Yoo.biao
 * @since 2018-09-27
 */
@TableName("carrier_info")
public class CarrierInfo extends Model<CarrierInfo> {

	private static final long serialVersionUID = 1L;

	/**
	 * 承运商主键
	 */
	@TableId("carrier_id")
	private String carrierId;
	/**
	 * 用户主键
	 */
	@TableField("user_id")
	private String userId;
	/**
	 * 名称
	 */
	@TableField("carrier_name")
	private String carrierName;
	/**
	 * 类型
	 */
	@TableField("carrier_type")
	private Integer carrierType;
	/**
	 * 父级主键
	 */
	@TableField("parent_id")
	private String parentId;

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

	public String getCarrierName() {
		return carrierName;
	}

	public void setCarrierName(String carrierName) {
		this.carrierName = carrierName;
	}

	public Integer getCarrierType() {
		return carrierType;
	}

	public void setCarrierType(Integer carrierType) {
		this.carrierType = carrierType;
	}

	public String getParentId() {
		return parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	@Override
	protected Serializable pkVal() {
		return this.carrierId;
	}

}
