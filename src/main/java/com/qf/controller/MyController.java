package com.qf.controller;

import com.qf.dto.UserInfoDto;
import com.qf.pojo.UserInfo;
import com.qf.service.UserInfoService;
import com.qf.tools.SplitPageUtils;
import com.qf.vo.UserInfovo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class MyController {
    @Autowired
    UserInfoService userInfoService;

    @ResponseBody
    @RequestMapping(value = "test" , method = RequestMethod.POST)
    public String test(){
        System.out.println("test");
        return "hello world";
    }


    @ResponseBody
    @RequestMapping(value = "loginCheck",method = RequestMethod.POST)
    public String loginCheck(@RequestBody UserInfo userInfo){
        Boolean flag = false;
        flag=userInfoService.loginCheck(userInfo);
        return flag.toString();
    }

    @ResponseBody
    @RequestMapping(value = "getUserInfoBy",method = RequestMethod.POST)
    public Object getUserInfoBy(@RequestBody(required = false) UserInfo userInfo){
        List<UserInfo> userInfos = userInfoService.getUserInfoBy(userInfo);
        return userInfos;
    }
    @ResponseBody
    @RequestMapping(value = "updateUserInfoById",method = RequestMethod.POST)
    public String updateUserInfoById(@RequestBody UserInfo userInfo){
        Boolean b = userInfoService.updateUserInfoById(userInfo);
        return b.toString();
    }

    @ResponseBody
    @RequestMapping(value = "deleteUserInfoById",method = RequestMethod.POST)
    public String deleteUserInfoById(@RequestBody UserInfo userInfo){
        Boolean b = userInfoService.deleteUserInfoById(userInfo);
        return b.toString();
    }
    @ResponseBody
    @RequestMapping(value = "addUserInfo",method = RequestMethod.POST)
    public String addUserInfo(@RequestBody UserInfo userInfo){
        Boolean b = userInfoService.addUserInfo(userInfo);
        return b.toString();
    }

    @ResponseBody
    @RequestMapping(value = "getUserInfoPageBy",method = RequestMethod.POST)
    public Object getUserInfoPageBy(@RequestBody(required = false) UserInfovo userInfovo){
        List<UserInfo> userInfos = userInfoService.getUserInfoPageBy(userInfovo);
        int count = userInfoService.getCount(userInfovo);
        SplitPageUtils splitPageUtils = new SplitPageUtils();
        splitPageUtils.setCurrentPage(userInfovo.getSplitPageUtils().getCurrentPage());
        splitPageUtils.setDataCount(count);
        splitPageUtils.setPageCount((count%userInfovo.getSplitPageUtils().getPageSize()==0?count/userInfovo.getSplitPageUtils().getPageSize():count/userInfovo.getSplitPageUtils().getPageSize()+1));
        UserInfoDto userInfoDto = new UserInfoDto();
        userInfoDto.setSplitPageUtils(splitPageUtils);
        userInfoDto.setUserInfoList(userInfos);
        return userInfoDto;
    }

}
