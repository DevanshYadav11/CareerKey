package com.careerkey.careerkey_server.service;

import com.careerkey.careerkey_server.entity.User;
//import com.careerkey.careerkey_server.model.UserDto;
import com.careerkey.careerkey_server.repos.UserRepository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;


@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(final UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> allUsers() {
        List<User> users = new ArrayList<>();
        userRepository.findAll().forEach(users::add);
        return users;
    }
}
