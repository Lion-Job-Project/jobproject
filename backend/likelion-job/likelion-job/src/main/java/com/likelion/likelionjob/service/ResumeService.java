package com.likelion.likelionjob.service;

import com.likelion.likelionjob.dto.ResumeDto;
import com.likelion.likelionjob.entity.Resume;
import com.likelion.likelionjob.repository.ResumeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ResumeService {
    private final ResumeRepository resumeRepository;

//    public ResumeDto save(ResumeDto dto){
//        Resume saved = resumeRepository.save(new Resume(dto.getUser(),dto.getJobPosting(), dto.getContent()));
//        return new ResumeDto(saved.getUser(),saved.getJobPosting(), saved.getContent());
//    }

}
