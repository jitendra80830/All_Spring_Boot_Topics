package ashokit.in.service;

import ashokit.in.request.Passenger;
import ashokit.in.respose.Ticket;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class MakeMyTripServiceImpl implements MakeMyTripService{
    @Override
    public Ticket bookTicket(Passenger passenger) {

        String url = "http://localhost:8080/tickets";
        RestTemplate restTemplate = new RestTemplate();

        //Sending Post Request (ProviderUrl , RequestBody , ResponseBodyType)
        ResponseEntity<Ticket> entity = restTemplate.postForEntity(url, passenger, Ticket.class);
        Ticket entityBody = entity.getBody();

        return entityBody;
    }

    @Override
    public Ticket getTicket(Integer ticketNum) {
        String url = "http://localhost:8080/ticket/{ticketNum}";

        RestTemplate restTemplate = new RestTemplate();

        ResponseEntity<Ticket> forEntity = restTemplate.getForEntity(url, Ticket.class,ticketNum);
        Ticket ticket = forEntity.getBody();

        return ticket;

    }

    @Override
    public List<Ticket> getAllTickets() {
        String url = "http://localhost:8080/tickets";

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Ticket[]> forEntity = restTemplate.getForEntity(url, Ticket[].class);

        Ticket[] body = forEntity.getBody();
        List<Ticket> tickets = Arrays.asList(body);

        return tickets;
    }
}
