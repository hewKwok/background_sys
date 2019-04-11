package com.qf.vo;

import com.qf.tools.SplitPageUtils;

public class MenuInfoVo {

    String menuename;
    SplitPageUtils splitPageUtils;

    public String getMenuename() {
        return menuename;
    }

    public void setMenuename(String menuename) {
        this.menuename = menuename;
    }

    public SplitPageUtils getSplitPageUtils() {
        return splitPageUtils;
    }

    public void setSplitPageUtils(SplitPageUtils splitPageUtils) {
        this.splitPageUtils = splitPageUtils;
    }

    @Override
    public String toString() {
        return "MenuInfoVo{" +
                "menuename='" + menuename + '\'' +
                ", splitPageUtils=" + splitPageUtils +
                '}';
    }
}
