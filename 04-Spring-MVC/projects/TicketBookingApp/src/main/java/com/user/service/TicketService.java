package com.user.service;

import com.user.model.Passenger;
import com.user.repo.ITicketRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TicketService implements ITicketService{
    @Autowired
    private ITicketRepo repo;
    @Override
    public Passenger registerPassenger(Passenger passenger) {
        return repo.save(passenger);
    }

    @Override
    public Passenger fetchPassengerInfo(Integer id) {
        Optional<Passenger> optional = repo.findById(id);
        return optional.get();
    }
}
