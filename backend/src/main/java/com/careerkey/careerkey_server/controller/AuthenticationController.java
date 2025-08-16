package com.careerkey.careerkey_server.controller;

import com.careerkey.careerkey_server.entity.User;
import com.careerkey.careerkey_server.model.LoginResponse;
import com.careerkey.careerkey_server.model.LoginUserDto;
import com.careerkey.careerkey_server.model.RegisterUserDto;
import com.careerkey.careerkey_server.service.AuthenticationService;
import com.careerkey.careerkey_server.service.JwtService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RequestMapping("/auth")
@RestController
public class AuthenticationController {
    private final JwtService jwtService;

    private final AuthenticationService authenticationService;

    public AuthenticationController(JwtService jwtService, AuthenticationService authenticationService) {
        this.jwtService = jwtService;
        this.authenticationService = authenticationService;
    }

    @PostMapping("/signup")
    public ResponseEntity<User> register(@RequestBody RegisterUserDto registerUserDto) {
        User registeredUser = authenticationService.signup(registerUserDto);

        return ResponseEntity.ok(registeredUser);

    }

    @PostMapping("/signupUser")
    public ResponseEntity<User> registerUser(@ModelAttribute RegisterUserDto registerUserDto) {
        User registeredUser = authenticationService.signupUser(registerUserDto);
        return ResponseEntity.ok(registeredUser);
    }

    @PostMapping("/login")
    public ResponseEntity<LoginResponse> authenticate(@RequestBody LoginUserDto loginUserDto) {
        User authenticatedUser = authenticationService.authenticate(loginUserDto);

        String jwtToken = jwtService.generateToken(authenticatedUser);

        LoginResponse loginResponse = new LoginResponse().setToken(jwtToken).setExpiresIn(jwtService.getExpirationTime());

        return ResponseEntity.ok(loginResponse);
    }
}