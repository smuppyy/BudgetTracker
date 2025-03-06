package com.sohanm.BudgetTracker.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.google.common.base.Optional;
import com.sohanm.BudgetTracker.Model.ERole;
import com.sohanm.BudgetTracker.Model.Role;

public interface RoleRepository extends MongoRepository<Role, String> {
    Optional<Role> findByName(ERole name);
} 

