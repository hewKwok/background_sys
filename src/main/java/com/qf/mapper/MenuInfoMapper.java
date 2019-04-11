package com.qf.mapper;

import com.qf.dto.MenuInfoDto;
import com.qf.pojo.MenuInfo;
import com.qf.vo.AssignPermessionVo;
import com.qf.vo.MenuInfoVo;


import java.util.List;

public interface MenuInfoMapper {
    public List<MenuInfoDto> getAllMenu(int roleid);
    public int deleteByRoleId(AssignPermessionVo assignPermessionVo);
    public int assignPermission(AssignPermessionVo assignPermessionVo);
    public List<MenuInfo> getMenuByPage(MenuInfoVo menuInfoVo);
    public int getCount(MenuInfoVo menuInfoVo);
    public int deleteMenuById(int menuid);
    public List<MenuInfo> getMenuByMenu(MenuInfo menuInfo);
    public int updateMenuInfoById(MenuInfo menuInfo);
}
