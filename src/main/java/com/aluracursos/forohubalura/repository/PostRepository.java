package com.aluracursos.forohubalura.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.aluracursos.forohubalura.model.Post;

public interface PostRepository extends JpaRepository<Post, Long> {
}