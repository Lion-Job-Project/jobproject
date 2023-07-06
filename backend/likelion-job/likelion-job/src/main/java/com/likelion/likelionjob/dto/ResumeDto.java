package com.likelion.likelionjob.dto;

import com.likelion.likelionjob.entity.JobPosting;
import com.likelion.likelionjob.entity.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Getter
@Setter
@AllArgsConstructor
public class ResumeDto {
    private User user ;

    private JobPosting jobPosting;

    private String content;

}
