package com.teamj.book.service;

import com.teamj.book.domain.User;
import com.teamj.book.domain.dto.UserDTO;

public interface UserServiceImpl {
    UserDTO findUser(int userNo);

}
