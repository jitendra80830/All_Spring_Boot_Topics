package ashok.in.service;


import ashok.in.CustomeExeption.BadAPIRequest;
import ashok.in.model.Question;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;

public interface QuestionService {

    public ResponseEntity<List<Question>> getAllQuestions() throws BadAPIRequest;

    public ResponseEntity<Question> createQuestions(Question question) throws BadAPIRequest;

    public ResponseEntity<List<Question>> getByCategory(String category) throws BadAPIRequest;
}
