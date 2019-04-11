package com.qf.service;

import com.qf.pojo.UserInfo;
import com.qf.vo.UserInfovo;

import java.util.List;

public interface UserInfoService {
    public boolean loginCheck(UserInfo userInfo);
    public List<UserInfo> getUserInfoBy(UserInfo userInfo);
    public boolean updateUserInfoById(UserInfo userInfo);
    public boolean deleteUserInfoById(UserInfo userInfo);
    public boolean addUserInfo(UserInfo userInfo);
    public List<UserInfo> getUserInfoPageBy(UserInfovo userInfovo);
    public int getCount(UserInfovo userInfovo);
}
