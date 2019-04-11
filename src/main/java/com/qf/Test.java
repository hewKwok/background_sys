package com.qf;

import com.qf.pojo.UserInfo;
import com.qf.service.UserInfoService;
import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-mybatis.xml","spring-entity.xml","spring-service.xml");
        UserInfoService userInfoService = context.getBean(UserInfoService.class);
        UserInfo userInfo =  context.getBean("yuanjiongyang", UserInfo.class);
        boolean b = userInfoService.loginCheck(userInfo);
        System.out.println(b);
//         <select id="getMenuByPage" parameterType="com.qf.vo.MenuInfoVo" resultType="com.qf.pojo.MenuInfo">
//                select * from menueinfo
//                <where>
//                status = 1
//                <if test="menuename!=null and menuename!=''">
//                and menuename = #{menuename}
//            </if>
//        </where>
//                limit  #{splitPageUtils.start},#{splitPageUtils.pageSize}
//    </select>
    }
}
