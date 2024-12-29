package ashok.in.controllers;

import ashok.in.AllAPI.APIs;
import ashok.in.CustomeExeption.BadAPIRequest;
import ashok.in.model.Question;
import ashok.in.service.QuestionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/question")
public class QuestionsController implements APIs<Question , String> {

    @Autowired
    QuestionServiceImpl questionService;

    @Override
    public ResponseEntity<List<Question>> get() throws BadAPIRequest {
        return questionService.getAllQuestions();
    }

    @Override
    public ResponseEntity<Question> create(Question question) throws BadAPIRequest {
        return questionService.createQuestions(question);
    }

    @Override
    public ResponseEntity<List<Question>> getBySpecificColumn(String column) throws BadAPIRequest {
        return questionService.getByCategory(column);
    }
}
