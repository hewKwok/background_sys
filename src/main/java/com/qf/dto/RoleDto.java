package com.qf.dto;

import com.qf.pojo.RoleInfo;
import com.qf.tools.SplitPageUtils;

import java.util.List;

public class RoleDto {
    List<RoleInfo> roleInfoList;

    SplitPageUtils splitPageUtils;

    public SplitPageUtils getSplitPageUtils() {
        return splitPageUtils;
    }

    public void setSplitPageUtils(SplitPageUtils splitPageUtils) {
        this.splitPageUtils = splitPageUtils;
    }

    public List<RoleInfo> getRoleInfoList() {
        return roleInfoList;
    }

    public void setRoleInfoList(List<RoleInfo> roleInfoList) {
        this.roleInfoList = roleInfoList;
    }

    @Override
    public String toString() {
        return "RoleDto{" +
                "roleInfoList=" + roleInfoList +
                ", splitPageUtils=" + splitPageUtils +
                '}';
    }
}
