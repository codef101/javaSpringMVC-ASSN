package com.javamvcweb.repository;

import com.javamvcweb.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

    // You can add custom query methods here if needed
}
