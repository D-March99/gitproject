package com.example.gitprojects.service;


import com.example.gitprojects.dao.UserDao;
import com.example.gitprojects.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDao userDao;

    @Override
    public List<User> findUsers() {
        return userDao.findUser();
    }

    @Override
    public int addUser(User user) {
        return userDao.addUser(user);
    }
}
