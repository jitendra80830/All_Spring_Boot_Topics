package ashok.in.controllers;

import ashok.in.CustomeExeption.BadAPIRequest;
import ashok.in.WrapClass.QuestionWrapper;
import ashok.in.model.Quiz;
import ashok.in.model.Response;
import ashok.in.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Queue;

@RestController
@RequestMapping("quiz")
public class QuizController {

    @Autowired
   private QuizService quizService;


    @PostMapping("/create")
    public ResponseEntity<String> createQuiz(@RequestParam String category , @RequestParam int numQ , @RequestParam String title){
        return quizService.createQuiz(category , numQ , title);
    }
    @GetMapping("/getAll")
    public ResponseEntity<List<Quiz>> getAllQuizs(){
        return quizService.getQuiz();
    }
    @GetMapping("/get/{id}")
    public ResponseEntity<List<QuestionWrapper>> getQuizQuestion(@PathVariable int id) throws BadAPIRequest {
        return quizService.getQuizQuetion(id);
    }
    @PostMapping("/submit/{id}")
    public ResponseEntity<Integer> submit(@PathVariable Integer id , @RequestBody List<Response> response){
        return quizService.submitResponse(id , response);
    }

}
