package com.louis.jenkins.jenkinsgithubdeploydemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author : landon
 * @date : 2021/8/25
 */
@RestController
public class WelcomeController {

    @GetMapping("/")
    public String welcome(HttpServletResponse response) throws IOException {
        response.sendRedirect("/test");
        return "";
    }

    @GetMapping("/test")
    public String testRedirect() {

        return "YES";
    }
}
