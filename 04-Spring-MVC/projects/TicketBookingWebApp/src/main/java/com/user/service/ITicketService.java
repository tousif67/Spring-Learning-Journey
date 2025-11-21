package com.user.service;

import com.user.model.Passenger;
import com.user.model.Ticket;

public interface ITicketService {
    public Integer registerPassenger(Passenger passenger);
    public Ticket getFullTicket(Integer ticketNo);
}
