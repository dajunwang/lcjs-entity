package com.lcjs.user.domain.record;


public class RecordFamousPreviewDO {
	private Integer id;// 主键
	private Integer fmid;// 教师ID
	private Integer umid;// 用户ID
	private String ipAddress;// IP地址
	private Integer source;// 来源
	private String createTime;// 插入时间
	private String uvTag;// uv标识

	/**
	 * 构造方法
	 * 
	 * @param id
	 *            主键
	 * @param fmid
	 *            教师ID
	 * @param umid
	 *            用户ID
	 * @param ipAddress
	 *            IP地址
	 * @param source 来源
	 * @param create_time
	 *            插入时间
	 * @param uv_tag
	 */
	public RecordFamousPreviewDO(Integer id, Integer fmid, Integer umid,
			String ipAddress, Integer source, String createTime, String uvTag) {
		super();
		this.id = id;
		this.fmid = fmid;
		this.umid = umid;
		this.ipAddress = ipAddress;
		this.source = source;
		this.createTime = createTime;
		this.uvTag = uvTag;
	}

	/**
	 * 构造方法
	 */
	public RecordFamousPreviewDO() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getFmid() {
		return fmid;
	}

	public void setFmid(Integer fmid) {
		this.fmid = fmid;
	}

	public Integer getUmid() {
		return umid;
	}

	public void setUmid(Integer umid) {
		this.umid = umid;
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public Integer getSource() {
		return source;
	}

	public void setSource(Integer source) {
		this.source = source;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	
	public String getUvTag() {
		return uvTag;
	}

	public void setUvTag(String uvTag) {
		this.uvTag = uvTag;
	}

	@Override
	public String toString() {
		return "RecordFamousPreviewDO [id=" + id + ", fmid=" + fmid + ", umid="
				+ umid + ", ipAddress=" + ipAddress + ", source=" + source
				+ ", createTime=" + createTime + ", uvTag=" + uvTag + "]";
	}
}
