package com.firetoro.todaynews.controller;

import com.firetoro.todaynews.service.VideoService;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.annotation.Resource;
import java.time.LocalDate;

@Controller
public class NewController {

    @Resource
    VideoService testService;


    @RequestMapping(value = "/api/v1/newss")
    @ResponseBody
    public String getNews(
            @RequestParam(value = "iid", required = false)  Integer iid,
            @RequestParam(value = "net", required = false)  String net, //网络类型
            @RequestParam(value = "appn", required = false) String appName, //app name
            @RequestParam(value = "ch", required = false)   String channel, //渠道
            @RequestParam(value = "ca", required = false)   Integer ca, //分类
            @RequestParam(value = "osv", required = false)  String osVersion, //操作系统版本
            @RequestParam(value = "dp", required = false)   String devicePlatform, //平台 phone
            @RequestParam(value = "idfa", required = false) String idfa, //
            @RequestParam(value = "imei", required = false) String imei, //
            @RequestParam(value = "did", required = false)  String deviceId, //device id
            @RequestParam(value = "sw", required = false)   String screenWidh, //屏幕宽
            @RequestParam(value = "sh", required = false)   String screenHeight, //屏幕高
            @RequestParam(value = "aver", required = false) String appVersion, //app 版本
            @RequestParam(value = "lr", required = false)   String lastRefresh, //最后一次刷新时间
            @RequestParam(value = "ac", required = false)   String action, //下拉pull，上滑 push
            @RequestParam(value = "loc", required = false)  String location, //地域码
            @RequestParam(value = "ls", required = false)   String lbsStatus, //是否允许获取位置
            @RequestParam(value = "city", required = false) String city ) {
        return "My testSpring";
    }

    @RequestMapping(value = "/api/v1/new")
    @ResponseBody
    public String getNew(){
        return "My testSpring" + testService.test();
    }

    @RequestMapping(value = "/api/v1/newsInfo")
    @ResponseBody
    public String getNewInfo(){
        return "My testSpring" + testService.test();
    }
}