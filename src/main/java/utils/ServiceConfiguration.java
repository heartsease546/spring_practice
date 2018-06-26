package utils;

import org.springframework.context.annotation.Bean;
import service.AdminService;
import service.impl.AdminServiceImpl;

public class ServiceConfiguration {

    @Bean
    public AdminService getAdminService() {
        return new AdminServiceImpl();
    }
}
