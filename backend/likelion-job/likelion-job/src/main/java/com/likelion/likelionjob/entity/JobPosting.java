package com.likelion.likelionjob.entity;

import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
public class JobPosting {
    @Id @GeneratedValue
    private Integer id;
    private String company_name;
    private String position;
    private String description;
    private String application_link;
}
