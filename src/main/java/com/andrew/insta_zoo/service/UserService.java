package com.andrew.insta_zoo.service;

import com.andrew.insta_zoo.dto.UserDTO;
import com.andrew.insta_zoo.model.User;
import com.andrew.insta_zoo.payload.request.SignupRequest;
import org.springframework.stereotype.Service;

import java.security.Principal;

@Service
public interface UserService {

    User createUser(SignupRequest userIn);

    User updateUser(UserDTO userDTO, Principal principal);

    User getCurrentUser(Principal principal);

    User getUserById(Long id);
}
