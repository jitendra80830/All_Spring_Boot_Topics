package pagination.com.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pagination.com.APIs;
import pagination.com.dto.BulkStudentDto;
import pagination.com.dto.PageRequestDto;
import pagination.com.entities.Student;
import pagination.com.repo.StudentRepository;
import pagination.com.service.StudentService;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentRestController implements APIs<Student , PageRequestDto ,BulkStudentDto> {

    @Autowired
    private StudentService studentService;

    @Override
    public ResponseEntity<Student> create(Student student) {
        return studentService.create(student);
    }

    @Override
    public ResponseEntity<List<Student>> getAll() {
        return studentService.getAll();
    }

    @Override
    public ResponseEntity<Page<Student>> getAllStudentUsingPagination(PageRequestDto dto) {
        return studentService.getAllStudentUsingPagination(dto);
    }

    @Override
    public ResponseEntity<BulkStudentDto> bulk(BulkStudentDto studentDto) {
        return null;
    }

}
