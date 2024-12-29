package ashokit.in.service;

import ashokit.in.request.Passenger;
import ashokit.in.respose.Ticket;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.Arrays;
import java.util.List;

@Service
public class MakeMyTripServiceImpl implements MakeMyTripService{
    @Override
    public Mono<Ticket> bookTicket(Passenger passenger) {

        String url = "http://localhost:8080/tickets";
        /*RestTemplate restTemplate = new RestTemplate();

        //Sending Post Request (ProviderUrl , RequestBody , ResponseBodyType)
        ResponseEntity<Ticket> entity = restTemplate.postForEntity(url, passenger, Ticket.class);
        Ticket entityBody = entity.getBody();*/

        WebClient webClient = WebClient.create();
        Mono<Ticket> ticketMono = webClient.post().
                uri(url).
                body(BodyInserters.fromValue(passenger)).
                retrieve().
                bodyToMono(Ticket.class);
        return ticketMono;
    }

    @Override
    public Mono<Ticket> getTicket(Integer ticketNum) {
        String url = "http://localhost:8080/ticket/{ticketNum}";

       /* RestTemplate restTemplate = new RestTemplate();

        ResponseEntity<Ticket> forEntity = restTemplate.getForEntity(url, Ticket.class,ticketNum);
        Ticket ticket = forEntity.getBody();*/

        WebClient webClient = WebClient.create();
        Mono<Ticket> ticketMono = webClient.get().
                                                uri(url, ticketNum).
                                                retrieve().
                                                bodyToMono(Ticket.class);

        return ticketMono;

    }

    @Override
    public Mono<Ticket[]> getAllTickets() {
        String url = "http://localhost:8080/tickets";

       /* RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Ticket[]> forEntity = restTemplate.getForEntity(url, Ticket[].class);

        Ticket[] body = forEntity.getBody();
        List<Ticket> tickets = Arrays.asList(body);*/
        WebClient webClient = WebClient.create();
        Mono<Ticket[]> bodyToMono = webClient.get().
                uri(url).
                retrieve().
                bodyToMono(Ticket[].class);

        return bodyToMono;
    }
}
