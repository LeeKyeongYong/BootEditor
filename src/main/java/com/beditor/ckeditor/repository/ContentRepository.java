package com.beditor.ckeditor.repository;

import com.beditor.ckeditor.entity.ContentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContentRepository extends JpaRepository<ContentEntity,Integer> {

    ContentEntity findById(int id);

}
