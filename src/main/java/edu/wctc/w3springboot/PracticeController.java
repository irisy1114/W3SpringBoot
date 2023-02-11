package edu.wctc.w3springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PracticeController {
    @GetMapping("/practice")
    public String showPractice() {
        return "pages/practice";
    }
}
