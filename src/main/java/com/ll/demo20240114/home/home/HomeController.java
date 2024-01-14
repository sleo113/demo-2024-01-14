package com.ll.demo20240114.home.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    @RequestMapping("/hello")
    @ResponseBody
    public String Home(){
        return "안녕하세요";
    }

}
