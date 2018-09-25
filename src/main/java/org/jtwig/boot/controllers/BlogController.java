/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jtwig.boot.controllers;

import java.util.Arrays;
import org.jtwig.boot.models.Post;
import org.jtwig.boot.repositories.UserRepository;
import org.jtwig.boot.services.NotificationService;
import org.jtwig.boot.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

import static java.util.stream.Collectors.*;
import org.jtwig.boot.models.User;
import org.jtwig.boot.services.PostServiceJpaImpl;
import org.springframework.ui.ModelMap;

@Controller
public class BlogController {
    
    //@Autowired
    private PostService postService;
    
    @RequestMapping("/blog")
    public String posts (ModelMap model) {
       //List<Post> latest3posts = postService.findLatest5();
        return "blog";
    }
    
    @RequestMapping("/post/{id}")
    public String posts (ModelMap model,@PathVariable("id") String id) {
       //Post latest3posts = postService.findById(Long.parseLong(id));
        return "post";
    }
}