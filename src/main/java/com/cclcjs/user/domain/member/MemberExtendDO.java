package com.cclcjs.user.domain.member;

/**
 * 会员扩展对象
 * 
 * @author jianjun.wang
 * 
 */
public class MemberExtendDO {

    private Long eid;// 主键

    private Long mid;// 账户表ID

    private String dataField;// 数据字段

    private String dataValue;// 数值

    private String insertTime;// 插入时间

    private String lastUpdateTime;// 最后修改时间

    /**
     * 构造方法
     * 
     * @param eid
     *            主键
     * @param uid
     *            账户表ID
     * @param dataField
     *            数据字段
     * @param dataValue
     *            数据数值
     * @param insertTime
     *            插入时间
     */
    public MemberExtendDO(Long eid, Long mid, String dataField, String dataValue, String insertTime, String lastUpdateTime) {
        super();
        this.eid = eid;
        this.mid = mid;
        this.dataField = dataField;
        this.dataValue = dataValue;
        this.insertTime = insertTime;
        this.lastUpdateTime = lastUpdateTime;
    }

    /**
     * 构造方法
     */
    public MemberExtendDO() {
        super();
    }

    public Long getEid() {
        return eid;
    }

    public void setEid(Long eid) {
        this.eid = eid;
    }

    public Long getMid() {
        return mid;
    }

    public void setMid(Long mid) {
        this.mid = mid;
    }

    public String getDataField() {
        return dataField;
    }

    public void setDataField(String dataField) {
        this.dataField = dataField;
    }

    public String getDataValue() {
        return dataValue;
    }

    public void setDataValue(String dataValue) {
        this.dataValue = dataValue;
    }

    public String getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(String insertTime) {
        this.insertTime = insertTime;
    }

    public String getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(String lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    @Override
    public String toString() {
        return "MemberExtendDO [eid=" + eid + ", mid=" + mid + ", dataField=" + dataField + ", dataValue=" + dataValue + ", insertTime=" + insertTime
                + ", lastUpdateTime=" + lastUpdateTime + "]";
    }
}
