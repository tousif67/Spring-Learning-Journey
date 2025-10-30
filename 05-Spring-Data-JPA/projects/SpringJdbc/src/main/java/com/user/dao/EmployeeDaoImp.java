package com.user.dao;

import com.user.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


@Repository("dao")
public class EmployeeDaoImp  implements IEmployee{

    @Autowired
    private DataSource dataSource;
    private String SQL_QUERY = "Select * from Employee";

    List<Employee>  employees = null;

    @Override
    public List<Employee> getEmployeeInfo() {
        try {
            Connection con = dataSource.getConnection();
            PreparedStatement pstmt = con.prepareStatement(SQL_QUERY);
            ResultSet rs = pstmt.executeQuery();
            employees = new ArrayList<>();
            while(rs.next()) {
                Employee emp = new Employee();
//                Integer i = rs.getInt(1);
//                emp.setId(i);
                emp.setId(rs.getInt(1));
                emp.setName(rs.getString(2));
                emp.setCity(rs.getString(3));

                employees.add(emp);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return employees;
    }
}
