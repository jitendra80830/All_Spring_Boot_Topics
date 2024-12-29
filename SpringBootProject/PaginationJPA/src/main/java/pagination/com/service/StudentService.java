package pagination.com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import pagination.com.dto.BulkStudentDto;
import pagination.com.dto.PageRequestDto;
import pagination.com.entities.Student;
import pagination.com.repo.StudentRepository;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public ResponseEntity<Student> create(Student student) {
        return new ResponseEntity<>(studentRepository.save(student), HttpStatus.CREATED);
    }

    public ResponseEntity<List<Student>> getAll() {
        return new ResponseEntity<>(studentRepository.findAll(), HttpStatus.OK);
    }
    public ResponseEntity<Page<Student>> getAllStudentUsingPagination(PageRequestDto dto) {

        Pageable pageable = new PageRequestDto().getPageable(dto);
        Page<Student> studentPage = studentRepository.findAll(pageable);
        return new ResponseEntity<>(studentPage , HttpStatus.OK);

    }
    public ResponseEntity<BulkStudentDto> bulk(BulkStudentDto bulkStudentDto) {
        return  null;
    }
}
