package com.babay.SpringSecurity.Services;

import com.babay.SpringSecurity.Model.User;
import com.babay.SpringSecurity.dto.JwtAuthenticationResponse;
import com.babay.SpringSecurity.dto.RefreshTokenRequest;
import com.babay.SpringSecurity.dto.SigninRequest;
import com.babay.SpringSecurity.dto.SignupRequest;

public interface AuthenticationService {
    User signup(SignupRequest signupRequest);
    JwtAuthenticationResponse signin(SigninRequest signinRequest);

    JwtAuthenticationResponse refreshToken(RefreshTokenRequest refreshTokenRequest);
}
