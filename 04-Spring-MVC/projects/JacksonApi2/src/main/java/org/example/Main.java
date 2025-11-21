package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.model.Alien;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
            //Object mapper is also used to convert java object from json


        InputStream is = Main.class.getResourceAsStream("/sample.json");
        ObjectMapper objectMapper = new ObjectMapper();

        Alien alien = objectMapper.readValue(is, Alien.class);
        System.out.println(alien);


    }
}