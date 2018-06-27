package com.myblog.service;

import com.myblog.entity.Admin;

public interface AdminService {

    Admin getAdmin(String account, String password);
}
