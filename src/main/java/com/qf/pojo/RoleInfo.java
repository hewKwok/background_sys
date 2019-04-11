package com.qf.pojo;

public class RoleInfo {
      int roleid;
      String rolename;
      String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getRoleid() {
        return roleid;
    }

    public void setRoleid(int roleid) {
        this.roleid = roleid;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    @Override
    public String toString() {
        return "RoleInfo{" +
                "roleid=" + roleid +
                ", rolename='" + rolename + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
