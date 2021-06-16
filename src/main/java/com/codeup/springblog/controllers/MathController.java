package com.codeup.springblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MathController {

    // Adding Method
//    @GetMapping("/add/{number}/and/{number2}")
//    @ResponseBody
//
//    public String math (@PathVariable int number, @PathVariable int number2) {
//        return String.valueOf(number + number2);
//    }

    // Subtracting Method
//    @GetMapping("/subtract/{number}/from/{number2}")
//    @ResponseBody
//
//    public String math (@PathVariable int number, @PathVariable int number2) {
//        return String.valueOf(number2 - number);
//    }

    // Multiplying Method
//    @GetMapping("/multiply/{number}/and/{number2}")
//    @ResponseBody
//
//    public String math (@PathVariable int number, @PathVariable int number2) {
//        return String.valueOf(number * number2);
//    }

    // Dividing Method
    @GetMapping("/divide/{number}/by/{number2}")
    @ResponseBody

    public String math (@PathVariable int number, @PathVariable int number2) {
        return String.valueOf(number / number2);
    }
}
