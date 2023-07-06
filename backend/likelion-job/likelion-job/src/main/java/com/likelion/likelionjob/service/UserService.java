package com.likelion.likelionjob.service;

import com.likelion.likelionjob.dto.UserDto;
import com.likelion.likelionjob.entity.User;
import com.likelion.likelionjob.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public UserDto findOne(String name){
        User entity = userRepository.findUserByName(name);
        return new UserDto(entity.getName(), entity.getUsername(), entity.getPassword());
    }
    public UserDto save(UserDto dto){
        User saved = userRepository.save(new User(dto.getName(), dto.getUsername(), dto.getPassword()));
        return new UserDto(saved.getName(), saved.getUsername(), saved.getPassword());
    }
    public void deleteOne(String name){
        User entity = userRepository.findUserByName(name);
        userRepository.delete(entity);
    }
}
