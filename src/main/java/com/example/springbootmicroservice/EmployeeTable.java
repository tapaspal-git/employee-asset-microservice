package com.example.springbootmicroservice;

import jakarta.persistence.*;

@Entity
@Table(name="employee")
@IdClass(EmployeeTableId.class)
public class EmployeeTable {
    @Id
    private Integer id;
    @Id
    private Integer assetid;
    @Column(name = "name", nullable = false)
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAssetid() {
        return assetid;
    }

    public void setAssetid(Integer assetid) {
        this.assetid = assetid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
