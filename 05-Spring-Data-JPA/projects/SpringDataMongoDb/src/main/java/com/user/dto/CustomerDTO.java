package com.user.dto;


import lombok.Data;
import lombok.NoArgsConstructor;

//This class transfer data from one layer to another layer
@Data
@NoArgsConstructor

public class CustomerDTO {
    private String id;
    private Integer custNo;
    private String name;
    private String city;

    public CustomerDTO(String id, Integer custNo, String name, String city) {
        this.id = id;
        this.custNo = custNo;
        this.name = name;
        this.city = city;
    }
}
