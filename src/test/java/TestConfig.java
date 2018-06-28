import com.myblog.dao.AdminDao;
import com.myblog.entity.Admin;
import com.myblog.service.AdminService;
import com.myblog.configure.RootConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {RootConfig.class})
public class TestConfig {

    @Autowired
    private AdminService adminService;

    // @Autowired
    // private AdminDao adminDao;

    @Test
    public void serviceShouldNotBeNull () {
        Admin admin = adminService.getAdmin("heartsease", "test123");
        assertNotNull(admin);
        System.out.println(adminService + ", " + admin);
    }
}
