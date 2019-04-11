package com.qf.vo;

import java.util.Arrays;


public class AssignPermessionVo {

    int roleid;
    int[] menuIds;

    public int getRoleid() {
        return roleid;
    }

    public void setRoleid(int roleid) {
        this.roleid = roleid;
    }

    public int[] getMenuIds() {
        return menuIds;
    }

    public void setMenuIds(int[] menuIds) {
        this.menuIds = menuIds;
    }

    @Override
    public String toString() {
        return "AssignPermessionVo{" +
                "roleid=" + roleid +
                ", menuIds=" + Arrays.toString(menuIds) +
                '}';
    }
}
