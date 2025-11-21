package com.user.repo;

import com.user.model.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITicketRepo extends JpaRepository<Passenger,Integer> {
}
