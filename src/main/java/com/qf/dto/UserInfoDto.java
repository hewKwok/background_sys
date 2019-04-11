package com.qf.dto;

import com.qf.pojo.UserInfo;
import com.qf.tools.SplitPageUtils;

import java.util.List;

public class UserInfoDto {
    List<UserInfo> userInfoList ;
    SplitPageUtils splitPageUtils;

    public List<UserInfo> getUserInfoList() {
        return userInfoList;
    }

    public void setUserInfoList(List<UserInfo> userInfoList) {
        this.userInfoList = userInfoList;
    }

    public SplitPageUtils getSplitPageUtils() {
        return splitPageUtils;
    }

    public void setSplitPageUtils(SplitPageUtils splitPageUtils) {
        this.splitPageUtils = splitPageUtils;
    }

    @Override
    public String toString() {
        return "UserInfoDto{" +
                "userInfoList=" + userInfoList +
                ", splitPageUtils=" + splitPageUtils +
                '}';
    }
}
