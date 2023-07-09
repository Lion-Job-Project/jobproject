package com.likelion.likelionjob.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResumeRequestDto {
    private Integer userId;
    private String title;
    private String content;
}
