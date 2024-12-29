package com.quiestions.repo;

import com.quiestions.entities.Question;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuestionRepository extends JpaRepository<Question , Long> {

    List<Question> findByquizId(Long quizId);
}
