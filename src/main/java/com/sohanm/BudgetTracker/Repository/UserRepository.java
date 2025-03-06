package com.sohanm.BudgetTracker.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.google.common.base.Optional;
import com.sohanm.BudgetTracker.Model.User;

public interface UserRepository extends MongoRepository<User, String> {
    Optional<User> findByUsername(String username);

    Boolean existsByUsername(String username);
  
    Boolean existsByEmail(String email);
}
