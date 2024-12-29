package pagination.com.dto;

import lombok.Getter;
import lombok.Setter;
import pagination.com.entities.Student;

import java.util.List;

@Getter
@Setter
public class BulkStudentDto {

    public List<Student> students;
}
