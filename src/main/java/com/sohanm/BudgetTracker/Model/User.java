package com.sohanm.BudgetTracker.Model;

import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;


@Document(collection = "Users")
public class User {

    @NotBlank
    @Size(max = 20)
    @Indexed(unique = true)
    private String username;
    @NotBlank
    @Size(max = 50)
    private String password;
    @NotBlank
    @Size(max = 100)
    private String email;
    
    private String role;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}