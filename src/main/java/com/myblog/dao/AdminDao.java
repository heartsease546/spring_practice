package com.myblog.dao;

import com.myblog.entity.Admin;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

public interface AdminDao {

    // @Select("SELECT * FROM tbl_admin " +
    //         "WHERE account = #{account, jdbcType = VARCHAR} AND password = #{password, jdbcType = VARCHAR}")
    Admin findAdmin(@Param("account") String account, @Param("password") String password);

    int checkAdmin(@Param("account") String account);
}
