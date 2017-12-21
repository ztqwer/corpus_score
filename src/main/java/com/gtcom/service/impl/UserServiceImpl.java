package com.gtcom.service.impl;

import com.gtcom.bean.User;
import com.gtcom.mapper.UserMapper;
import com.gtcom.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/11/28.
 */
@Service
public class UserServiceImpl implements UserService {



    @Resource
    private UserMapper userMapper;


    @Override
    public User getUserByName(String userName) {
        return userMapper.getUserByName(userName);
    }

    @Override
    public void insert() {
        User user = new User();
        user.setUserName("zhangtong");
        user.setPassWord("zhangtong");
        System.out.println(userMapper);
        userMapper.insert(user);
//        userMapper.insert(user);

    }

    @Override
    public void insertBatch() {
        User user = new User();
        User user2 = new User();
        User user3 = new User();
        user.setUserName("zhangtong");
        user.setPassWord("zhangtong");
        user2.setUserName("lisan");
        user2.setPassWord("lisan");
        user3.setUserName("wangsi");
        user3.setPassWord("wangsi");
        List<User> list = new ArrayList<>();
        list.add(user);
        list.add(user2);
        list.add(user3);
        System.out.println("222222222222222222222222222");
//        userMapper.insertBatch(list);
    }
}
