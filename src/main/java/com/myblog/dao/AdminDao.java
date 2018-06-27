package com.myblog.dao;

import com.myblog.entity.Admin;

public interface AdminDao {

    Admin findAdmin(String account, String password);
}
