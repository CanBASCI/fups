package com.api.gateway.controller;

import com.api.gateway.configuration.security.JwtUtils;
import com.api.gateway.dto.auth.AuthenticationRequest;
import com.api.gateway.operation.UserOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api_gw/auth", produces = MediaType.APPLICATION_JSON_VALUE)
@RequiredArgsConstructor
public class AuthenticationController {
    private final AuthenticationManager authenticationManager;
    private final UserOperation userOperation;
    private final JwtUtils jwtUtils;

    @PostMapping("/authenticate")
    ResponseEntity<String> authenticate(@RequestBody AuthenticationRequest request){
        try {
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(request.getUserName(), request.getPassword()));
            final UserDetails userDetails = userOperation.loadUserByUsername(request.getUserName());
            if(userDetails != null){
                return ResponseEntity.ok().body(jwtUtils.generateToken(userDetails));
            }
        }
        catch (Exception ex)
        {
            return ResponseEntity.status(403).body(ex.getMessage());

        }
        return ResponseEntity.status(404).body("Some error has occurred");
    }
}
