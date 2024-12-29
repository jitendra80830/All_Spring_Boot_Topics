package come.demo.apis;

import come.demo.entities.Employee;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import reactor.core.publisher.Flux;

import java.util.List;

public interface AllAPIs<T> {

    @GetMapping("/get")
    ResponseEntity<List<T>> getAll();

    @PostMapping("/create")
    ResponseEntity<T> create(@RequestBody T t);

    @GetMapping("/steam")
    ResponseEntity<Flux<T>> getAllStream() throws InterruptedException;

}
