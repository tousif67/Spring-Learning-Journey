package com.user.dao;

import com.user.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("dao")
public class EmployeeDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;//this contains all the process that is used by jdbc.
//    private String sql = "Insert into employee(id,name,city) values(1,'Rohit', 'Jaipur') ";
private String sql = "Insert into employee(id,name,city) values(?,?,?) ";
    public void input(Employee emp) {
        jdbcTemplate.update(sql,emp.getId(),emp.getName(),emp.getCity());
        System.out.println("Data Inserted");
    }

}
