package com.myblog.service.impl;

import com.myblog.dao.AdminDao;
import com.myblog.entity.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.myblog.service.AdminService;

import javax.annotation.Resource;

@Service
public class AdminServiceImpl implements AdminService {

    // @Autowired
    @Resource(name = "adminDao")
    private AdminDao adminDao;

    @Override
    public Admin getAdmin(String account, String password) {
        return adminDao.findAdmin(account, password);
    }
}
