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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "jobposting_id")
    private JobPosting jobPosting;

    private String content;

    public Resume(User user, JobPosting jobPosting, String content) {
        this.user = user;
        this.jobPosting = jobPosting;
        this.content = content;
    }
}
