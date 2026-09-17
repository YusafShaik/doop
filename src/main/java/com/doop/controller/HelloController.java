package com.doop.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/hello")
    public Map<String, String> helloWorld() {
        Map<String, String> response = new HashMap<>();
        response.put("message", "Hello World!");
        response.put("status", "success");
        return response;
    }

    @GetMapping("/hello/{name}")
    public Map<String, String> helloName(@PathVariable String name) {
        Map<String, String> response = new HashMap<>();
        response.put("message", "Hello " + name + "!");
        response.put("status", "success");
        return response;
    }

    @GetMapping("/info")
    public Map<String, Object> getAppInfo() {
        Map<String, Object> info = new HashMap<>();
        info.put("appName", "Doop Application");
        info.put("version", "1.0.0");
        info.put("environment", "learning-deployment");
        return info;
    }
}
