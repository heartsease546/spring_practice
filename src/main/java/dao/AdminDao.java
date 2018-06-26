package dao;

import domain.Admin;

public interface AdminDao {

    Admin findAdmin(String account, String password);
}
