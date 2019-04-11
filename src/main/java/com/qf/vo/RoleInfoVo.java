package com.qf.vo;

import com.qf.tools.SplitPageUtils;

public class RoleInfoVo {
    String roleName;
    SplitPageUtils splitPageUtils;

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public SplitPageUtils getSplitPageUtils() {
        return splitPageUtils;
    }

    public void setSplitPageUtils(SplitPageUtils splitPageUtils) {
        this.splitPageUtils = splitPageUtils;
    }

    @Override
    public String toString() {
        return "RoleInfoVo{" +
                "roleName='" + roleName + '\'' +
                ", splitPageUtils=" + splitPageUtils +
                '}';
    }
}
