package com.qf.vo;

import com.qf.tools.SplitPageUtils;

public class UserInfovo {

    String username;
    String email;
    String name;
    SplitPageUtils splitPageUtils;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SplitPageUtils getSplitPageUtils() {
        return splitPageUtils;
    }

    public void setSplitPageUtils(SplitPageUtils splitPageUtils) {
        this.splitPageUtils = splitPageUtils;
    }

    @Override
    public String toString() {
        return "UserInfovo{" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", splitPageUtils=" + splitPageUtils +
                '}';
    }
}
