package com.likelion.likelionjob.service;

import com.likelion.likelionjob.dto.ResumeRequestDto;
import com.likelion.likelionjob.dto.ResumeResponseDto;
import com.likelion.likelionjob.entity.JobPosting;
import com.likelion.likelionjob.entity.Resume;
import com.likelion.likelionjob.entity.User;
import com.likelion.likelionjob.repository.JobPostingRepository;
import com.likelion.likelionjob.repository.ResumeRepository;
import com.likelion.likelionjob.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ResumeService {
    private final ResumeRepository resumeRepository;
    private final UserRepository userRepository;
    private final JobPostingRepository jobPostingRepository;

    public ResumeResponseDto save(ResumeRequestDto dto){
        User foundUser = userRepository.findUserByName(dto.getName());
        JobPosting foundJobPosting = jobPostingRepository.findJobPostingByCompanyName(dto.getCompanyName());
        Resume saved = resumeRepository.save(new Resume(foundUser,foundJobPosting, dto.getContent()));
        return new ResumeResponseDto(saved.getId(), saved.getUser().toDto(),saved.getJobPosting().toDto(), saved.getContent());
    }
    public List<ResumeResponseDto> findResumeByName(String name){
        return resumeRepository.findResumeByName(name).stream()
                .map(entity ->new ResumeResponseDto(entity.getId(), entity.getUser().toDto(), entity.getJobPosting().toDto(), entity.getContent())).collect(Collectors.toList());
    }

    public void delete(Integer id){
        resumeRepository.deleteById(id);
    }

}
