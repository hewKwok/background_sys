package com.qf.service.impl;

import com.qf.mapper.UserInfoMapper;
import com.qf.pojo.UserInfo;
import com.qf.service.UserInfoService;
import com.qf.vo.UserInfovo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserInfoImplService implements UserInfoService {
    @Autowired
    UserInfoMapper userInfoMapper;

    public boolean loginCheck(UserInfo userInfo) {

        if (userInfoMapper.loginCheck(userInfo)!= null){
            return true;
        }
        return false;
    }

    public List<UserInfo> getUserInfoBy(UserInfo userInfo) {


        return userInfoMapper.getUserInfoBy(userInfo);
    }

    public boolean updateUserInfoById(UserInfo userInfo) {
        boolean flag = false;
        if (userInfoMapper.updateUserInfoById(userInfo) > 0){
            flag = true;
        }
        return flag;
    }

    public boolean deleteUserInfoById(UserInfo userInfo) {
        boolean flag = false;
        if (userInfoMapper.deleteUserInfoById(userInfo) > 0){
            flag = true;
        }
        return flag;
    }

    public boolean addUserInfo(UserInfo userInfo) {
        boolean flag = false;
        if (userInfoMapper.addUserInfo(userInfo) > 0){
            flag = true;
        }
        return flag;
    }

    public List<UserInfo> getUserInfoPageBy(UserInfovo userInfovo) {
        return userInfoMapper.getUserInfoPageBy(userInfovo);
    }

    public int getCount(UserInfovo userInfovo) {
        return userInfoMapper.getCount(userInfovo);
    }
}
