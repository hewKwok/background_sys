package com.qf.service.impl;

import com.qf.dto.MenuInfoDto;
import com.qf.mapper.MenuInfoMapper;
import com.qf.pojo.MenuInfo;
import com.qf.service.MenuInfoService;
import com.qf.vo.AssignPermessionVo;
import com.qf.vo.MenuInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuInfoServiceImpl implements MenuInfoService {
    @Autowired
    MenuInfoMapper menuInfoMapper;

    public List<MenuInfoDto> getAllMenu(int roleid) {
        return menuInfoMapper.getAllMenu(roleid);
    }


    public boolean assignPermission(AssignPermessionVo assignPermessionVo) {
        boolean flag = false;
        menuInfoMapper.deleteByRoleId(assignPermessionVo);
        int count = menuInfoMapper.assignPermission(assignPermessionVo);
        if (count>0){
            flag = true;
        }
        return flag;
    }

    public List<MenuInfo> getMenuByPage(MenuInfoVo menuInfoVo) {
        return menuInfoMapper.getMenuByPage(menuInfoVo);
    }

    public int getCount(MenuInfoVo menuInfoVo) {
        return menuInfoMapper.getCount(menuInfoVo);
    }

    public boolean deleteMenuById(int menueid) {
        Boolean b = false;
        int count = menuInfoMapper.deleteMenuById(menueid);
        if (count>0){
            b = true;
        }
        return b;
    }

    public List<MenuInfo> getMenuByMenu(MenuInfo menuInfo) {
        return menuInfoMapper.getMenuByMenu(menuInfo);
    }



    public Boolean updateMenuInfoById(MenuInfo menuInfo) {
        Boolean b = false;
        int count = menuInfoMapper.updateMenuInfoById(menuInfo);
        if (count>0){
            b = true;
        }
        return b;
    }
}
