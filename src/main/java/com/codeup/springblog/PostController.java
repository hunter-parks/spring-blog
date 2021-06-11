package com.codeup.springblog;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PostController {

    // This posts to index page
  @GetMapping("/posts")
    @ResponseBody
    public String posts() {
      return "This is the index page";
  }

  // Views a single posts with specific id
  @GetMapping("/posts{id}")
    @ResponseBody
    public String id(@PathVariable long id) {
      return "The id number is: " + id;
  }

  // Viewing the create form
    @GetMapping("/posts/create")
    @ResponseBody
    public String create() {
        return "Viewing the create form!";
    }

    // Able to create a post
    @GetMapping("/posts/create")
    @ResponseBody

    public String createForm() {
      return "Create Form";
    }


}
