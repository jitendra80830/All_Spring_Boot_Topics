package com.webflux;

import org.junit.jupiter.api.Test;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class MonoFluxPublisherTest {


    @Test
    public void monoTest(){
        //Publisher = publishes the content
        Mono<String> mono = Mono.just("Jitendra Kumar").log();

        //Subscriber to the publisher to get data
        mono.subscribe(System.out::println);
    }
    @Test
    public void testFlux(){
        //Publisher = publishes the content
        Flux<String> flux = Flux.just("Java","Programming","Language").log();

        flux.subscribe(System.out::println);


    }

}
