package com.bing.controller;

import com.bing.pojo.UserInfo;
import com.bing.service.UserInfoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class UserInfoController {
    @Resource
    private UserInfoService userInfoService;
    @RequestMapping("selectAll")
    public List<UserInfo> selectAll(){
        return userInfoService.selectAll();
    }
}
