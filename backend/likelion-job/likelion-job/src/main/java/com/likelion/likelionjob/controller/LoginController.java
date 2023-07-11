package com.likelion.likelionjob.controller;

import com.likelion.likelionjob.dto.LoginDto;
import com.likelion.likelionjob.dto.MessageDto;
import com.likelion.likelionjob.service.LoginService;
import com.likelion.likelionjob.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;

@RestController
@RequiredArgsConstructor
@CrossOrigin
public class LoginController {
    private final LoginService loginService;

    @PostMapping("/login")
    public MessageDto login(@RequestBody LoginDto dto, HttpServletResponse response){
        return loginService.login(dto,response);
    }
}
