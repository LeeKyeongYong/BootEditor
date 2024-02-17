package com.beditor.ckeditor.controller;

import com.beditor.ckeditor.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartRequest;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Controller
public class ImageController {

    private ImageService imageService;

    @Autowired
    public ImageController(ImageService imageService){
        this.imageService = imageService;
    }

    @PostMapping("/image/upload")
    @ResponseBody
    public Map<String , Object> imageUpload(MultipartRequest req) throws Exception{
        Map<String,Object> respData = new HashMap<>();

        try{
            String s3Url = imageService.imageUpload(req);
            respData.put("uploaded",true);
            respData.put("url",s3Url);

            return respData;
        }catch(IOException e){
            respData.put("uploaded",false);
            return respData;
        }
    }
}
