package com.user.web;

import com.user.model.Passenger;
import com.user.model.Ticket;
import com.user.service.ITicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TicketController {
    @Autowired
    private ITicketService service;

    @PostMapping("/book-ticket")
    public String bookTicket(@ModelAttribute Passenger passenger, Model model) {
        Integer ticketNo = service.registerPassenger(passenger);
        model.addAttribute("ticketNo",ticketNo);
        return "index";//Logical view name.
    }

    @GetMapping("/passenger-form")
    public String bookTicketFrom(@ModelAttribute Passenger passenger, Model model) {

        model.addAttribute("passenger",new Passenger());
        return "index";//Logical view name.
    }

    @GetMapping("/ticket-form")
    public String ticketFrom(@ModelAttribute Passenger passenger, Model model) {

        model.addAttribute("passenger",new Passenger());
        return "ticket-form";//Logical view name.
    }

    @GetMapping("/get-ticket")
    public String getTicket(@RequestParam Integer ticketNo, Model model) {
         Ticket ticket = service.getFullTicket(ticketNo);
        model.addAttribute("ticket",ticket);
        return "ticket-info";//Logical view name.
    }
}
