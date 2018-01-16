package com.cclcjs.user.domain.member;

/**
 * 
 * 统一账户DO
 * 
 * @author jianjun.wang
 * 
 */
public class MemberDO {

	private Long mid;// 账户ID
	private String loginname;// 登录名
	private String password;// 密码
	private String nickname;// 昵称
	private String realname;// 真实姓名
	private String photopath;// 头像
	private Integer sex;// 性别
	private String mobile;// 手机号码
	private String email;// 邮箱
	private Integer schoolId;// 学校ID
	private Integer educational;// 学段ID
	private String birthday;// 生日
	private Integer ischange;// 是否改变
	private String channel;// 渠道
	private Integer status;// 状态(1:有效,0:无效)
	private Integer provinceId;// 省份ID
	private Integer cityId;// 城市
	private Integer countryId;// 区县
	private String address;// 通讯地址
	private String registerTime;// 注册时间
	private String modifyTime;// 修改时间
	private Integer authority;// 权限
	private Integer istest=0;// 是否测试账户
	private Integer differentStatus=0;// 区分数据来源 默认是0,1是后台刷的
	private Integer source;// 注册来源
	private Integer sourceApp;// 注册入口
	private String qq;// qq
	private Integer gradeId;// 年级
	private Integer registerType;// 注册类型 1:学生,2:老师,4:工作室
	private String remark;// 备注
	private Integer abnormal;// 活动刷数据字段
	private Integer abnormal2;// 活动刷数据字段
	private String science;
	private String subject;// 学科
	private Integer uid;// 旧学生/老师ID
	private Integer type;// 类型
	private String weChat;// 微信

	/**
	 * 构造方法
	 * 
	 * @param mid
	 *            账户ID
	 * @param loginname
	 *            登录名
	 * @param password
	 *            密码
	 * @param nickname
	 *            昵称
	 * @param realname
	 *            真实姓名
	 * @param photoPath
	 *            头像
	 * @param sex
	 *            性别
	 * @param mobile
	 *            手机号码
	 * @param email
	 *            邮箱
	 * @param schoolId
	 *            学校id
	 * @param educational
	 *            学段ID
	 * @param birthday
	 *            生日
	 * @param ischange
	 *            是否改变(静态化时候用到)
	 * @param channel
	 *            渠道
	 * @param status
	 *            状态
	 * @param provinceId
	 *            省
	 * @param cityId
	 *            市
	 * @param countryId
	 *            区县
	 * @param address
	 *            通讯地址
	 * @param registerTime
	 *            注册时间
	 * @param modifiyTime
	 *            修改时间
	 * @param authority
	 *            权限
	 * @param isTest
	 *            是否测试账户
	 * @param differentStatus
	 *            区分数据来源 默认是0,1是后台刷的
	 * @param source
	 *            注册来源
	 * @param sourceApp
	 *            注册入口
	 * @param qq
	 *            qq
	 * @param weChat
	 *            微信
	 * @param subject 学科
	 */
	public MemberDO(Long mid, String loginname, String password,
			String nickname, String realname, String photopath, Integer sex,
			String mobile, String email, Integer schoolId, Integer educational,
			String birthday, Integer ischange, String channel, Integer status,
			Integer provinceId, Integer cityId, Integer countryId,
			String address, String registerTime, String modifyTime,
			Integer authority, Integer istest, Integer differentStatus,
			Integer source, Integer sourceApp, String qq, Integer gradeId,
			Integer registerType, Integer type, String weChat,String subject) {
		super();
		this.mid = mid;
		this.loginname = loginname;
		this.password = password;
		this.nickname = nickname;
		this.realname = realname;
		this.photopath = photopath;
		this.sex = sex;
		this.mobile = mobile;
		this.email = email;
		this.schoolId = schoolId;
		this.educational = educational;
		this.birthday = birthday;
		this.ischange = ischange;
		this.channel = channel;
		this.status = status;
		this.provinceId = provinceId;
		this.cityId = cityId;
		this.countryId = countryId;
		this.address = address;
		this.registerTime = registerTime;
		this.modifyTime = modifyTime;
		this.authority = authority;
		this.istest = istest;
		this.differentStatus = differentStatus;
		this.source = source;
		this.sourceApp = sourceApp;
		this.qq = qq;
		this.gradeId = gradeId;
		this.registerType = registerType;
		this.type = type;
		this.weChat = weChat;
		this.subject=subject;
	}

