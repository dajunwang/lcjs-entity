package com.lcjs.user.domain.safehistory;

public class SafeHistoryDO {
	private int shId;// shId
	private int mid;// mid
	private int shType;// 设定类型1:手机 2：邮箱
	private String shName;// 手机号/邮箱
	private String enterTime;// 填写时间
	private String identifyCode;// 验证码
	private String startTime;// 开始时间
	private String endTime;// 完成时间
	private Long lTime;// 有效时长
	private String remark;// 备注
	private int status;// 1：有效 0：无效

	public int getShId() {
		return shId;
	}

	public void setShId(int shId) {
		this.shId = shId;
	}

	public int getMid() {
		return mid;
	}

	public void setMid(int mid) {
		this.mid = mid;
	}

	public int getShType() {
		return shType;
	}

	public void setShType(int shType) {
		this.shType = shType;
	}

	public String getShName() {
		return shName;
	}

	public void setShName(String shName) {
		this.shName = shName;
	}

	public String getEnterTime() {
		return enterTime;
	}

	public void setEnterTime(String enterTime) {
		this.enterTime = enterTime;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public Long getlTime() {
		return lTime;
	}

	public void setlTime(Long lTime) {
		this.lTime = lTime;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getIdentifyCode() {
		return identifyCode;
	}

	public void setIdentifyCode(String identifyCode) {
		this.identifyCode = identifyCode;
	}
}
