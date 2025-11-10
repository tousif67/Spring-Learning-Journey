package com.user.model;


import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@Document
public class Customer {
    @Id
    private String id;
    private Integer custNo;
    private String name;
    private String city;

    public Customer(String id, Integer custNo, String name, String city) {
        this.id = id;
        this.custNo = custNo;
        this.name = name;
        this.city = city;
    }
}
