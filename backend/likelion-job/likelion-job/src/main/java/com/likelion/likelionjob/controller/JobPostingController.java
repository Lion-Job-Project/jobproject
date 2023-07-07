package com.likelion.likelionjob.controller;

import com.likelion.likelionjob.dto.JobPostingDto;
import com.likelion.likelionjob.service.JobPostingService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class JobPostingController {
    private final JobPostingService jobPostingService;

    @GetMapping("/jobposts/{companyName}")
    public JobPostingDto findOne(@PathVariable("companyName") String companyName){
        return jobPostingService.findOne(companyName);
    }
    @GetMapping("/jobposts")
    public List<JobPostingDto> findAll(){
        return jobPostingService.findAll();
    }
    @PostMapping("/jobposts")
    public JobPostingDto save(@RequestBody JobPostingDto dto){
        return jobPostingService.save(dto);
    }
    @DeleteMapping("/jobposts/{companyName}")
    public void delete(@PathVariable("companyName") String companyName){
        jobPostingService.delete(companyName);
    }

}
