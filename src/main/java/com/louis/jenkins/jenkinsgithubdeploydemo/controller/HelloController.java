package com.louis.jenkins.jenkinsgithubdeploydemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @date : 2021/8/24
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("/say")
    public String say(@RequestParam("name") String name) {
        return "Hello " + name + " !";
    }

    @GetMapping("/sayNew")
    public String sayNew(@RequestParam("name") String name) {
        return "Hello  new" + name + " !";
    }
}
