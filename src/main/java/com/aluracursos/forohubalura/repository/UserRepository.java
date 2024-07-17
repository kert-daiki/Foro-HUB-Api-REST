package com.aluracursos.forohubalura.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.aluracursos.forohubalura.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}