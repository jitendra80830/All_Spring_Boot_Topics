package ashokit.in.controler;

import ashokit.in.request.Passenger;
import ashokit.in.respose.Ticket;
import ashokit.in.service.MakeMyTripService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import java.util.List;

@Controller
public class MakeMyTripController {

    @Autowired
    private MakeMyTripService makeMyTripService;

    @GetMapping("/")
    public String index(Model model){

        model.addAttribute("passenger" , new Passenger());
        return "index";
    }
    @PostMapping("/ticket")
    public String handleTicketButton(@ModelAttribute("passenger") Passenger passenger , Model model){

        Mono<Ticket> ticket = makeMyTripService.bookTicket(passenger);
        model.addAttribute("ticket" ,ticket);

        return "view_ticket";
    }
    @GetMapping("/tickets")
    public String getAllTickets(Model model){
        Mono<Ticket[]> allTickets = makeMyTripService.getAllTickets();
        model.addAttribute("tickets",allTickets);
        return "data";
    }
    @GetMapping("/search")
    public String search(Model model){

        model.addAttribute("ticket" , new Ticket());
        return "search";
    }
    @GetMapping("/search-ticket")
    public String searchTicket(@RequestParam("ticketNum") Integer ticketNum , Model model){
        Mono<Ticket> ticket = makeMyTripService.getTicket(ticketNum);
        model.addAttribute("ticket",ticket);
        return "search";
    }
}
