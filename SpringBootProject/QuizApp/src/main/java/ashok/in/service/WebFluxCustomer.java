package ashok.in.service;

import org.springframework.web.bind.annotation.GetMapping;
import reactor.core.publisher.Flux;

public interface WebFluxCustomer<T> {

    @GetMapping("/stream")
    Flux<T> getCustomerStream();
}
