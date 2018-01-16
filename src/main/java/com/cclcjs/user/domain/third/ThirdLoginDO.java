package com.cclcjs.user.domain.third;

/**
 * 第三方登录
 * 
 * @author jianjun.wang
 * 
 */
public class ThirdLoginDO {

    private Integer id;// 主键

    private String authorkey; // 第三方登录唯一标识

    private Integer authorsource;// 第三方登录类型 1 qq登录 ，2 新浪微博 ，3 土豆 ，4其他

    private String thirdname;// 第三方昵称

    private String imageUrl;// 第三方头像

    private Integer gender;// 性别

    private String province;// 用户所在省级ID

    private String city;// 用户所在城市ID

    private String location;// 用户所在地

    private String homepage;// 用户博客地址

    private Integer mid;// 本地用户ID

    private Integer atype;// 用户类型

    private String dataTime;// 创建时间

    private Integer isBind;// 是否绑定 0未绑定 1绑定

    private String channel;// 渠道

    private String source;// 注册来源

    private String sourceApp;// 注册产品 0, 网络教辅 1, 天天象上 2, 智能教辅 3, 名师辅导 4, 名校好卷

    // 5,错题笔记 6
    /**
     * 构造方法
     * 
     * @param id
     *            主键
     * @param authorkey
     *            第三方登录唯一标识
     * @param authorsource
     *            第三方登录类型 1 qq登录 ，2 新浪微博 ，3 土豆 ，4其他
     * @param thirdname
     *            第三方昵称
     * @param imageUrl
     *            第三方头像
     * @param gender
     *            性别
     * @param province
     *            用户所在省级ID
     * @param city
     *            用户所在城市ID
     * @param location
     *            用户所在地
     * @param homepage
     *            用户博客地址
     * @param mid
     *            本地用户ID
     * @param atype
     *            用户类型
     * @param dataTime
     *            创建时间
     * @param isBind
     *            是否绑定 0未绑定 1绑定
     */
    public ThirdLoginDO(Integer id, String authorkey, Integer authorsource, String thirdname, String imageUrl, Integer gender, String province, String city,
            String location, String homepage, Integer mid, Integer atype, String dataTime, Integer isBind) {
        super();
        this.id = id;
        this.authorkey = authorkey;
        this.authorsource = authorsource;
        this.thirdname = thirdname;
        this.imageUrl = imageUrl;
        this.gender = gender;
        this.province = province;
        this.city = city;
        this.location = location;
        this.homepage = homepage;
        this.mid = mid;
        this.atype = atype;
        this.dataTime = dataTime;
        this.isBind = isBind;
    }

    /**
     * 构造方法
     */
    public ThirdLoginDO() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAuthorkey() {
        return authorkey;
    }

    public void setAuthorkey(String authorkey) {
        this.authorkey = authorkey;
    }

    public Integer getAuthorsource() {
        return authorsource;
    }

    public void setAuthorsource(Integer authorsource) {
        this.authorsource = authorsource;
    }

    public String getThirdname() {
        return thirdname;
    }

    public void setThirdname(String thirdname) {
        this.thirdname = thirdname;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getHomepage() {
        return homepage;
    }

    public void setHomepage(String homepage) {
        this.homepage = homepage;
    }

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public Integer getAtype() {
        return atype;
    }

    public void setAtype(Integer atype) {
        this.atype = atype;
    }

    public String getDataTime() {
        return dataTime;
    }

    public void setDataTime(String dataTime) {
        this.dataTime = dataTime;
    }

    public Integer getIsBind() {
        return isBind;
    }

    public void setIsBind(Integer isBind) {
        this.isBind = isBind;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getSourceApp() {
        return sourceApp;
    }

    public void setSourceApp(String sourceApp) {
        this.sourceApp = sourceApp;
    }

    @Override
    public String toString() {
        return "ThirdLoginDO [id=" + id + ", authorkey=" + authorkey + ", authorsource=" + authorsource + ", thirdname=" + thirdname + ", imageUrl=" + imageUrl
                + ", gender=" + gender + ", province=" + province + ", city=" + city + ", location=" + location + ", homepage=" + homepage + ", mid=" + mid
                + ", atype=" + atype + ", dataTime=" + dataTime + ", isBind=" + isBind + "]";
    }
}
