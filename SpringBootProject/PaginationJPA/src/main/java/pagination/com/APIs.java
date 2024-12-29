package pagination.com;

import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import pagination.com.dto.PageRequestDto;

import java.util.List;

public interface APIs<T,R,P> {

    @PostMapping("/create")
    ResponseEntity<T> create(@RequestBody T t);

    @GetMapping("/get")
    ResponseEntity<List <T>> getAll();

    @PostMapping("/getByPage")
    ResponseEntity<Page<T>>getAllStudentUsingPagination(@RequestBody R t);

    @PostMapping("/bulk")
    ResponseEntity<P> bulk(@RequestBody P t);
}
