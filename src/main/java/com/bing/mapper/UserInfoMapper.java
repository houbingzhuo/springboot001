package com.bing.mapper;

import com.bing.pojo.UserInfo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserInfoMapper {
    @Select("select userid userId,user_name userName, user_pass userPass,user_role userRole,user_post userPost from userinfo")
    //@Select("select * from userinfo")
    List<UserInfo> selectAll();
}
