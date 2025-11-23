package com.user.rest;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.user.model.Student;
import com.user.service.IGreetings;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.jupiter.api.Assertions.assertEquals;


@WebMvcTest(GreetingsController.class)
public class GreetingsControllerTest {
//This is the old way
    //    @MockBean
//    private IGreetings service;

    //This is the new way
    @TestConfiguration
    static class MockConfig {
        @Bean
        IGreetings greetings() {
            return Mockito.mock(IGreetings.class);
        }
    }

    @Autowired
    private IGreetings service;
    @Autowired
    private MockMvc mockMvc;

    @Test
    @Disabled
    void testGetWishes() throws Exception {

        //Mockito
        Mockito.when(service.generateWish("Tousif")).thenReturn("Good Morning");

        //Request Object
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/greet");
        ResultActions result = mockMvc.perform(requestBuilder);
        MvcResult mvcResult = result.andReturn();

        MockHttpServletResponse response = mvcResult.getResponse();
        int statusCode = response.getStatus();
        //Assertion
        assertEquals(200,statusCode);

    }
    @Test
    void testAddStudent() throws Exception {
        //Mocking
        Mockito.when(service.addStudent(ArgumentMatchers.any())).thenReturn(true);

        Student student = new Student(1,"Rohan","Mumbai");
        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writeValueAsString(student);
        //RequestBuilder
        RequestBuilder requestBuilder = MockMvcRequestBuilders.post("/add")
                .contentType(MediaType.APPLICATION_JSON)
                .content(json);

        ResultActions result = mockMvc.perform(requestBuilder);
        MvcResult mvcResult = result.andReturn();

        MockHttpServletResponse response = mvcResult.getResponse();
        int statusCode = response.getStatus();
        //Assertion
        assertEquals(201,statusCode);

    }
}
