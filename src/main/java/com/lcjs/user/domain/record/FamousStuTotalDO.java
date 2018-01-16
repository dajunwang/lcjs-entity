package com.lcjs.user.domain.record;


/**
 * 名师学生总数
 * @author jianjun.wang
 *
 */
public class FamousStuTotalDO {

	private Integer fmid;//教师ID
	private Integer cn;//数量

	/**
	 * 构造方法
	 * @param fmid 教师ID
	 * @param cn 数量
	 */
	public FamousStuTotalDO(Integer fmid, Integer cn) {
		super();
		this.fmid = fmid;
		this.cn = cn;
	}
	
	/**
	 * 构造方法
	 */
	public FamousStuTotalDO() {
		super();
	}



	public Integer getFmid() {
		return fmid;
	}

	public void setFmid(Integer fmid) {
		this.fmid = fmid;
	}


	public Integer getCn() {
		return cn;
	}

	public void setCn(Integer cn) {
		this.cn = cn;
	}

	@Override
	public String toString() {
		return "FamousStuTotalDO [fmid=" + fmid + ", cn=" + cn + "]";
	}
}
