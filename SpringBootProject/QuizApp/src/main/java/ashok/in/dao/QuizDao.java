package ashok.in.dao;

import ashok.in.model.Question;
import ashok.in.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface QuizDao extends JpaRepository<Quiz, Integer> {

}
