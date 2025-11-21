package org.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.model.Alien;

import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Alien obj = new Alien(1,"Tousif","Kolkata");
        Alien obj1 = new Alien(2,"Jamal","Delhi");
        Alien obj2 = new Alien(3,"Rohit","Mumbai");

        List<Alien> aliens = Arrays.asList(obj,obj1,obj2);

            //Object mapper is used to create json from java object

        ObjectMapper objectMapper = new ObjectMapper();
        try {
//            String json = objectMapper.writeValueAsString(obj);
            String json = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(aliens);
            System.out.println(json);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}