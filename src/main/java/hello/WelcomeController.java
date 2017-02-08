package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class WelcomeController {

    @GetMapping("/welcome")
    public String welcomeForm(Model model) {
        model.addAttribute("welcome", new Welcome());
        return "welcome";
    }

    @PostMapping("/welcome")
    public String welcomeSubmit(@ModelAttribute Welcome welcome) {
        return "result";
    }

}