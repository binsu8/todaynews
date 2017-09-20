package com.firetoro.todaynews;

import com.firetoro.todaynews.service.VideoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class TestController {
    @Resource
    VideoService testService;
    @RequestMapping(value = "/admin")
    @ResponseBody
    public String testSpring(){
        return "My testSpring" + testService.test();
    }
}