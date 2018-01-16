package com.cclcjs.user.domain.access;

/**
 * 第三方接入token
 * 
 * @author jianjun.wang
 * 
 */
public class AccessTokenDO {
	private Integer id;// 主键
	private String token;// 获取登录令牌
	private String name;// 接入第三方的名称
	private String remark;// 备注
	private Integer status;// 状态 1:有效,0:无效
	private String createTime;// 创建时间

	/**
	 * 构造方法
	 * 
	 * @param id
	 *            主键
	 * @param token
	 *            获取登录令牌
	 * @param name
	 *            接入第三方的名称
	 * @param remark
	 *            备注
	 * @param status
	 *            状态 1:有效,0:无效
	 * @param createTime
	 *            创建时间
	 */
	public AccessTokenDO(Integer id, String token, String name, String remark,
			Integer status, String createTime) {
		super();
		this.id = id;
		this.token = token;
		this.name = name;
		this.remark = remark;
		this.status = status;
		this.createTime = createTime;
	}

	/**
	 * 构造方法
	 */
	public AccessTokenDO() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	@Override
	public String toString() {
		return "AccessTokenDO [id=" + id + ", token=" + token + ", name="
				+ name + ", remark=" + remark + ", status=" + status
				+ ", createTime=" + createTime + "]";
	}
}
