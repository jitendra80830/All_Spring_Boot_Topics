package com.quiestions.service;

import com.quiestions.entities.Question;

import java.util.List;

public interface QuestionsServices {

    Question create(Question question);

    List<Question> getAll();

    Question get(Long id);

    List<Question> getQuestionsOfQuiz(Long quizId);
}
