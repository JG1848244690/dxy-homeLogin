package com.controller;

import ch.qos.logback.classic.turbo.TurboFilter;
import com.entity.User;
import com.mapper.UserMapper;
import com.req.UserLoginReq;
import com.req.UserRegisterReq;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
public class userController {


    @Autowired
    private UserMapper userMapper;



    @GetMapping("/user")
    public  List query(){
        List<User> list = userMapper.find();
        System.out.println(list);
        return list;
    }

    //插入用户
    @PostMapping("/user")
    public boolean save(User user){
        int i = userMapper.insert(user);
        if(i>0){
            System.out.println("insert success");
            return true;
        }else {
            System.out.println("insert failed");
            return false;
        }

    }
    @PostMapping("/sys-user/register")
    public boolean register(UserRegisterReq userRegisterReq){
        User user = new User();
        user.setLoginName(userRegisterReq.getLoginName());
        user.setName(userRegisterReq.getName());
        user.setPassword(userRegisterReq.getPassword());
        boolean flag = save(user);

        return flag;
    }

    @PostMapping("/sys-user/login")
    public boolean login(UserLoginReq userLoginReq){
        User user = new User();
        user.setLoginName(userLoginReq.getLoginName());
        user.setPassword(userLoginReq.getPassword());
       User backUser = userMapper.checkUser(user);

        if(backUser!=null){
            return true;
        }else {
            return false;
        }
    }

}
