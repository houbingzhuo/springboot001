package com.bing.pojo;

import lombok.Data;

@Data
public class UserInfo {
    private Integer userId;
    private String userName;
    private String userPass;
    private String userRole;
    private String userPost;
}
