package com.myblog.dao;

import com.myblog.entity.Admin;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

public interface AdminDao {

    Admin findAdmin(@Param("account") String account, @Param("password") String password);
}
