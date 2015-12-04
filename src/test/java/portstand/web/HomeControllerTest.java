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

    @Test
    public void testResumePage() throws Exception {
        mockMvc.perform(get("/resume"))
                .andExpect(view().name("resume"));
    }

    @Test
    public void testCVPage() throws Exception {
        mockMvc.perform(get("/cv"))
                .andExpect(view().name("cv"));
    }

    @Test
    public void testPortfolioPage() throws Exception {
        mockMvc.perform(get("/portfolio"))
                .andExpect(view().name("portfolio"));
    }

    @Test
    public void testContactsPage() throws Exception {
        mockMvc.perform(get("/contacts"))
                .andExpect(view().name("contacts"));
    }

}
