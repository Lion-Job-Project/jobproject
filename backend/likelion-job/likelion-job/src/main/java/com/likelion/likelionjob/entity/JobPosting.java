package com.likelion.likelionjob.entity;

import com.likelion.likelionjob.dto.JobPostingDto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@Getter
@Setter
@ToString
public class JobPosting {
    @Id @GeneratedValue
    private Integer id;
    private String companyName;
    private String position;
    private String description;
    private String applicationLink;

    public JobPosting(String companyName, String position, String description, String applicationLink) {
        this.companyName = companyName;
        this.position = position;
        this.description = description;
        this.applicationLink = applicationLink;
    }
    public JobPostingDto toDto(){
        return new JobPostingDto(this.id,this.companyName,this.position,this.description,this.applicationLink);
    }
}
