package ashok.in.rest;

import ashok.in.entity.Ticket;
import request.Passenger;
import ashok.in.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TicketRestController {

    @Autowired
    TicketService ticketService;

    @PostMapping(value = "/tickets",
            consumes = "application/json",
            produces = "application/json")
    public ResponseEntity<Ticket> bookTicket(@RequestBody Passenger passenger){

        Ticket ticket = ticketService.bookTicket(passenger);

        return new ResponseEntity<>(ticket , HttpStatus.CREATED);
    }

    @GetMapping(value = "/ticket/{ticketNum}",produces = "application/json")
    public ResponseEntity<Ticket> getTicket(@PathVariable("ticketNum") Integer ticketNum){

        Ticket ticket = ticketService.getTicket(ticketNum);

        return new ResponseEntity<>(ticket,HttpStatus.OK);
    }
    @GetMapping(value = "/tickets",produces = "application/json")
    public ResponseEntity<List<Ticket>> getAllTickets(){

        List<Ticket> allTickets = ticketService.getAllTickets();
        return new ResponseEntity<>(allTickets , HttpStatus.OK);
    }
}
