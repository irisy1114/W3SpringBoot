package edu.wctc.w3springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ExperienceController {
    @GetMapping("/experience")
    public String showExperience() {
        return "pages/baking-experience";
    }
}
