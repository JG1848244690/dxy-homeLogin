package com.mapper;

import com.entity.User;
import com.req.UserLoginReq;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {
    //查询所有用户
    @Select("select * from user")
    public List<User> find();

    //增加用户
    @Insert("insert into user values (#{id},#{LoginName},#{name},#{password})")
    public int insert(User user);

    @Select("select * from user where loginName=#{LoginName} and password=#{password}")
    public User checkUser(User user);
}
