package com.bridgelabz.springrestapicallsdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.bridgelabz.springrestapicallsdemo.model.User;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {

    @RequestMapping(value = { "", "/", "/home" })
    public String sayHello() {
        return "Hello from bridgelabz!";
    }
    @RequestMapping(value = "/query", method = RequestMethod.GET)
    public String sayHello(@RequestParam(value = "name") String name) {
        return "Hello " + name + "!";
    }
    @GetMapping("/param/{name}")
    public String sayHelloParam(@PathVariable String name) {
        return "Hello " + name + "!";
    }
    @PostMapping("/post")
    public String sayHello(@RequestBody User user) {

        return "Hello " + user.getFirstName() + " " + user.getLastName();
    }
}