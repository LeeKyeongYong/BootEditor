package com.beditor.ckeditor.service;

import com.beditor.ckeditor.dto.SaveDTO;
import com.beditor.ckeditor.entity.ContentEntity;
import com.beditor.ckeditor.repository.ContentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContentService {

    private ContentRepository contentRepository;

    @Autowired
    public ContentService(ContentRepository contentRepository) {
        this.contentRepository = contentRepository;
    }

    public void saveContent(SaveDTO dto) {

        String title = dto.getTitle();
        String content = dto.getContent();

        ContentEntity content1 = new ContentEntity();
        content1.setTitle(title);
        content1.setContent(content);

        contentRepository.save(content1);

        return;

    }

    public List<ContentEntity> selectContent() {
        return contentRepository.findAll();
    }

    public ContentEntity selectOneContent(String id) {
        int editId = Integer.parseInt(id);
        return contentRepository.findById(editId);
    }

    public void deleteId(String id) {
        int deleteId = Integer.parseInt(id);
        contentRepository.deleteById(deleteId);
    }

    public void updateOnContent(SaveDTO dto, String id) {
        int no = Integer.parseInt(id);
        ContentEntity content1 = new ContentEntity();
        content1.setId(no);
        content1.setTitle(dto.getTitle());
        content1.setContent(dto.getContent());
        contentRepository.saveAndFlush(content1);

    }
}