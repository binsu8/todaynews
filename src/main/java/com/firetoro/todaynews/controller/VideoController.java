package com.firetoro.todaynews.controller;

import com.firetoro.todaynews.service.VideoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class VideoController {

    @Resource
    VideoService testService;

    @RequestMapping(value = "/api/v1/feed/videoList")
    @ResponseBody
    public String getVideos(){
        return "My testSpring" + testService.test();
    }

    @RequestMapping(value = "/api/v1/videoResponse")
    @ResponseBody
    public String getVideo(){
        return "My testSpring" + testService.test();
    }

    @RequestMapping(value = "/api/v1/videoInfo")
    @ResponseBody
    public String getVideoInfo(){
        return "My testSpring" + testService.test();
    }
}