package com.likelion.likelionjob.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    private Integer id;
    private String name;
    private String username;
    private String password;

    public UserDto(String name, String username, String password) {
        this.name = name;
        this.username = username;
        this.password = password;
    }
}
