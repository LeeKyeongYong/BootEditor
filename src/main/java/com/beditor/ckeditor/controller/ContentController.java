package com.beditor.ckeditor.controller;

import com.beditor.ckeditor.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class ContentController {

    private ContentService contentService;

    @Autowired
    public ContentController(ContentService contentService){
        this.contentService = contentService;
    }

    @RequestMapping("/content/{id}")
    public String contentPage(@PathVariable("id")String id, Model model){

        System.out.println("id: "+id);
        model.addAttribute("Content",contentService.selectOneContent(id));
        return "content";
    }
}
