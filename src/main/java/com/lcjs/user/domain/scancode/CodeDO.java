package com.lcjs.user.domain.scancode;

import java.util.Date;

import com.lcjs.user.domain.base.BaseQuery;
/**
 * 二维码持久化类
 * @author jianjun.wang
 *
 */
public class CodeDO extends BaseQuery {

	 /** ID **/
    private int codeId;

    /** 编码 **/
    private String codeName;

    /** 标题-描述 **/
    private String codeDesc;

    /** url **/
    private String codePath;

    /** 创建时间 **/
    private Date createTime;

    /** 创建人 **/
    private int createId;

    /** 是否已使用，暂时无意义 **/
    private int usedType;
    
    /** 生效状态 1：生效，0：失效 **/
    private int status;

    public int getCodeId() {
        return codeId;
    }

    public void setCodeId(int codeId) {
        this.codeId = codeId;
    }

    public String getCodeName() {
        return codeName;
    }

    public void setCodeName(String codeName) {
        this.codeName = codeName;
    }

    public String getCodeDesc() {
        return codeDesc;
    }

    public void setCodeDesc(String codeDesc) {
        this.codeDesc = codeDesc;
    }

    public String getCodePath() {
        return codePath;
    }

    public void setCodePath(String codePath) {
        this.codePath = codePath;
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

    public int getUsedType() {
		return usedType;
	}

	public void setUsedType(int usedType) {
		this.usedType = usedType;
	}

	public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
