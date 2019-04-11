package com.qf.dto;

import com.qf.pojo.MenuInfo;
import com.qf.tools.SplitPageUtils;

import java.util.List;

public class MenuDto {
    List<MenuInfo> menuInfoList ;
    SplitPageUtils splitPageUtils;

    public List<MenuInfo> getMenuInfoList() {
        return menuInfoList;
    }

    public void setMenuInfoList(List<MenuInfo> menuInfoList) {
        this.menuInfoList = menuInfoList;
    }

    public SplitPageUtils getSplitPageUtils() {
        return splitPageUtils;
    }

    public void setSplitPageUtils(SplitPageUtils splitPageUtils) {
        this.splitPageUtils = splitPageUtils;
    }

    @Override
    public String toString() {
        return "MenuDto{" +
                "menuInfoList=" + menuInfoList +
                ", splitPageUtils=" + splitPageUtils +
                '}';
    }
}
