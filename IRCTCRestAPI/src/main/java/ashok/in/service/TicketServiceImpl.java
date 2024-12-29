package ashok.in.service;

import ashok.in.entity.Ticket;
import request.Passenger;
import ashok.in.repo.TicketRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TicketServiceImpl implements TicketService{

    @Autowired
    private TicketRepository repository;


    @Override
    public Ticket bookTicket(Passenger passenger) {

        Ticket ticket = new Ticket();

        BeanUtils.copyProperties(passenger ,ticket);

        ticket.setPrice(200.2);
        ticket.setTicketStatus("CONFORMED");

         ticket = repository.save(ticket);

        return ticket;
    }

    @Override
    public Ticket getTicket(Integer ticketNum) {

        Optional<Ticket> ticket = repository.findById(ticketNum);
        if(ticket.isPresent()){
            return ticket.get();
        }
        return null;
    }

    @Override
    public List<Ticket> getAllTickets() {

        List<Ticket> all = repository.findAll();
        if (all != null) {
            return all;
        }
        return null;
    }
}
