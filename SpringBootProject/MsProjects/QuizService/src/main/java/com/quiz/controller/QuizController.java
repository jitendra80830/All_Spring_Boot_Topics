package com.quiz.controller;

import com.quiz.entities.Quiz;
import com.quiz.services.QuizService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quiz")
public class QuizController {

    private Logger logger = LoggerFactory.getLogger(QuizController.class);

    private QuizService quizService;

    public QuizController(QuizService quizService) {
        this.quizService = quizService;
    }

    @PostMapping
    public Quiz create(@RequestBody Quiz quiz){
        logger.debug("Create Operations");
        return quizService.add(quiz);
    }

    @GetMapping
    public List<Quiz> getAll(){
        logger.debug("Get All operations");
        return quizService.getAll();
    }

    @GetMapping("/{id}")
    public Quiz get(@PathVariable Long id){
        logger.debug("Get quiz by id: "+id);
        return quizService.get(id);
    }
}
