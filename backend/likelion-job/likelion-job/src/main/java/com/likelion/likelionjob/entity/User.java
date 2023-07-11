package com.likelion.likelionjob.entity;

import com.likelion.likelionjob.dto.UserDto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@Getter
@Setter
@ToString
public class User {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String username;
    private String password;


    public User(String name, String username, String password) {
        this.name = name;
        this.username = username;
        this.password = password;
    }
    public UserDto toDto(){
        return new UserDto(this.id,this.name,this.username,this.password);
    }
}
