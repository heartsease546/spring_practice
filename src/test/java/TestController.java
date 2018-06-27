import com.myblog.controller.AdminController;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

public class TestController {

    @Test
    public void testAdminController() throws java.lang.Exception {
        AdminController controller = new AdminController();
        MockMvc mock = standaloneSetup(controller).build();
        mock.perform(get("/admin/index")).andExpect(view().name("home"));
    }
}
