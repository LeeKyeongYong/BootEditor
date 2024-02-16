package com.beditor.ckeditor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class ContentController {
    @RequestMapping("/content")
    public String contentPage(){
        return "content";
    }
}
