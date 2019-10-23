package com.iiht.assignment08.controller;

import com.iiht.assignment08.domain.ResultJson;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    @GetMapping("/welcome")
    public ResultJson<String> welcome() {
        return ResultJson.ok("welcome");
    }
}
