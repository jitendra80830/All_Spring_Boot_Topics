package com.quiestions.serviceImpl;

import com.quiestions.entities.Question;
import com.quiestions.repo.QuestionRepository;
import com.quiestions.service.QuestionsServices;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionsServices {

    private QuestionRepository questionRepository;

    private Logger logger = LoggerFactory.getLogger(QuestionServiceImpl.class);

    public QuestionServiceImpl(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }


    @Override
    public Question create(Question question) {
       return questionRepository.save(question);
    }

    @Override
    public List<Question> getAll() {
        return questionRepository.findAll();
    }

    @Override
    public Question get(Long id) {
        logger.info("Getting records of Id: "+id);
        return questionRepository.findById(id).orElseThrow(() -> new RuntimeException("Question is not found."));
    }

    @Override
    public List<Question> getQuestionsOfQuiz(Long quizId) {
        return questionRepository.findByquizId(quizId);
    }
}
