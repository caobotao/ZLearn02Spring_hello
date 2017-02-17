package com.cbt.service.impl;

import com.cbt.dao.UserDao;
import com.cbt.service.UserService;

public class UserServiceImpl implements UserService {
    private UserDao userDao = null;

    @Override
    public void getUser() {
	userDao.getUser();
    }

    public void setUserDao(UserDao userDao) {
	this.userDao = userDao;
    }
}
