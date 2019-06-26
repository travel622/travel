package com.vip.controller;

import com.vip.pojo.Stu;
import com.vip.service.StuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

/**
 * Created by 周昭昭 on 2019/6/24.
 */
@RestController
public class StuController {
    @Autowired
    private StuService stuService;
    @RequestMapping("/selectAll")
    public List<Stu> selectAll(){
        return stuService.selectAll();
    }
}
