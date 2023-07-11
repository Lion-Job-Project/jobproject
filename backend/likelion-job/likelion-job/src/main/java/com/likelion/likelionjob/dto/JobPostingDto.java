package com.likelion.likelionjob.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class JobPostingDto {
    private Integer id;
    private String companyName;
    private String position;
    private String description;
}
