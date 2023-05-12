package com.example.springbootmicroservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    EmployeeDAO Employeedao;
    public List<EmployeeTable> getEmployeeById(int id)
    {
       return Employeedao.findById(id);

    }


}
