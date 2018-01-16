package com.lcjs.user.domain.scancode;

import java.util.Date;

import com.lcjs.user.domain.base.BaseQuery;
/**
 * 生成二维码批次持久化类
 * @author jianjun.wang
 *
 */
public class CodeBatchDO extends BaseQuery{

	 /** ID **/
    private int batchId;

    /** 名称 **/
    private String batchName;

    /** 批次描述 **/
    private String batchDesc;

    /** 数量 **/
    private int codeNum;

    /** 创建时间 **/
    private Date createTime;

    /** 创建人 **/
    private int createId;

    /** 生效状态 1：生效，0：失效 **/
    private int status;

	public int getBatchId() {
		return batchId;
	}

	public void setBatchId(int batchId) {
		this.batchId = batchId;
	}

	public String getBatchName() {
		return batchName;
	}

	public void setBatchName(String batchName) {
		this.batchName = batchName;
	}

	public String getBatchDesc() {
		return batchDesc;
	}

	public void setBatchDesc(String batchDesc) {
		this.batchDesc = batchDesc;
	}

	public int getCodeNum() {
		return codeNum;
	}

	public void setCodeNum(int codeNum) {
		this.codeNum = codeNum;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public int getCreateId() {
		return createId;
	}

	public void setCreateId(int createId) {
		this.createId = createId;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

   
}
