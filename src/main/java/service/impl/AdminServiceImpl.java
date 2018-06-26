package service.impl;

import dao.AdminDao;
import dao.impl.AdminDaoImpl;
import domain.Admin;
import service.AdminService;

public class AdminServiceImpl implements AdminService {

    @Override
    public Admin getAdmin(String account, String password) {
        AdminDao adminDao = new AdminDaoImpl();
        return adminDao.findAdmin(account, password);
    }
}
