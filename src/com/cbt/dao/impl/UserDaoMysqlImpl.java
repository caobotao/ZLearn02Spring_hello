package com.cbt.dao.impl;

import com.cbt.dao.UserDao;

public class UserDaoMysqlImpl implements UserDao {

    @Override
    public void getUser() {
	System.out.println("mysql��ȡ�û�����");
    }

}
