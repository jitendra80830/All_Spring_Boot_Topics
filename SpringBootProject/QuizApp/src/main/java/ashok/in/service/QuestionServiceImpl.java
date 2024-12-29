package ashok.in.service;

import ashok.in.CustomeExeption.BadAPIRequest;
import ashok.in.dao.QuestionDao;
import ashok.in.model.Question;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionService {
    @Autowired
    private QuestionDao questionDao;

    private Logger logger = LoggerFactory.getLogger(QuestionServiceImpl.class);

    @Override
    public ResponseEntity<List<Question>> getAllQuestions() throws BadAPIRequest {

        try {
            logger.info("===========Execution rest api for getting all records===========");
            return new ResponseEntity<>(questionDao.findAll(), HttpStatus.OK);

        }catch (Exception e){
            throw new BadAPIRequest("Bad APi Request for getting all  records.");
        }
    }

    @Override
    public ResponseEntity<Question> createQuestions(Question question) throws BadAPIRequest {
        try {
            logger.info("===========Execution rest api for create records==========");
            return new ResponseEntity<>(questionDao.save(question) , HttpStatus.CREATED);
        }catch (Exception e){
            throw new BadAPIRequest("Bad API Request for getting create records.");
        }
    }

    @Override
    public ResponseEntity<List<Question>> getByCategory(String category) throws BadAPIRequest {
        try {
            logger.info("==============Execution rest api for getting by category all records===========");
            return new ResponseEntity<>(questionDao.findByCategory(category),HttpStatus.OK);
        }catch (Exception e){
            throw new BadAPIRequest("Bad API Request for getting by category.");
        }
    }
}
