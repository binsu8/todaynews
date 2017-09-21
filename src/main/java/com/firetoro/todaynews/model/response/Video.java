package com.firetoro.todaynews.model.response;

import java.util.List;

public class Video {
    private int groupFlags;
    private int videoType;
    private int videoPreloadingFlag;
    private int directPlay;
    private Image detailVideoLargeImage;
    private int showPgcSubscribe;
    private String videoThirdMonitorUrl;
    private String videoId;
    private int videoWatchingCount;
    private int videoWatchCount;
    private List<?> videoUrl;
    private int progress;


    public int getGroupFlags() {
        return groupFlags;
    }

    public void setGroupFlags(int groupFlags) {
        this.groupFlags = groupFlags;
    }

    public int getVideoType() {
        return videoType;
    }

    public void setVideoType(int videoType) {
        this.videoType = videoType;
    }

    public int getVideoPreloadingFlag() {
        return videoPreloadingFlag;
    }

    public void setVideoPreloadingFlag(int videoPreloadingFlag) {
        this.videoPreloadingFlag = videoPreloadingFlag;
    }

    public int getDirectPlay() {
        return directPlay;
    }

    public void setDirectPlay(int directPlay) {
        this.directPlay = directPlay;
    }

    public Image getDetailVideoLargeImage() {
        return detailVideoLargeImage;
    }

    public void setDetailVideoLargeImage(Image detailVideoLargeImage) {
        this.detailVideoLargeImage = detailVideoLargeImage;
    }

    public int getShowPgcSubscribe() {
        return showPgcSubscribe;
    }

    public void setShowPgcSubscribe(int showPgcSubscribe) {
        this.showPgcSubscribe = showPgcSubscribe;
    }

    public String getVideoThirdMonitorUrl() {
        return videoThirdMonitorUrl;
    }

    public void setVideoThirdMonitorUrl(String videoThirdMonitorUrl) {
        this.videoThirdMonitorUrl = videoThirdMonitorUrl;
    }

    public String getVideoId() {
        return videoId;
    }

    public void setVideoId(String videoId) {
        this.videoId = videoId;
    }

    public int getVideoWatchingCount() {
        return videoWatchingCount;
    }

    public void setVideoWatchingCount(int videoWatchingCount) {
        this.videoWatchingCount = videoWatchingCount;
    }

    public int getVideoWatchCount() {
        return videoWatchCount;
    }

    public void setVideoWatchCount(int videoWatchCount) {
        this.videoWatchCount = videoWatchCount;
    }

    public List<?> getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(List<?> videoUrl) {
        this.videoUrl = videoUrl;
    }

    public int getProgress() {
        return progress;
    }

    public void setProgress(int progress) {
        this.progress = progress;
    }
}
