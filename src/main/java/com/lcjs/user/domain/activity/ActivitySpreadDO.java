package com.lcjs.user.domain.activity;

/**
 * 活动推广
 * 
 * @author jianjun.wang
 * 
 */
public class ActivitySpreadDO {
	private Integer id; // 主键
	private String token;// 邀请码
	private String invitName;// 邀请人姓名
	private String invitMobile;// 邀请人手机号
	private String invitEmail;// 邀请人邮箱
	private String createTime;// 数据创建时间

	/**
	 * 构造方法
	 * 
	 * @param id
	 *            主键
	 * @param token
	 *            邀请码
	 * @param invitName
	 *            邀请人姓名
	 * @param invitMobile
	 *            邀请人手机号
	 * @param invitEmail
	 *            邀请人邮箱
	 * @param createTime
	 *            数据创建时间
	 */
	public ActivitySpreadDO(Integer id, String token, String invitName,
			String invitMobile, String invitEmail, String createTime) {
		super();
		this.id = id;
		this.token = token;
		this.invitName = invitName;
		this.invitMobile = invitMobile;
		this.invitEmail = invitEmail;
		this.createTime = createTime;
	}

	/**
	 * 构造方法
	 */
	public ActivitySpreadDO() {
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

	public String getInvitName() {
		return invitName;
	}

	public void setInvitName(String invitName) {
		this.invitName = invitName;
	}

	public String getInvitMobile() {
		return invitMobile;
	}

	public void setInvitMobile(String invitMobile) {
		this.invitMobile = invitMobile;
	}

	public String getInvitEmail() {
		return invitEmail;
	}

	public void setInvitEmail(String invitEmail) {
		this.invitEmail = invitEmail;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	@Override
	public String toString() {
		return "ActivitySpreadDO [id=" + id + ", token=" + token
				+ ", invitName=" + invitName + ", invitMobile=" + invitMobile
				+ ", invitEmail=" + invitEmail + ", createTime=" + createTime
				+ "]";
	}

}
