package com.user.service;

import com.user.model.Passenger;

public interface ITicketService {
    public Passenger registerPassenger(Passenger passenger);
    public Passenger fetchPassengerInfo(Integer id);
}
