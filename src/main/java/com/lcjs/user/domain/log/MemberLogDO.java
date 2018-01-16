package com.lcjs.user.domain.log;

/**
 * 名师登录日志
 * 
 * @author jianjun.wang
 * 
 */
public class MemberLogDO {

    private Long id;// 主键

    private Long mid;// 用户ID

    private String adddate;// 记录日期

    private String ip;// ip地址

    private String version;// 版本信息

    private Integer source;// 来源(10 web,20 andorid,30 ios)

    private Integer sourceApp;// 0 网络教辅 1 天天象上 2 智能教辅 3 名师辅导 4 名校好卷 5 错题笔记 6 天天扫题 7 微课评审中心 8 名师云平台 9天天录课 10天天录课编辑器

    private String type;// 日志类型

    /**
     * 构造方法
     * 
     * @param id
     *            主键
     * @param mid
     *            用户ID
     * @param adddate
     *            记录日期
     * @param ip
     *            ip地址
     * @param version
     *            版本信息
     * @param source
     *            来源(10 web,20 andorid,30 ios)
     * @param sourceApp
     *            0 网络教辅 1 天天象上 2 智能教辅 3 名师辅导 4 名校好卷 5 错题笔记 6 天天扫题 7 微课评审中心 8 名师云平台 9天天录课 10天天录课编辑器
     */
    public MemberLogDO(Long id, Long mid, String adddate, String ip, String version, Integer source, Integer sourceApp) {
        super();
        this.id = id;
        this.mid = mid;
        this.adddate = adddate;
        this.ip = ip;
        this.version = version;
        this.source = source;
        this.sourceApp = sourceApp;
    }

    /**
     * 构造方法
     */
    public MemberLogDO() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMid() {
        return mid;
    }

    public void setMid(Long mid) {
        this.mid = mid;
    }

    public String getAdddate() {
        return adddate;
    }

    public void setAdddate(String adddate) {
        this.adddate = adddate;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "MemberLogDO [id=" + id + ", mid=" + mid + ", adddate=" + adddate + ", ip=" + ip + ", version=" + version + ", source=" + source
                + ", sourceApp=" + sourceApp + ",type=" + type + "]";
    }
}
