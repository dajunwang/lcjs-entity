package com.cclcjs.user.domain.user;

/**
 * 用户DO
 * 
 * @author jianjun.wang
 * 
 */
public class UserDO {

	private static final long serialVersionUID = 1L;

	/** 会员id */
	private Integer mid;
	/** 会员用户名 */
	private String loginName;
	/** 会员密码 */
	private String password;
	/** 会员email */
	private String email;
	/** 会员类型 1学生 2普通老师3开讲名师 4 邀请中名师 5 名师助理 6待开放名师 */
	private Integer mtype;
	/** 用户昵称 */
	private String nickname;
	/** 真实姓名 */
	private String realName;
	/** 手机号 **/
	private String mmobile;

	private String ipAddress;// 注册ip地址

	private String phone;// 电话

	private String qq;// QQ

	private String photopath;// 头像

	private int sex;// 性别

	private int areaId;// 用户地区

	private int cityId;// 城市

	private String address;// 用户详细地址

	private String registdate;// 注册时间

	private String school;// 用户学校

	private String birthday;// 出生日期

	private String subject;// 用户科目

	private int gradeId;// 用户年级

	private String remark;// 备注

	private String teachBook;// 课本

	private int source;// 注册来源
	private int education;// 所在学段 1 初中 2高中
	private int currentEdu;// 当前学段

	private int schoolId;// 学校Id
	private int registerType;// 注册类型 1 手机用户 2 邮箱用户(弃用)
	private int registerApp;// 注册产品 0 网络教辅 1 天天象上 2 智能教辅 3 名师辅导 4 名校好卷 5 错题笔记 6
							// 天天扫题
	private int registerModule;// 注册模块 0 正常注册 1 学习码
	private int status = 1;// 状态 1 有效 0 锁定
	private String science;// 学科
	private int sysType;
	private String message;// 名师寄语 --不需要维护
	private Integer ischange;
	private Integer msctpass = 0;// 是否跳过名师辅导首页(弃用)
	private String modifyTime;// 最后修改时间
	private Integer differentStatus = 0;// 区分数据来源 默认是0,1是后台刷的
	private String appChannel;// 渠道--只针对移动APP，PC和web无无渠道号，默认0
	private String whitelist;
	private Integer abnormal;
	private Integer abnormal2;

	/**
	 * 构造方法
	 * 
	 * @param mid
	 *            会员id
	 * @param loginName
	 *            会员用户名
	 * @param password
	 *            会员密码
	 * @param email
	 *            会员email
	 * @param mtype
	 *            会员类型 1学生 2普通老师3开讲名师 4 邀请中名师 5 名师助理 6待开放名师
	 * @param nickname
	 *            用户昵称
	 * @param realName
	 *            真实姓名
	 * @param mobile
	 *            手机号
	 * @param ipAddress
	 *            注册ip地址
	 * @param phone
	 *            电话
	 * @param qq
	 *            QQ
	 * @param photoPath
	 *            头像
	 * @param sex
	 *            性别
	 * @param areaId
	 *            用户地区
	 * @param city
	 *            城市
	 * @param uAddress
	 *            用户详细地址
	 * @param uRegistdate
	 *            注册时间
	 * @param school
	 *            用户学校
	 * @param birthday
	 *            出生日期
	 * @param subject
	 *            用户科目
	 * @param grade
	 *            用户年级
	 * @param remark
	 *            备注
	 * @param source
	 *            注册来源
	 * @param education
	 *            所在学段 1 初中 2高中
	 * @param currentEdu
	 * @param schoolId
	 *            学校Id
	 * @param registerType
	 *            注册类型 1 手机用户 2 邮箱用户
	 * @param registerApp
	 *            注册产品 0 网络教辅 1 天天象上 2 智能教辅 3 名师辅导 4 名校好卷 5 错题笔记 6 天天扫题
	 * @param registerModule
	 *            注册模块 0 正常注册 1 学习码
	 * @param channel
	 *            渠道--只针对移动APP，PC和web无无渠道号，默认0
	 * @param status
	 *            状态 1 有效 0 锁定
	 */
	public UserDO(Integer mid, String loginName, String password, String email,
			Integer mtype, String nickname, String realName, String mmobile,
			String ipAddress, String phone, String qq, String photopath,
			int sex, int areaId, int cityId, String address, String registdate,
			String school, String birthday, String subject, int gradeId,
			String remark, int source, int education, int currentEdu,
			int schoolId, int registerType, int registerApp,
			int registerModule, String appChannel, int status) {
		super();
		this.mid = mid;
		this.loginName = loginName;
		this.password = password;
		this.email = email;
		this.mtype = mtype;
		this.nickname = nickname;
		this.realName = realName;
		this.mmobile = mmobile;
		this.ipAddress = ipAddress;
		this.phone = phone;
		this.qq = qq;
		this.photopath = photopath;
		this.sex = sex;
		this.areaId = areaId;
		this.cityId = cityId;
		this.address = address;
		this.registdate = registdate;
		this.school = school;
		this.birthday = birthday;
		this.subject = subject;
		this.gradeId = gradeId;
		this.remark = remark;
		this.source = source;
		this.education = education;
		this.currentEdu = currentEdu;
		this.schoolId = schoolId;
		this.registerType = registerType;
		this.registerApp = registerApp;
		this.registerModule = registerModule;
		this.appChannel = appChannel;
		this.status = status;
	}

