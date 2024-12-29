package ashok.in.WrapClass;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class QuestionWrapper {
    private Integer id;
    private String questionTitle;
    private String option1;
    private String getOption2;
    private String getOption3;
    private String getOption4;
}
