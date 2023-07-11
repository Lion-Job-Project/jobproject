package com.likelion.likelionjob.controller;

import com.likelion.likelionjob.dto.ResumeRequestDto;
import com.likelion.likelionjob.dto.ResumeResponseDto;
import com.likelion.likelionjob.service.ResumeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequiredArgsConstructor
@CrossOrigin
public class ResumeController {
    private final ResumeService resumeService;

    @PostMapping("resume")
    public ResumeResponseDto save(@RequestBody ResumeRequestDto dto){
        return resumeService.save(dto);
    }
    @GetMapping("resume/{id}")
    public List<ResumeResponseDto> findById(@PathVariable("id") Integer id){
        return resumeService.findById(id);
    }
    @DeleteMapping("resume")
    public void deleteById(@RequestParam("id") Integer id){
        resumeService.delete(id);
    }
}

//@RestController
//@RequiredArgsConstructor
//@CrossOrigin
//public class ResumeController {
//    private final ResumeService resumeService;
//
//    @PostMapping("resume")
//    public ResumeResponseDto save(@RequestBody ResumeRequestDto dto){
//        return resumeService.save(dto);
//    }
//    @GetMapping("resume/{name}")
//    public List<ResumeResponseDto> findResumeByUsername(@PathVariable("name") String name){
//        return resumeService.findResumeByName(name);
//    }
//    @DeleteMapping("resume")
//    public void deleteById(@RequestParam("id") Integer id){
//        resumeService.delete(id);
//    }
//}
