package com.myblog.dao.impl;

import com.myblog.entity.Admin;
import com.myblog.dao.AdminDao;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("adminDao")
public class AdminDaoImpl implements AdminDao {

    @Override
    public Admin findAdmin(String account, String password) {
        return new Admin();
    }
}
