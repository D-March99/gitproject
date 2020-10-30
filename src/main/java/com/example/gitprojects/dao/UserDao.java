package com.example.gitprojects.dao;


import com.example.gitprojects.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserDao {

    @Select("SELECT * FROM user")
    List<User> findUser();
}
