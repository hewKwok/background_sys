package com.qf.controller;

import com.qf.dto.MenuDto;
import com.qf.pojo.MenuInfo;
import com.qf.service.MenuInfoService;
import com.qf.tools.SplitPageUtils;
import com.qf.vo.AssignPermessionVo;
import com.qf.vo.MenuInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MenuInfoController {
    @Autowired
    MenuInfoService menuInfoService;


    @RequestMapping(value = "getAllMenu",method = RequestMethod.POST)
    public Object getAllMenu(int roleid){
        return menuInfoService.getAllMenu(roleid);
    }

    @RequestMapping(value = "assignPermissionController",method = RequestMethod.POST)
    public String assignPermissionController(@RequestBody AssignPermessionVo assignPermessionVo){
//        System.out.println(assignPermessionVo);
        Boolean b = menuInfoService.assignPermission(assignPermessionVo);

        return b.toString();
    }

    @RequestMapping(value = "getMenuByPage", method = RequestMethod.POST)
    public Object getMenuByPage(@RequestBody(required = false) MenuInfoVo MenuInfoVo){
        List<MenuInfo> MenuInfoList = menuInfoService.getMenuByPage(MenuInfoVo);
        int count = menuInfoService.getCount(MenuInfoVo);
        SplitPageUtils sp = new SplitPageUtils();
        sp.setCurrentPage(MenuInfoVo.getSplitPageUtils().getCurrentPage());
        sp.setDataCount(count);
        sp.setPageCount((count%MenuInfoVo.getSplitPageUtils().getPageSize()==0?count/MenuInfoVo.getSplitPageUtils().getPageSize():count/MenuInfoVo.getSplitPageUtils().getPageSize()+1));
        MenuDto dto = new MenuDto();
        dto.setSplitPageUtils(sp);
        dto.setMenuInfoList(MenuInfoList);
        return dto;
    }

    @RequestMapping(value = "deleteMenuById",method = RequestMethod.POST)
    public String deleteMenuById(@RequestParam int menueid){
        Boolean b = menuInfoService.deleteMenuById(menueid);
        return b.toString();
    }

    @RequestMapping(value = "getMenuByMenu", method = RequestMethod.POST)
    public List<MenuInfo> getMenuByMenu(@RequestBody MenuInfo menuInfo){
        System.out.println(menuInfo);
        return menuInfoService.getMenuByMenu(menuInfo);
    }



    @RequestMapping(value = "updateMenuInfoById",method = RequestMethod.POST)
    public String updateMenuInfoById(@RequestBody MenuInfo menuInfo){
        Boolean b = menuInfoService.updateMenuInfoById(menuInfo);
        return b.toString();
    }
}
