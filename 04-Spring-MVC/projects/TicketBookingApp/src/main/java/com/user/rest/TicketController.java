package com.user.rest;

import com.user.model.Passenger;
import com.user.model.Ticket;
import com.user.service.ITicketService;
import com.user.service.TicketService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
//This is how we give information about individual API.
@Tag(name="TicketBookingAPI", description = "There are 2 Api's, first API will accept passenger object and generate ticketNo and Second Api will generate Ticket Object by accepting Id.")
public class TicketController {
    @Autowired
    private ITicketService service;

    @PostMapping("/get-TicketNo")
    @Operation(summary = "Register passenger info.",description = "API will accept passenger object and generate ticketNo")
    public ResponseEntity<Integer> registerPassenger(@RequestBody Passenger passenger){
        Passenger p1 = service.registerPassenger(passenger);
        Integer ticketNo = p1.getPid();
        return new ResponseEntity<Integer>(ticketNo, HttpStatus.CREATED);
    }

    @GetMapping("/get-Ticket/{ticketNo}")
    @Operation(summary = "Get Ticket info.",description = "API will accept integer id and generate ticket Info")
    public ResponseEntity<Ticket> getTicket(@PathVariable("ticketNo") Integer id){
        Passenger p1 = service.fetchPassengerInfo(id);
        Ticket ticket = new Ticket();
        ticket.setTicketNo(p1.getPid());
        ticket.setName(p1.getName());
        ticket.setDeparture(p1.getDeparture());
        ticket.setArrival(p1.getArrival());
        ticket.setDateOfJourney(p1.getDateOfJourney());
        ticket.setStatus("confirmed");
        ticket.setTicketPrice(500.26);
        return new ResponseEntity<Ticket>(ticket, HttpStatus.OK);
    }
}
