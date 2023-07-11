package com.likelion.likelionjob.service;

import com.likelion.likelionjob.dto.LoginDto;
import com.likelion.likelionjob.dto.MessageDto;
import com.likelion.likelionjob.entity.User;
import com.likelion.likelionjob.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

@Service
@RequiredArgsConstructor
public class LoginService {
    private final UserRepository userRepository;
    public MessageDto login(LoginDto dto, HttpServletResponse response) {
        User found = userRepository.findUserByUsername(dto.getId());
        MessageDto returnmsg = new MessageDto();
        if(found !=null){
            if(found.getPassword().equals(dto.getPw())){
                Cookie cookie = new Cookie("ck",found.getId().toString());
                cookie.setMaxAge(60*60);//한시간 유지
                cookie.setPath("/");
                response.addCookie(cookie);
                returnmsg.setMsg("성공!");
                return returnmsg;
            }else {
                returnmsg.setMsg("비번 틀림");
                return returnmsg;
            }
        }
        else{
            returnmsg.setMsg("id 못찾음");
            return returnmsg;
        }
    }
}
