package com.bing.service;

import com.bing.mapper.UserInfoMapper;
import com.bing.pojo.UserInfo;
import com.bing.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Resource
    private UserInfoMapper userInfoMapper;
    @Override
    public List<UserInfo> selectAll() {
        return userInfoMapper.selectAll();
    }
}
