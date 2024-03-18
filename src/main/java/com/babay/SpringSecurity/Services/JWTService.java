package com.babay.SpringSecurity.Services;

import com.babay.SpringSecurity.Model.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

public interface JWTService {
    String generateToken(UserDetails userDetails);
    String extractUsername(String token);
    boolean isTokenValid(String token ,UserDetails userDetails );

    String generateRefreshToken(Map<String , Object> extraClaims , UserDetails userDetails);
}
