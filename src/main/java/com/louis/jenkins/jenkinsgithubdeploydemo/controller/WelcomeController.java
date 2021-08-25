package com.louis.jenkins.jenkinsgithubdeploydemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : landon
 * @date : 2021/8/25
 */
@RestController
public class WelcomeController {

    @GetMapping("/")
    public String welcome() {
        return "Welcome";
    }
}
