package com.firetoro.todaynews.model.response;

import java.util.List;

public class NewsResponse {

    private Integer loginStatus;
    private Integer totalNumber;
    private boolean hasMore;
    private String postContentHint;
    private Integer showEtStatus;
    private Integer feedFlag;
    private Integer actionToLastStick;
    private Integer status;
    private boolean hasMoreToRefresh;
    private DetailData details;
    private List<NewData> data;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getLoginStatus() {
        return loginStatus;
    }

    public void setLoginStatus(Integer loginStatus) {
        this.loginStatus = loginStatus;
    }

    public Integer getTotalNumber() {
        return totalNumber;
    }

    public void setTotalNumber(Integer totalNumber) {
        this.totalNumber = totalNumber;
    }

    public boolean isHasMore() {
        return hasMore;
    }

    public void setHasMore(boolean hasMore) {
        this.hasMore = hasMore;
    }

    public String getPostContentHint() {
        return postContentHint;
    }

    public void setPostContentHint(String postContentHint) {
        this.postContentHint = postContentHint;
    }

    public Integer getShowEtStatus() {
        return showEtStatus;
    }

    public void setShowEtStatus(Integer showEtStatus) {
        this.showEtStatus = showEtStatus;
    }

    public Integer getFeedFlag() {
        return feedFlag;
    }

    public void setFeedFlag(Integer feedFlag) {
        this.feedFlag = feedFlag;
    }

    public Integer getActionToLastStick() {
        return actionToLastStick;
    }

    public void setActionToLastStick(Integer actionToLastStick) {
        this.actionToLastStick = actionToLastStick;
    }

    public boolean isHasMoreToRefresh() {
        return hasMoreToRefresh;
    }

    public void setHasMoreToRefresh(boolean hasMoreToRefresh) {
        this.hasMoreToRefresh = hasMoreToRefresh;
    }

    public DetailData getDetails() {
        return details;
    }

    public void setDetails(DetailData details) {
        this.details = details;
    }

    public List<NewData> getData() {
        return data;
    }

    public void setData(List<NewData> data) {
        this.data = data;
    }
}
