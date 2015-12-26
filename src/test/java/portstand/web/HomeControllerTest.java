package portstand.web;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

public class HomeControllerTest {
    HomeController controller = new HomeController();
    MockMvc mockMvc = standaloneSetup(controller).build();

    @Test
    public void testIndexPage() throws Exception {
        mockMvc.perform(get("/"))
                .andExpect(view().name("index"));
    }
}
