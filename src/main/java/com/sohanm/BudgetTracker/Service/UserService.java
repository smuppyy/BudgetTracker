package com.sohanm.BudgetTracker.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.common.base.Optional;
import com.sohanm.BudgetTracker.Model.User;
import com.sohanm.BudgetTracker.Repository.UserRepository;

@Service
public class UserService {
    
    @Autowired   
    private UserRepository userRepository;

     public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    public User addUser(User user){
        return userRepository.save(user);
    }

    public Optional<User> getUserbyUserName(String username) {
        return userRepository.findByUsername(username);     
    }
 
}
