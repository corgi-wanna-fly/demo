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

    @GetMapping("/minh3")
    @ResponseBody
    public String minh3(){
        return "congminh2";
    }

    @GetMapping("/minh4")
    @ResponseBody
    public String minh4(){
        return "congminh2";
    }

    @GetMapping("/minh5")
    @ResponseBody
    public String minh5(){
        return "congminh2";
    }
}
