package com.likelion.likelionjob.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Resume {
    @Id @GeneratedValue
    private Integer id;

    private String title;

    private String content;

    public Resume(String title, String content) {
        this.title = title;
        this.content = content;
    }
}
