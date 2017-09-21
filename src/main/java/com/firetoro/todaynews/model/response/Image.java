package com.firetoro.todaynews.model.response;

import java.util.List;

public class Image {
    private String url;
    private int width;
    private String uri;
    private int height;
    private List<UrlListBeanX> urlList;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public List<UrlListBeanX> getUrlList() {
        return urlList;
    }

    public void setUrlList(List<UrlListBeanX> urlList) {
        this.urlList = urlList;
    }

    public static class UrlListBeanX {
        public String url;
    }
}
