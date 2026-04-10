package com.fsad.artgallery.controller;

import com.fsad.artgallery.model.AuthUser;
import com.fsad.artgallery.repository.AuthUserRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin(origins = "*")
public class AuthController {
    private final AuthUserRepository authUserRepository;

    public AuthController(AuthUserRepository authUserRepository) {
        this.authUserRepository = authUserRepository;
    }

    @PostMapping("/signup")
    public ResponseEntity<?> signup(@RequestBody AuthUser user) {
        if (authUserRepository.existsByEmail(user.getEmail())) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body(Map.of("message", "Email already exists"));
        }
        AuthUser saved = authUserRepository.save(user);
        return ResponseEntity.ok(Map.of(
                "id", saved.getId(),
                "fullname", saved.getFullname(),
                "email", saved.getEmail(),
                "message", "Signup successful"
        ));
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody AuthUser loginUser) {
        Optional<AuthUser> user = authUserRepository.findByEmail(loginUser.getEmail());
        if (user.isPresent() && user.get().getPassword().equals(loginUser.getPassword())) {
            return ResponseEntity.ok(Map.of(
                    "id", user.get().getId(),
                    "fullname", user.get().getFullname(),
                    "email", user.get().getEmail()
            ));
        }
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(Map.of("message", "Invalid email or password"));
    }
}
