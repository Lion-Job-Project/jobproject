package com.likelion.likelionjob.dto;

import com.likelion.likelionjob.entity.JobPosting;
import com.likelion.likelionjob.entity.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ResumeResponseDto {
    private Integer id;
    private String title;
    private String content;
}
