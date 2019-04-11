package com.qf.service;

import com.qf.dto.RoleInfoDto;
import com.qf.pojo.RoleInfo;
import com.qf.vo.RoleChangeVo;
import com.qf.vo.RoleInfoVo;

import java.util.List;

public interface RoleInfoService {
    public List<RoleInfoDto> getRoleById(int userId);
    public int assginRole(RoleChangeVo roleChangeVo);
    public List<RoleInfo> getRoleByPage(RoleInfoVo RoleInfoVo);
    public int getCount(RoleInfoVo roleInfoVo);
    public boolean addRoleInfo(RoleInfo roleInfo);
    public boolean deleteRoleById(RoleInfo roleInfo);
    public List<RoleInfo> getRoleByRoleId(int roleId);

    public Boolean updateRoleInfoById(RoleInfo roleInfo);
}
