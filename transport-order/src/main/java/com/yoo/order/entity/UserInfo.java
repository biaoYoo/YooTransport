package com.yoo.order.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 用户信息
 * </p>
 *
 * @author Yoo.biao
 * @since 2018-09-27
 */
@TableName("user_info")
public class UserInfo extends Model<UserInfo> {

    private static final long serialVersionUID = 1L;

    /**
     * 用户主键
     */
    @TableId("user_id")
	private String userId;
    /**
     * 用户名称
     */
	@TableField("user_name")
	private String userName;

    /**
     * 登录账号
     */
	private String account;
    /**
     * 密码
     */
	private String password;


	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	protected Serializable pkVal() {
		return this.userId;
	}

}
