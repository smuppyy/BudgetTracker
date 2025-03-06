package com.sohanm.BudgetTracker.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sohanm.BudgetTracker.Model.User;
import com.sohanm.BudgetTracker.Service.UserService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private final UserService userService;

    //@Autowired
    //private final PasswordEncoder passwordEncoder;


    /*
    * Register User
    */
    @PostMapping("/register")
    public ResponseEntity createUser(@RequestBody User user) {
        if (userService.getUserbyUserName(user.getUsername()).isPresent()) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body("UserName already taken");
        }

        //user.setPassword(passwordEncoder.encode(user.getPassword()));
        User save = userService.addUser(user);
        return ResponseEntity.ok(HttpStatus.CREATED);
    }
 
    /*
    * Get All Users. Admin only operation
    */
    @GetMapping("/users")
    public List<User> getUsers() {
        return userService.getAllUsers();
    }

    /*
    * Health Check
    */
    @GetMapping("/health")
    public String health(){
        return "Pass";
    }
}
