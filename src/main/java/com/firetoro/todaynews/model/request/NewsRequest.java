package com.firetoro.todaynews.model.request;

public class NewsRequest {

    private Integer iid;
    private String net; //网络类型
    private String appName; //app name
    private String channel; //渠道
    private Integer category; //分类
    private String osVersion; //操作系统版本
    private String devicePlatform; //平台 phone
    private String idfa; //
    private String imei; //
    private String deviceId; //device id
    private String screenWidh; //屏幕宽
    private String screenHeight; //屏幕高
    private String appVersion; //app 版本
    private String lastRefresh; //最后一次刷新时间
    private String action; //下拉pull，上滑 push
    private String location; //地域码
    private String lbsStatus; //是否允许获取位置
    private String city;


    public Integer getIid() {
        return iid;
    }

    public NewsRequest setIid(Integer iid) {
        this.iid = iid;
        return this;
    }

    public String getNet() {
        return net;
    }

    public NewsRequest setNet(String net) {
        this.net = net;
        return this;
    }

    public String getAppName() {
        return appName;
    }

    public NewsRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }

    public String getChannel() {
        return channel;
    }

    public NewsRequest setChannel(String channel) {
        this.channel = channel;
        return this;
    }

    public Integer getCategory() {
        return category;
    }

    public NewsRequest setCategory(Integer category) {
        this.category = category;
        return this;
    }

    public String getOsVersion() {
        return osVersion;
    }

    public NewsRequest setOsVersion(String osVersion) {
        this.osVersion = osVersion;
        return this;
    }

    public String getDevicePlatform() {
        return devicePlatform;
    }

    public NewsRequest setDevicePlatform(String devicePlatform) {
        this.devicePlatform = devicePlatform;
        return this;
    }

    public String getIdfa() {
        return idfa;
    }

    public NewsRequest setIdfa(String idfa) {
        this.idfa = idfa;
        return this;
    }

    public String getImei() {
        return imei;
    }

    public NewsRequest setImei(String imei) {
        this.imei = imei;
        return this;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public NewsRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    public String getScreenWidh() {
        return screenWidh;
    }

    public NewsRequest setScreenWidh(String screenWidh) {
        this.screenWidh = screenWidh;
        return this;
    }

    public String getScreenHeight() {
        return screenHeight;
    }

    public NewsRequest setScreenHeight(String screenHeight) {
        this.screenHeight = screenHeight;
        return this;
    }

    public String getAppVersion() {
        return appVersion;
    }

    public NewsRequest setAppVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }

    public String getLastRefresh() {
        return lastRefresh;
    }

    public NewsRequest setLastRefresh(String lastRefresh) {
        this.lastRefresh = lastRefresh;
        return this;
    }

    public String getAction() {
        return action;
    }

    public NewsRequest setAction(String action) {
        this.action = action;
        return this;
    }

    public String getLocation() {
        return location;
    }

    public NewsRequest setLocation(String location) {
        this.location = location;
        return this;
    }

    public String getLbsStatus() {
        return lbsStatus;
    }

    public NewsRequest setLbsStatus(String lbsStatus) {
        this.lbsStatus = lbsStatus;
        return this;
    }

    public String getCity() {
        return city;
    }

    public NewsRequest setCity(String city) {
        this.city = city;
        return this;
    }
}
