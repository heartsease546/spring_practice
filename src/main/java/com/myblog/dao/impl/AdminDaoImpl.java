package com.myblog.dao.impl;

import com.myblog.entity.Admin;
import com.myblog.dao.AdminDao;
import org.springframework.stereotype.Repository;

@Repository("adminDao")
public class AdminDaoImpl implements AdminDao {

    @Override
    public Admin findAdmin(String account, String password) {
        return null;
    }
}
