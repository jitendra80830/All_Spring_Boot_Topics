package ashokit.in.service;

import ashokit.in.request.Passenger;
import ashokit.in.respose.Ticket;
import reactor.core.publisher.Mono;

import java.util.List;

public interface MakeMyTripService {

    public Mono<Ticket> bookTicket(Passenger passenger);

    public Mono<Ticket> getTicket(Integer ticketNum);

    public Mono<Ticket[]> getAllTickets();
}
