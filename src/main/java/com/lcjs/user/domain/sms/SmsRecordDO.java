package com.lcjs.user.domain.sms;

/**
 * 短信记录
 * 
 * @author jianjun.wang
 * 
 */
public class SmsRecordDO {
	private Long id;// 主键
	private String mobiles;// 手机号码
	private String content;//内容
	private Integer status;// 状态码
	private String createTime;// 创建时间
	
	/**
	 * 构造方法
	 * @param id 主键
	 * @param mobiles 手机号码
	 * @param content 内容
	 * @param status 状态码
	 * @param createTime 创建时间
	 */
	public SmsRecordDO(Long id, String mobiles, String content, Integer status,
			String createTime) {
		super();
		this.id = id;
		this.mobiles = mobiles;
		this.content = content;
		this.status = status;
		this.createTime = createTime;
	}
	/**
	 * 构造方法
	 */
	public SmsRecordDO() {
		super();
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMobiles() {
		return mobiles;
	}

	public void setMobiles(String mobiles) {
		this.mobiles = mobiles;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
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
		return "SmsRecordDO [id=" + id + ", mobiles=" + mobiles + ", content="
				+ content + ", status=" + status + ", createTime=" + createTime
				+ "]";
	}
}
