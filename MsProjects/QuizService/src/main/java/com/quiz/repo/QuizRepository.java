package com.quiz.repo;

import com.quiz.entities.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizRepository extends JpaRepository<Quiz , Long> {

}
