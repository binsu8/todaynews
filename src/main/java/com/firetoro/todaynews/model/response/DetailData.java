package com.firetoro.todaynews.model.response;

public class DetailData {

    private String type;
    private Integer displayDuration;
    private String displayhInfo;
    private String displayTemplate;
    private String openUrl;
    private String webUrl;
    private String downloadUrl;
    private String appName;
    private String pacakageName;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getDisplayDuration() {
        return displayDuration;
    }

    public void setDisplayDuration(Integer displayDuration) {
        this.displayDuration = displayDuration;
    }

    public String getDisplayhInfo() {
        return displayhInfo;
    }

    public void setDisplayhInfo(String displayhInfo) {
        this.displayhInfo = displayhInfo;
    }

    public String getDisplayTemplate() {
        return displayTemplate;
    }

    public void setDisplayTemplate(String displayTemplate) {
        this.displayTemplate = displayTemplate;
    }

    public String getOpenUrl() {
        return openUrl;
    }

    public void setOpenUrl(String openUrl) {
        this.openUrl = openUrl;
    }

    public String getWebUrl() {
        return webUrl;
    }

    public void setWebUrl(String webUrl) {
        this.webUrl = webUrl;
    }

    public String getDownloadUrl() {
        return downloadUrl;
    }

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getPacakageName() {
        return pacakageName;
    }

    public void setPacakageName(String pacakageName) {
        this.pacakageName = pacakageName;
    }
}
