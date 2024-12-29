package ashok.in.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Question {


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    private String questionTitle;
    private String option1;
    private String getOption2;
    private String getOption3;
    private String getOption4;
    private String rightAnswer;
    private String difficultylevel;
    private String category;


}
