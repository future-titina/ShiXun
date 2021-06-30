package com.titina.shixun.serviceImpl;

import com.titina.shixun.bean.UserBean;
import com.titina.shixun.mapper.UserMapper;
import com.titina.shixun.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    //将DAO层注入Service层
    @Autowired
    private UserMapper userMapper;

    @Override
    public UserBean loginIn(String name, String author) {
        return userMapper.getInfo(name, author);
    }
}