	// 构造方法
	public MemberDO() {
		super();
	}

	public Long getMid() {
		return mid;
	}

	public void setMid(Long mid) {
		this.mid = mid;
	}

	public String getLoginname() {
		return loginname;
	}

	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getRealname() {
		return realname;
	}

	public void setRealname(String realname) {
		this.realname = realname;
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getSchoolId() {
		return schoolId;
	}

	public void setSchoolId(Integer schoolId) {
		this.schoolId = schoolId;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public Integer getIschange() {
		return ischange;
	}

	public void setIschange(Integer ischange) {
		this.ischange = ischange;
	}

	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getProvinceId() {
		return provinceId;
	}

	public void setProvinceId(Integer provinceId) {
		this.provinceId = provinceId;
	}

	public Integer getCityId() {
		return cityId;
	}

	public void setCityId(Integer cityId) {
		this.cityId = cityId;
	}

	public Integer getCountryId() {
		return countryId;
	}

	public void setCountryId(Integer countryId) {
		this.countryId = countryId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getRegisterTime() {
		return registerTime;
	}

	public void setRegisterTime(String registerTime) {
		this.registerTime = registerTime;
	}

	public String getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(String modifyTime) {
		this.modifyTime = modifyTime;
	}

	public Integer getAuthority() {
		return authority;
	}

	public void setAuthority(Integer authority) {
		this.authority = authority;
	}

	public Integer getIstest() {
		return istest;
	}

	public void setIstest(Integer istest) {
	    if(istest==null) istest=0; 
		this.istest = istest;
	}

	public Integer getDifferentStatus() {
		return differentStatus;
	}

	public void setDifferentStatus(Integer differentStatus) {
		this.differentStatus = differentStatus;
	}

	public Integer getSource() {
		return source;
	}

	public void setSource(Integer source) {
		this.source = source;
	}

	public Integer getSourceApp() {
		return sourceApp;
	}

	public void setSourceApp(Integer sourceApp) {
		this.sourceApp = sourceApp;
	}

	public String getPhotopath() {
		return photopath;
	}

	public void setPhotopath(String photopath) {
		this.photopath = photopath;
	}

	public String getQq() {
		return qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public Integer getGradeId() {
		return gradeId;
	}

	public void setGradeId(Integer gradeId) {
		this.gradeId = gradeId;
	}

	public Integer getEducational() {
		return educational;
	}

	public void setEducational(Integer educational) {
		this.educational = educational;
	}

	public Integer getRegisterType() {
		return registerType;
	}

	public void setRegisterType(Integer registerType) {
		this.registerType = registerType;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
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

	public String getScience() {
		return science;
	}

	public void setScience(String science) {
		this.science = science;
	}

	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getWeChat() {
		return weChat;
	}

	public void setWeChat(String weChat) {
		this.weChat = weChat;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "MemberDO [mid=" + mid + ", loginname=" + loginname
				+ ", password=" + password + ", nickname=" + nickname
				+ ", realname=" + realname + ", photopath=" + photopath
				+ ", sex=" + sex + ", mobile=" + mobile + ", email=" + email
				+ ", schoolId=" + schoolId + ", educational=" + educational
				+ ", birthday=" + birthday + ", ischange=" + ischange
				+ ", channel=" + channel + ", status=" + status
				+ ", provinceId=" + provinceId + ", cityId=" + cityId
				+ ", countryId=" + countryId + ", address=" + address
				+ ", registerTime=" + registerTime + ", modifyTime="
				+ modifyTime + ", authority=" + authority + ", istest="
				+ istest + ", differentStatus=" + differentStatus + ", source="
				+ source + ", sourceApp=" + sourceApp + ", qq=" + qq
				+ ", gradeId=" + gradeId + ", registerType=" + registerType
				+ ", remark=" + remark + ", abnormal=" + abnormal
				+ ", abnormal2=" + abnormal2 + ", science=" + science
				+ ", subject=" + subject + ", uid=" + uid + ", type=" + type
				+ ", weChat=" + weChat + "]";
	}
}
