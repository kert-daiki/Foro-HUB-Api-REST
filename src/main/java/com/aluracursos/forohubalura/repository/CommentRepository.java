package com.aluracursos.forohubalura.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.aluracursos.forohubalura.model.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}