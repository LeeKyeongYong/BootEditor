package com.beditor.ckeditor.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class ContentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String title;
    @Lob
    private String content;
}