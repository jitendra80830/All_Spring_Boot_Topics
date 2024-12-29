package ashok.in.service;


import ashok.in.entity.Ticket;
import request.Passenger;

import java.util.List;

public interface TicketService {
    public Ticket bookTicket(Passenger passenger);

    public Ticket getTicket(Integer ticketNum);

    public List<Ticket> getAllTickets();
}
