package com.qf.service.impl;

import com.qf.dto.RoleInfoDto;
import com.qf.mapper.RoleInfoMapper;
import com.qf.pojo.RoleInfo;
import com.qf.service.RoleInfoService;
import com.qf.vo.RoleChangeVo;
import com.qf.vo.RoleInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleInfoServiceImpl implements RoleInfoService {

    @Autowired
    RoleInfoMapper roleInfoMapper;

    public List<RoleInfoDto> getRoleById(int userId){
        return this.roleInfoMapper.getRoleById(userId);
    }

    public int assginRole(RoleChangeVo roleChangeVo) {
        roleInfoMapper.changeOldRole(roleChangeVo);
        int count = roleInfoMapper.changeNewRole(roleChangeVo);
        return count;
    }

    public List<RoleInfo> getRoleByPage(RoleInfoVo RoleInfoVo) {
        return roleInfoMapper.getRoleByPage(RoleInfoVo);
    }

    public int getCount(RoleInfoVo roleInfoVo) {
        return roleInfoMapper.getCount(roleInfoVo);
    }

    public boolean addRoleInfo(RoleInfo roleInfo) {
        boolean flag = false;
        int count = roleInfoMapper.addRoleInfo(roleInfo);
        if (count>0){
            flag = true;
        }
        return flag;
    }

    public boolean deleteRoleById(RoleInfo roleInfo) {
        boolean flag = false;
        int count = roleInfoMapper.deleteRoleById(roleInfo);
        if (count>0){
            flag = true;
        }
        return flag;
    }

    public List<RoleInfo> getRoleByRoleId(int roleId) {
        return roleInfoMapper.getRoleByRoleId(roleId);
    }

    public Boolean updateRoleInfoById(RoleInfo roleInfo) {
        boolean flag = false;
        int count = roleInfoMapper.updateRoleInfoById(roleInfo);
        if (count>0){
            flag = true;
        }
        return flag;
    }
}