	/**
	 * 构造方法
	 */
	public UserDO() {
		super();
	}

	public Integer getMid() {
		return mid;
	}

	public void setMid(Integer mid) {
		this.mid = mid;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getMtype() {
		return mtype;
	}

	public void setMtype(Integer mtype) {
		this.mtype = mtype;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getQq() {
		return qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public String getPhotopath() {
		return photopath;
	}

	public void setPhotopath(String photopath) {
		this.photopath = photopath;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public int getAreaId() {
		return areaId;
	}

	public void setAreaId(int areaId) {
		this.areaId = areaId;
	}

	public int getCityId() {
		return cityId;
	}

	public void setCityId(int cityId) {
		this.cityId = cityId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getRegistdate() {
		return registdate;
	}

	public void setRegistdate(String registdate) {
		this.registdate = registdate;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getGradeId() {
		return gradeId;
	}

	public void setGradeId(int gradeId) {
		this.gradeId = gradeId;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public int getSource() {
		return source;
	}

	public void setSource(int source) {
		this.source = source;
	}

	public int getEducation() {
		return education;
	}

	public void setEducation(int education) {
		this.education = education;
	}

	public int getCurrentEdu() {
		return currentEdu;
	}

	public void setCurrentEdu(int currentEdu) {
		this.currentEdu = currentEdu;
	}

	public int getSchoolId() {
		return schoolId;
	}

	public void setSchoolId(int schoolId) {
		this.schoolId = schoolId;
	}

	public int getRegisterType() {
		return registerType;
	}

	public void setRegisterType(int registerType) {
		this.registerType = registerType;
	}

	public int getRegisterApp() {
		return registerApp;
	}

	public void setRegisterApp(int registerApp) {
		this.registerApp = registerApp;
	}

	public int getRegisterModule() {
		return registerModule;
	}

	public void setRegisterModule(int registerModule) {
		this.registerModule = registerModule;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public int getSysType() {
		return sysType;
	}

	public void setSysType(int sysType) {
		this.sysType = sysType;
	}

	public String getMmobile() {
		return mmobile;
	}

	public void setMmobile(String mmobile) {
		this.mmobile = mmobile;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getTeachBook() {
		return teachBook;
	}

	public void setTeachBook(String teachBook) {
		this.teachBook = teachBook;
	}

	public String getScience() {
		return science;
	}

	public void setScience(String science) {
		this.science = science;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getIschange() {
		return ischange;
	}

	public void setIschange(Integer ischange) {
		this.ischange = ischange;
	}

	public Integer getMsctpass() {
		return msctpass;
	}

	public void setMsctpass(Integer msctpass) {
		this.msctpass = msctpass;
	}

	public String getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(String modifyTime) {
		this.modifyTime = modifyTime;
	}

	public Integer getDifferentStatus() {
		return differentStatus;
	}

	public void setDifferentStatus(Integer differentStatus) {
		this.differentStatus = differentStatus;
	}

	public String getAppChannel() {
		return appChannel;
	}

	public void setAppChannel(String appChannel) {
		this.appChannel = appChannel;
	}

	public String getWhitelist() {
		return whitelist;
	}

	public void setWhitelist(String whitelist) {
		this.whitelist = whitelist;
	}

	public Integer getAbnormal() {
		return abnormal;
	}

	public void setAbnormal(Integer abnormal) {
		this.abnormal = abnormal;
	}

	public Integer getAbnormal2() {
		return abnormal2;
	}

	public void setAbnormal2(Integer abnormal2) {
		this.abnormal2 = abnormal2;
	}

	@Override
	public String toString() {
		return "UserDO [mid=" + mid + ", loginName=" + loginName
				+ ", password=" + password + ", email=" + email + ", mtype="
				+ mtype + ", nickname=" + nickname + ", realName=" + realName
				+ ", mmobile=" + mmobile + ", ipAddress=" + ipAddress
				+ ", phone=" + phone + ", qq=" + qq + ", photopath="
				+ photopath + ", sex=" + sex + ", areaId=" + areaId
				+ ", cityId=" + cityId + ", address=" + address
				+ ", registdate=" + registdate + ", school=" + school
				+ ", birthday=" + birthday + ", subject=" + subject
				+ ", gradeId=" + gradeId + ", remark=" + remark
				+ ", teachBook=" + teachBook + ", source=" + source
				+ ", education=" + education + ", currentEdu=" + currentEdu
				+ ", schoolId=" + schoolId + ", registerType=" + registerType
				+ ", registerApp=" + registerApp + ", registerModule="
				+ registerModule + ", status=" + status + ", science="
				+ science + ", sysType=" + sysType + ", message=" + message
				+ ", ischange=" + ischange + ", msctpass=" + msctpass
				+ ", modifyTime=" + modifyTime + ", differentStatus="
				+ differentStatus + ", appChannel=" + appChannel
				+ ", whitelist=" + whitelist + ", abnormal=" + abnormal
				+ ", abnormal2=" + abnormal2 + "]";
	}
}
