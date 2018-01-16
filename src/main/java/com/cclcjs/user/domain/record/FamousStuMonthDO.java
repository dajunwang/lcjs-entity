package com.cclcjs.user.domain.record;


/**
 * 名师月度新增学生数量
 * 
 * @author jianjun.wang
 * 
 */
public class FamousStuMonthDO {


	private Integer fmid;// 教师ID
	private String ym;// 年月
	private Integer cn;// 数量

	/**
	 * 构造方法
	 * 
	 * @param fmid
	 *            教师ID
	 * @param ym
	 *            年月
	 * @param cn
	 *            数量
	 */
	public FamousStuMonthDO(Integer fmid, String ym, Integer cn) {
		super();
		this.fmid = fmid;
		this.ym = ym;
		this.cn = cn;
	}

	/**
	 * 构造方法
	 */
	public FamousStuMonthDO() {
		super();
	}

	public Integer getFmid() {
		return fmid;
	}

	public void setFmid(Integer fmid) {
		this.fmid = fmid;
	}

	public String getYm() {
		return ym;
	}

	public void setYm(String ym) {
		this.ym = ym;
	}

	public Integer getCn() {
		return cn;
	}

	public void setCn(Integer cn) {
		this.cn = cn;
	}

	@Override
	public String toString() {
		return "FamousStuMonthDO [fmid=" + fmid + ", ym=" + ym + ", cn=" + cn
				+ "]";
	}

}
