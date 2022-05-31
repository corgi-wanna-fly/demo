package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MinhController {

    @GetMapping("/minh")
    @ResponseBody
    public String minh(){
        return "congminh";
    }

    @GetMapping("/minh2")
    @ResponseBody
    public String minh2(){
        return "congminh2";
    }
}
