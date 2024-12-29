package com.quiestions.controller;

import com.quiestions.entities.Question;
import com.quiestions.service.QuestionsServices;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/question")
public class QuestionsController {

    private QuestionsServices questionsServices;

    public QuestionsController(QuestionsServices questionsServices) {
        this.questionsServices = questionsServices;
    }

    @PostMapping
    public Question create(@RequestBody Question question){
        return questionsServices.create(question);
    }
    @GetMapping
    public List<Question> getAll(){
        return questionsServices.getAll();
    }

    @GetMapping("/{id}")
    public Question get(@PathVariable Long id){
        return questionsServices.get(id);
    }

    @GetMapping("/quiz/{quizId}")
    public List<Question> getQuestionsOfQuiz(@PathVariable Long quizId){
        return questionsServices.getQuestionsOfQuiz(quizId);
    }

}
