package com.example.springbootmicroservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/get-employee/employeeId/{employeeId}")
    public OutputResponseBody getEmployeeById(@PathVariable int employeeId){
        List<EmployeeTable> emp = employeeService.getEmployeeById(employeeId);

        List<Integer> collect = emp.stream().map(e -> e.getAssetid()).collect(Collectors.toList());
        HttpEntity<AssetRequestBody> request = new HttpEntity<>(new AssetRequestBody(collect));

        List<AssetTable> responseBody = List.of(new RestTemplate()
                .postForEntity("http://localhost:8090/getAsset", request, AssetTable[].class).getBody());

        OutputResponseBody response = new OutputResponseBody(employeeId, emp.get(0).getName(), responseBody );
        return response;
    }
}
