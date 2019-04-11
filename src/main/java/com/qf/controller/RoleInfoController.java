package com.qf.controller;

import com.qf.dto.RoleDto;
import com.qf.dto.RoleInfoDto;
import com.qf.dto.UserInfoDto;
import com.qf.pojo.RoleInfo;
import com.qf.pojo.UserInfo;
import com.qf.service.RoleInfoService;
import com.qf.tools.SplitPageUtils;
import com.qf.vo.RoleChangeVo;
import com.qf.vo.RoleInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RoleInfoController {


    @Autowired
    RoleInfoService roleInfoService;

    @RequestMapping(value = "getRoleById", method = RequestMethod.POST)
    public List<RoleInfoDto> getRoleInfoById(@RequestParam int userId){
        return roleInfoService.getRoleById(userId);
    }

    @RequestMapping(value = "assginRoleById", method =RequestMethod.POST )
    public String assginRoleById(@RequestBody RoleChangeVo roleChangeVo){
        Boolean flag = false;
        int count = roleInfoService.assginRole(roleChangeVo);
        if (count>0){
            flag = true;
        }
//        System.out.println(roleChangeVo);
        return null;
    }

    @RequestMapping(value = "getRoleByPage", method = RequestMethod.POST)
    public Object getRoleByPage(@RequestBody(required = false)RoleInfoVo roleInfoVo){
//        System.out.println(roleInfoVo);
        List<RoleInfo> RoleInfoList = roleInfoService.getRoleByPage(roleInfoVo);
        int count = roleInfoService.getCount(roleInfoVo);
        SplitPageUtils sp = new SplitPageUtils();
        sp.setCurrentPage(roleInfoVo.getSplitPageUtils().getCurrentPage());
        sp.setDataCount(count);
        sp.setPageCount((count%roleInfoVo.getSplitPageUtils().getPageSize()==0?count/roleInfoVo.getSplitPageUtils().getPageSize():count/roleInfoVo.getSplitPageUtils().getPageSize()+1));
        RoleDto dto = new RoleDto();
        dto.setSplitPageUtils(sp);
        dto.setRoleInfoList(RoleInfoList);
        return dto;
    }

    @RequestMapping(value = "addRoleInfo",method = RequestMethod.POST)
    public String addRoleInfo(@RequestBody RoleInfo roleInfo){
        Boolean b = roleInfoService.addRoleInfo(roleInfo);
        return b.toString();
    }

    @RequestMapping(value = "deleteRoleById",method = RequestMethod.POST)
    public String deleteRoleById(@RequestBody RoleInfo roleInfo){
        Boolean b = roleInfoService.deleteRoleById(roleInfo);
        return b.toString();
    }


    @RequestMapping(value = "getRoleByRoleId", method = RequestMethod.POST)
    public List<RoleInfo> getRoleByRoleId(@RequestParam int roleid){

        return roleInfoService.getRoleByRoleId(roleid);
    }


    @RequestMapping(value = "updateRoleInfoById",method = RequestMethod.POST)
    public String updateUserInfoById(@RequestBody RoleInfo RoleInfo){
        Boolean b = roleInfoService.updateRoleInfoById(RoleInfo);
        return b.toString();
    }

}
