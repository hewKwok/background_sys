package com.qf.mapper;

import com.qf.dto.RoleInfoDto;
import com.qf.pojo.RoleInfo;
import com.qf.vo.RoleChangeVo;
import com.qf.vo.RoleInfoVo;

import java.util.List;

public interface RoleInfoMapper {
    public List<RoleInfoDto> getRoleById(int userId);
    public int changeOldRole(RoleChangeVo roleChangeVo);
    public int changeNewRole(RoleChangeVo roleChangeVo);
    public List<RoleInfo> getRoleByPage(RoleInfoVo RoleInfoVo);
    public int getCount(RoleInfoVo roleInfoVo);
    public int addRoleInfo(RoleInfo roleInfo);
    public int deleteRoleById(RoleInfo roleInfo);
    public List<RoleInfo> getRoleByRoleId(int roleId);
    public int updateRoleInfoById (RoleInfo roleInfo);
}
