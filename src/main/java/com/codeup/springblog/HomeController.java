package com.codeup.springblog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @GetMapping("/landingpage")
    @ResponseBody

    public String landPage() {
        return "<h1>This is the landing page!</h1>";
    }
}
