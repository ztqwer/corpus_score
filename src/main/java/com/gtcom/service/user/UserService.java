package com.gtcom.service.user;

import com.gtcom.bean.user.User;

/**
 * Created by Administrator on 2017/11/28.
 */
public interface UserService {

    default void insertBatch(){};

    public void insert();

    public User getUserByName(String userName);
}
