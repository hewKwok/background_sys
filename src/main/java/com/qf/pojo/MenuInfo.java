package com.qf.pojo;

public class MenuInfo  {
    int menueid;
    String menuename;
    String menueicon;
    String menuepath;
    String parentName;
    int parentid;

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public int getMenueid() {
        return menueid;
    }

    public void setMenueid(int menueid) {
        this.menueid = menueid;
    }

    public String getMenuename() {
        return menuename;
    }

    public void setMenuename(String menuename) {
        this.menuename = menuename;
    }

    public String getMenueicon() {
        return menueicon;
    }

    public void setMenueicon(String menueicon) {
        this.menueicon = menueicon;
    }

    public String getMenuepath() {
        return menuepath;
    }

    public void setMenuepath(String menuepath) {
        this.menuepath = menuepath;
    }

    public int getParentid() {
        return parentid;
    }

    public void setParentid(int parentid) {
        this.parentid = parentid;
    }

    @Override
    public String toString() {
        return "MenuInfo{" +
                "menueid=" + menueid +
                ", menuename='" + menuename + '\'' +
                ", menueicon='" + menueicon + '\'' +
                ", menuepath='" + menuepath + '\'' +
                ", parentName='" + parentName + '\'' +
                ", parentid=" + parentid +
                '}';
    }
}
