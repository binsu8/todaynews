package com.firetoro.todaynews.model.response;

import java.util.List;

public class News {

    private int articleType;
    private String tag;
    private String title;
    private int hot;
    private String source;
    private int commentCount;
    private String articleUrl;
    private int gallaryImageCount;
    private int videoStyle;
    private String itemId;
    private User userInfo;
    private long behotTime;
    private String url;
    private boolean hasImage;
    private boolean hasVideo;
    private int videoDuration;
    private Video videoDetailInfo;
    private String groupId;
    private Image middleImage;
    private List<Image> imageList;


    public String toJson() {
        return null;
    }
}

