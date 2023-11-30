package com.teamj.book.controller;

import com.teamj.book.domain.dto.UserDTO;
import com.teamj.book.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/find/{userNo}")
    public UserDTO findUser(@PathVariable("userNo") int userNo){

        return userService.findUser(userNo);
    }

}
