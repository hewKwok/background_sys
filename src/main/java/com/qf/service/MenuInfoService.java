package com.qf.service;

import com.qf.dto.MenuInfoDto;
import com.qf.pojo.MenuInfo;
import com.qf.vo.AssignPermessionVo;
import com.qf.vo.MenuInfoVo;

import java.util.List;

public interface MenuInfoService {
    public List<MenuInfoDto> getAllMenu(int roleid);
    public boolean assignPermission(AssignPermessionVo assignPermessionVo);
    public List<MenuInfo> getMenuByPage(MenuInfoVo menuInfoVo);
    public int getCount(MenuInfoVo menuInfoVo);

    public boolean deleteMenuById(int menueid);

    List<MenuInfo> getMenuByMenu(MenuInfo menuInfo);
    Boolean updateMenuInfoById(MenuInfo menuInfo);
}
