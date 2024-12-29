package ashokit.in.service;

import ashokit.in.request.Passenger;
import ashokit.in.respose.Ticket;

import java.util.List;

public interface MakeMyTripService {

    public Ticket bookTicket(Passenger passenger);

    public Ticket getTicket(Integer ticketNum);

    public List<Ticket> getAllTickets();
}
