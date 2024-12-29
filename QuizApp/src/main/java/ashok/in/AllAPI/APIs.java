package ashok.in.AllAPI;

import ashok.in.CustomeExeption.BadAPIRequest;
import ashok.in.model.Customer;
import ashok.in.model.Question;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import reactor.core.publisher.Flux;

import java.util.List;

public interface APIs<T , S> {

    @GetMapping("/get")
    ResponseEntity<List<T>> get() throws BadAPIRequest;

    @PostMapping("/create")
    ResponseEntity<T> create(@RequestBody T t) throws BadAPIRequest;

    @GetMapping("/{column}")
    ResponseEntity<List<T>> getBySpecificColumn(@PathVariable S column) throws BadAPIRequest;


}
