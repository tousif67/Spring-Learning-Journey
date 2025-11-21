package com.user.service;

import com.user.model.Passenger;
import com.user.model.Ticket;
import org.jspecify.annotations.Nullable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class TicketService implements ITicketService {
    private String url = "http://localhost:8484/TicketBookingAPI/get-TicketNo";
    private String get_url = "http://localhost:8484/TicketBookingAPI/get-Ticket/{ticketNo}";
    @Override
    public Integer registerPassenger(Passenger passenger) {
//           RestTemplate restTemplate = new RestTemplate();
//        ResponseEntity<Integer> resp = restTemplate.postForEntity(url, passenger, Integer.class);
//        Integer ticketNo = resp.getBody();
        WebClient webClient = WebClient.create();
        Integer ticketNo = webClient.post()
                .uri(url)
                .bodyValue(passenger)
                .retrieve()
                .bodyToMono(Integer.class)
                .block();//This is for synchronous communication.
        return ticketNo;
    }

    @Override
    public Ticket getFullTicket(Integer ticketNo) {
//        RestTemplate restTemplate = new RestTemplate();
//        ResponseEntity<Ticket> resp = restTemplate.getForEntity(get_url, Ticket.class,ticketNo);
//        Ticket ticket = resp.getBody();
        WebClient webClient = WebClient.create();
        Ticket ticket = webClient.get()
                .uri(get_url,ticketNo)
                .retrieve()
                .bodyToMono(Ticket.class)
                .block();
        return ticket;
    }
}
