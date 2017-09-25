package com.firetoro.todaynews.model.response;

import java.util.List;

public class News {

    private int articleType;
    private String tag;
    private String title;
    private String summary;
    private int hot;
    private String source;
    private int commentCount;
    private String articleUrl;
    private int galleryImageCount;
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


    public int getArticleType() {
        return articleType;
    }

    public void setArticleType(int articleType) {
        this.articleType = articleType;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public int getHot() {
        return hot;
    }

    public void setHot(int hot) {
        this.hot = hot;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public int getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(int commentCount) {
        this.commentCount = commentCount;
    }

    public String getArticleUrl() {
        return articleUrl;
    }

    public void setArticleUrl(String articleUrl) {
        this.articleUrl = articleUrl;
    }

    public int getGalleryImageCount() {
        return galleryImageCount;
    }

    public void setGalleryImageCount(int galleryImageCount) {
        this.galleryImageCount = galleryImageCount;
    }

    public int getVideoStyle() {
        return videoStyle;
    }

    public void setVideoStyle(int videoStyle) {
        this.videoStyle = videoStyle;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public User getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(User userInfo) {
        this.userInfo = userInfo;
    }

    public long getBehotTime() {
        return behotTime;
    }

    public void setBehotTime(long behotTime) {
        this.behotTime = behotTime;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public boolean isHasImage() {
        return hasImage;
    }

    public void setHasImage(boolean hasImage) {
        this.hasImage = hasImage;
    }

    public boolean isHasVideo() {
        return hasVideo;
    }

    public void setHasVideo(boolean hasVideo) {
        this.hasVideo = hasVideo;
    }

    public int getVideoDuration() {
        return videoDuration;
    }

    public void setVideoDuration(int videoDuration) {
        this.videoDuration = videoDuration;
    }

    public Video getVideoDetailInfo() {
        return videoDetailInfo;
    }

    public void setVideoDetailInfo(Video videoDetailInfo) {
        this.videoDetailInfo = videoDetailInfo;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public Image getMiddleImage() {
        return middleImage;
    }

    public void setMiddleImage(Image middleImage) {
        this.middleImage = middleImage;
    }

    public List<Image> getImageList() {
        return imageList;
    }

    public void setImageList(List<Image> imageList) {
        this.imageList = imageList;
    }

    public String toJson() {
        return null;
    }
}

