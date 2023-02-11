package edu.wctc.w3springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CourseController {
    @GetMapping("/courses")
    public String showCourses() {
        return "pages/baking-courses";
    }
}
