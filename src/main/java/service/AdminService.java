package service;

import domain.Admin;

public interface AdminService {

    Admin getAdmin(String account, String password);
}
