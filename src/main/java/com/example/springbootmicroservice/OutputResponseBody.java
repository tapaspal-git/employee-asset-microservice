package com.example.springbootmicroservice;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.io.Serializable;
import java.util.List;

@JsonPropertyOrder({"EmployeeId", "EmployeeName", "assets"})
public class OutputResponseBody implements Serializable {

    @JsonProperty("EmployeeId")
    private int employeeId;

    @JsonProperty("EmployeeName")
    private String employeeName;

    private List<AssetTable> assets;

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public List<AssetTable> getAssets() {
        return assets;
    }

    public void setAssets(List<AssetTable> assets) {
        this.assets = assets;
    }

    public OutputResponseBody(int employeeId, String employeeName, List<AssetTable> assets) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.assets = assets;
    }

}
