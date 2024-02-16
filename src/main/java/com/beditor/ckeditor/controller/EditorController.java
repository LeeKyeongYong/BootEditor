package com.beditor.ckeditor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class EditorController {
    @RequestMapping("/edit")
    public String editorPage(){
        return "editor";
    }
}
