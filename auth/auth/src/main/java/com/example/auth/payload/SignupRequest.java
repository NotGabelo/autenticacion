package com.example.auth.payload;

import lombok.Data;

@Data
public class SignupRequest {
    private String email;
    private String password;
    private String displayName;
}
