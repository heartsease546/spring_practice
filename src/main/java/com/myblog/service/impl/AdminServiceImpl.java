package com.myblog.service.impl;

import com.myblog.dao.AdminDao;
import com.myblog.dao.impl.AdminDaoImpl;
import com.myblog.entity.Admin;
import org.springframework.stereotype.Service;
import com.myblog.service.AdminService;

@Service
public class AdminServiceImpl implements AdminService {

    @Override
    public Admin getAdmin(String account, String password) {
        AdminDao adminDao = new AdminDaoImpl();
        return adminDao.findAdmin(account, password);
    }
}
