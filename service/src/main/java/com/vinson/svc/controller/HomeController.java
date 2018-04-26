package com.vinson.svc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by JiangWeixin on 2018/2/3.
 */
@Controller
public class HomeController {

    @GetMapping("/index")
    public String index(Model model) {
        model.addAttribute("menus", null);
        model.addAttribute("name", "name");
        model.addAttribute("username", "x");
        return "index_v1";
    }
}