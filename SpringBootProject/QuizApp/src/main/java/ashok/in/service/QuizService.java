package ashok.in.service;

import ashok.in.CustomeExeption.BadAPIRequest;
import ashok.in.WrapClass.QuestionWrapper;
import ashok.in.dao.QuestionDao;
import ashok.in.dao.QuizDao;
import ashok.in.model.Question;
import ashok.in.model.Quiz;
import ashok.in.model.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class QuizService {

    @Autowired
    private QuizDao quizDao;

    @Autowired
    private QuestionDao questionDao;


    public ResponseEntity<String> createQuiz(String category, int numQ, String title) {
        List<Question> questions = questionDao.getRandomQuestionCategoryBy(category, numQ);

        Quiz quiz = new Quiz();
        quiz.setTitle(title);
        quiz.setQuestions(questions);
        Quiz save = quizDao.save(quiz);
        return new ResponseEntity<>("SUCCESS", HttpStatus.CREATED);
    }

    public ResponseEntity<List<Quiz>> getQuiz() {
        return new ResponseEntity<>(quizDao.findAll(), HttpStatus.OK);
    }

    public ResponseEntity<List<QuestionWrapper>> getQuizQuetion(int id) throws BadAPIRequest {
        Optional<Quiz> quiz = null;
        try {
            quiz = quizDao.findById(id);
        } catch (Exception e) {
            throw new BadAPIRequest(id + ": id is not available in database.");
        }
        List<Question> questions = quiz.get().getQuestions();
        List<QuestionWrapper> questionUser = new ArrayList<>();
        for (Question question : questions) {
            QuestionWrapper questionWrapper = new QuestionWrapper(question.getId(), question.getQuestionTitle(), question.getOption1(), question.getGetOption2(), question.getGetOption3(), question.getGetOption4());
            questionUser.add(questionWrapper);
        }
        return new ResponseEntity<>(questionUser, HttpStatus.OK);

    }

    public ResponseEntity<Integer> submitResponse(Integer id, List<Response> response) {
        Quiz quiz = quizDao.findById(id).get();
        List<Question> questions = quiz.getQuestions();
        int result = 0;
        int i = 0;
        for (Response res : response) {
            if (res.getResponse().equals(questions.get(i).getRightAnswer())) {
                result++;
            }
            i++;
        }
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
