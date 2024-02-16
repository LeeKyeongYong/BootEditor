package com.beditor.ckeditor.controller;

import com.beditor.ckeditor.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class EditorController {

    private ContentService contentService;

    @Autowired
    public EditorController(ContentService contentService){
        this.contentService=contentService;
    }

    @RequestMapping("/edit")
    public String editorPage(){
        return "editor";
    }


    @RequestMapping(value="/edit/{id}", method = RequestMethod.GET)
    public String updatePage(@PathVariable("id") String id, Model model){

        model.addAttribute("data",contentService.selectOneContent(id));
        System.out.println("들어오냐??: "+id);
        return "editor";
    }


}
