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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user ;

    private String title;

    private String content;

    public Resume(User user, String title, String content) {
        this.user = user;
        this.title = title;
        this.content = content;
    }
}
