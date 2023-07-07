package com.likelion.likelionjob.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResumeRequestDto {
    private String name;
    private String companyName;
    private String content;
}
