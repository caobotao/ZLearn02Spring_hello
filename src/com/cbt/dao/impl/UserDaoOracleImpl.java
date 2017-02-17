package com.cbt.dao.impl;

import com.cbt.dao.UserDao;

public class UserDaoOracleImpl implements UserDao {

    @Override
    public void getUser() {
	System.out.println("oracle获取用户数据");
    }

}
