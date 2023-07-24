package com.example.mongodbdemo.Controller;

import com.example.mongodbdemo.Model.jobPosts;
import com.example.mongodbdemo.Repository.postRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@RestController
public class PostController {
    @Autowired
    postRepo p;

    @ApiIgnore
    @RequestMapping("/")
    public void redirect(HttpServletResponse response) throws IOException {
        response.sendRedirect("/swagger-ui");
    }

    @GetMapping("/posts")
    public List<jobPosts> getAll() {
        return p.findAll();
    }
}
