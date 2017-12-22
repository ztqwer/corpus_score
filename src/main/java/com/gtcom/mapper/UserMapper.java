package com.gtcom.mapper;

import org.springframework.stereotype.Repository;

import com.gtcom.bean.user.User;
import com.gtcom.config.db.Mapper;

/**
 * Created by Administrator on 2017/11/28.
 */
@Repository
public interface UserMapper extends Mapper<User>{

//    public void insertBatch(List<User> list);


//    public void insert(User user);

        public int addUser(User user);

//        public User getUserByName(String userName);

}
