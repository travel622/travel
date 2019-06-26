package com.vip.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by 周昭昭 on 2019/6/25.
 */
@Controller
@RequestMapping("/view")
public class ViewController {
    @RequestMapping("/{url1}/{url2}/{url3}")
    public String test2(@PathVariable("url1") String url1, @PathVariable("url2") String url2, @PathVariable("url3") String url3){
        return url1+"/"+url2+"/"+url3;

    }
    @RequestMapping("/{url1}/{url2}")
    public String test3(@PathVariable("url1") String url1,@PathVariable("url2") String url2){
        return url1+"/"+url2;

    }
    @RequestMapping("/{url}")
    public String test(@PathVariable("url") String url) {
        return url;
    }
}
