package com.careerkey.careerkey_server.repos;

import com.careerkey.careerkey_server.entity.User;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@SpringBootApplication
@Repository
@EnableJpaRepositories(basePackages = "com.careerkey.careerkey_server.repos")
@EntityScan(basePackages = "com.careerkey.careerkey_server.entity")
public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByEmail(String email);
}