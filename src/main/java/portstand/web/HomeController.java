package portstand.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
//@RequestMapping("/")
public class HomeController {

    @RequestMapping(value = "/", method = GET)
    public String home(Model model) {
        return "index";
    }

    @RequestMapping(value = "/resume", method = GET)
    public String resume(Model model) {
        return "resume";
    }

    @RequestMapping(value = "/contacts", method = GET)
    public String contacts(Model model) {
        return "contacts";
    }

    @RequestMapping(value = "/cv", method = GET)
    public String cv(Model model) {
        return "cv";
    }

    @RequestMapping(value = "/portfolio", method = GET)
    public String portfolio(Model model) {
        return "portfolio";
    }
}
