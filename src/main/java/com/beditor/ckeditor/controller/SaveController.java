package com.beditor.ckeditor.controller;

import com.beditor.ckeditor.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.beditor.ckeditor.dto.SaveDTO;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SaveController {

    private ContentService contentService;

    @Autowired
    public SaveController(ContentService contentService){
        this.contentService=contentService;
    }
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String savePage(SaveDTO dto){

        contentService.saveContent(dto);
        System.out.println("request: "+dto);

        return "redirect:/";
    }
    @PostMapping("/save/{id}")
    public String updateLogic(SaveDTO dto, @PathVariable("id") String id){
        contentService.updateOnContent(dto,id);
        return "redirect:/content/"+id;
    }
}
