package com.wsh.enjoygit.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @RequestMapping("/")
    public String index(){
        return "hello git! v0.7 -merge合并分支处理";
    }


}
