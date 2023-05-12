package com.example.springbootmicroservice;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeDAO extends JpaRepository<EmployeeTable, EmployeeTableId> {

    List<EmployeeTable> findById(int id);


}
