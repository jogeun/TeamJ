package com.teamj.book.service;

import com.teamj.book.domain.User;
import com.teamj.book.domain.dto.UserDTO;
import com.teamj.book.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService implements UserServiceImpl{

    private final UserRepository userRepository;


    @Override
    public UserDTO findUser(int userNo) {
        User user = userRepository.findUser(userNo);
        System.out.println(user.getUserNo());
        UserDTO userDTO = new UserDTO();
        userDTO.setUserNo(user.getUserNo());
        userDTO.setUserName(user.getUserName());
        return userDTO;
    }
}
