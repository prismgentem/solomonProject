package com.solomon.backend.solomonproject.repository;

import com.solomon.backend.solomonproject.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionsRepository extends JpaRepository<Question, Long> {
}
