package com.example.springbootmicroservice;


import java.io.Serializable;

public class EmployeeTableId implements Serializable {
    private Integer id;
    private Integer assetid;

    public EmployeeTableId(Integer id, Integer assetid) {
        this.id = id;
        this.assetid = assetid;
    }

    public EmployeeTableId() {
    }

}
