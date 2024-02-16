package com.beditor.ckeditor.controller;

import com.beditor.ckeditor.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ListController {

    private ContentService contentService;

    @Autowired
    public ListController(ContentService contentService){
        this.contentService = contentService;
    }

    @RequestMapping("/list")
    public String listPage(Model model){

        model.addAttribute("ContentList",contentService.selectContent());

        System.out.println("list: "+contentService.selectContent().toString());

        return "list";
    }
}
