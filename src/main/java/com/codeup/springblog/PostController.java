package com.codeup.springblog;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PostController {
  // dependency injection
  private final PostRepository postDao;
  private final UserRepository userDao;

  // public constructor for above
  public PostController(PostRepository postDao, UserRepository userDao) {
    this.postDao = postDao;
    this.userDao = userDao;
  }

  @GetMapping("/posts")
  public String allPost(Model model) {
    model.addAttribute("posts", postDao.findAll());
    return "posts/index";
  }

  // Views a single posts with specific id
  @GetMapping("/posts/{id}")
    public String id(@PathVariable long id, Model model) {
      Post post = postDao.getOne(id);
      model.addAttribute("id", postDao.getById(id));

      return "posts/show";
  }

  // Viewing the create form
    @GetMapping("/posts/create")
    public String create(Model model) {
      model.addAttribute("post", new Post());
       return "posts/create";
    }

    @PostMapping("/posts/create")
    public String postsCreate(@RequestParam(name = "title") String title, @RequestParam(name = "body") String body) {

    User user = userDao.getById(1L);
    Post newPost = new Post(title,body,user,null);

    Post savePost = postDao.save(newPost);

    return "redirect:/posts/" + savePost.getId();
    }

    @PostMapping("/posts/delete/{n}")
    public String postDelete(@PathVariable Long n) {

    postDao.deleteById(n);
    return "redirect/posts";
    }

    @GetMapping("/posts/edit/{id}")
    public String postEditPage(@PathVariable long id, Model model) {
    Post post = postDao.getById(id);
    model.addAttribute("post", post);

    return "posts/edit";
    }

    @PostMapping("/posts/edit/{id}")
    public String postEdit(@PathVariable long id, @RequestParam(name = "title") String title, @RequestParam(name = "body") String body, @RequestParam(name = "imageURL") String imageURL, @RequestParam(name = "imageDescription") String imageDescription) {

    Post post = postDao.getById(id);
    PostImage image1 = new PostImage(imageURL, imageDescription, post);
      List<PostImage> images = new ArrayList<>();
      images.add(image1);
      post.setTitle(title);
      post.setBody(body);
      post.setImages(images);

      postDao.save(post);
      return "redirect:/posts";
    }



}
