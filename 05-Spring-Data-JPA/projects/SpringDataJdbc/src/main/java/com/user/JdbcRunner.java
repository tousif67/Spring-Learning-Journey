package com.user;

import com.user.dao.EmployeeDao;
import com.user.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class JdbcRunner implements CommandLineRunner {
    @Autowired
    private EmployeeDao dao;
    @Override
    public void run(String... args) throws Exception {
        dao.input(new Employee(2,"Tousif","Purulia"));
    }
}
