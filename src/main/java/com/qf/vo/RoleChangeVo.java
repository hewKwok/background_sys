package com.qf.vo;

import java.util.Arrays;
import java.util.List;

public class RoleChangeVo {
    int[] oldRole;
    int[] newRole;
    int userid;

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public int[] getOldRole() {
        return oldRole;
    }

    public void setOldRole(int[] oldRole) {
        this.oldRole = oldRole;
    }

    public int[] getNewRole() {
        return newRole;
    }

    public void setNewRole(int[] newRole) {
        this.newRole = newRole;
    }

    @Override
    public String toString() {
        return "RoleChangeVo{" +
                "oldRole=" + Arrays.toString(oldRole) +
                ", newRole=" + Arrays.toString(newRole) +
                ", userid=" + userid +
                '}';
    }
}
