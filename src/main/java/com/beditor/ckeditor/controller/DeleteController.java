package com.beditor.ckeditor.controller;

import com.beditor.ckeditor.dto.SaveDTO;
import com.beditor.ckeditor.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DeleteController {

    private ContentService contentService;
    @Autowired
    public DeleteController(ContentService contentService){
        this.contentService=contentService;
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.POST)
    public String deletePage(@PathVariable("id") String id){

        contentService.deleteId(id);
        System.out.println("delete: "+id);

        return "redirect:/list";
    }

}
