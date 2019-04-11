package com.qf.mapper;

import com.qf.pojo.UserInfo;
import com.qf.vo.UserInfovo;
import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;

import java.util.List;

public interface UserInfoMapper {
    public UserInfo loginCheck(UserInfo userInfo);
    public int addUserInfo(UserInfo userInfo);
    public List<UserInfo> getUserInfoBy(UserInfo userInfo);
    public int updateUserInfoById(UserInfo userInfo);
    public int deleteUserInfoById(UserInfo userInfo);
    public List<UserInfo> getUserInfoPageBy(UserInfovo userInfovo);
    public int getCount(UserInfovo userInfovo);
}
