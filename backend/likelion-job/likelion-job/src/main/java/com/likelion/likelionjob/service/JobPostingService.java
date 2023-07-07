package com.likelion.likelionjob.service;

import com.likelion.likelionjob.dto.JobPostingDto;
import com.likelion.likelionjob.entity.JobPosting;
import com.likelion.likelionjob.repository.JobPostingRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class JobPostingService {
    private final JobPostingRepository jobPostingRepository;

    public JobPostingDto findOne(String companyName){
        JobPosting entity = jobPostingRepository.findJobPostingByCompanyName(companyName);
        return new JobPostingDto(entity.getId(), entity.getCompanyName(),entity.getPosition(),entity.getDescription(),entity.getApplicationLink());
    }
    public List<JobPostingDto> findAll(){
        return jobPostingRepository.findAll().stream().
                map(entity->new JobPostingDto(entity.getId(), entity.getCompanyName(),entity.getPosition(),entity.getDescription(),entity.getApplicationLink()))
                .collect(Collectors.toList());
    }
    public JobPostingDto save(JobPostingDto dto){
        JobPosting saved = jobPostingRepository.save(new JobPosting(dto.getCompanyName(), dto.getPosition(), dto.getDescription(), dto.getApplicationLink()));
        return new JobPostingDto(saved.getId(), saved.getCompanyName(),saved.getPosition(),saved.getDescription(),saved.getApplicationLink());
    }
    public void delete(String companyName){
        JobPosting entity = jobPostingRepository.findJobPostingByCompanyName(companyName);
        jobPostingRepository.delete(entity);
    }
}
