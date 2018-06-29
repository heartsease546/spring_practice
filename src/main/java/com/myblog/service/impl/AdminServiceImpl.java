package com.myblog.service.impl;

import com.myblog.dao.AdminDao;
import com.myblog.entity.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.myblog.service.AdminService;

@Service("adminService")
public class AdminServiceImpl implements AdminService {

    @Autowired
    public AdminDao adminDao;

    @Override
    public Admin getAdmin(String account, String password) {
        if (adminDao == null) {
            System.out.println("adminDao is null.");
            return new Admin();
        }
        return adminDao.findAdmin(account, password);
    }

    @Override
    public int checkAdmin(String account) {

        return adminDao.checkAdmin(account);
    }
}
