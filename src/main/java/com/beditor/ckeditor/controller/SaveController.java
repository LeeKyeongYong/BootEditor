package com.beditor.ckeditor.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.beditor.ckeditor.dto.saveDTO;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SaveController {
    @RequestMapping(value = "/save", method = RequestMethod.GET)
    public String savePage(saveDTO dto){

        System.out.println("request: "+dto);

        return "redirect:/";

    }
}
