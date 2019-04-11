package com.qf.pojo;

import java.util.List;

public class UserInfo {
    int userId;
    String username;
    String name;
    String password;
    String email;
    int status;
    List<RoleInfo> roleinfoes;

    public void setRoleinfoes(List<RoleInfo> roleinfoes) {
        this.roleinfoes = roleinfoes;
    }

    public List<RoleInfo> getRoleinfoes(){
        return roleinfoes;
    }


    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", status=" + status +
                ", roleinfoes=" + roleinfoes +
                '}';
    }
}
