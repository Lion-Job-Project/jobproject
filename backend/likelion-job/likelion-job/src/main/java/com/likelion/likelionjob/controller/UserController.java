package com.likelion.likelionjob.controller;

import com.likelion.likelionjob.dto.UserDto;
import com.likelion.likelionjob.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("/user")
    public UserDto findOne(@RequestParam("name") String name){
        return userService.findOne(name);
    }
    @PostMapping("/user")
    public UserDto save(@RequestBody UserDto dto){
        return userService.save(dto);
    }
    @DeleteMapping("/user")
    public void delete(@RequestParam("name") String name){
        userService.deleteOne(name);
    }
}
