package com.firetoro.todaynews.model.response;

public class NewData {

    private String code;

    //private String content;
    private News content;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public News getContent() {
        return content;
    }

    public void setContent(News content) {
        this.content = content;
    }


}
