package org.java_gyan.completeable_future.demo_four;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;

import com.fasterxml.jackson.databind.ObjectMapper;

public class EmployeeService {
    public static void main(String[] args) throws IOException {
        List<Employee> employees = fetchEmployees();
        System.out.println(employees.size());
    }

    public static List<Employee> fetchEmployees() throws IOException {
         ObjectMapper objectMapper=new ObjectMapper();
        List<Employee> employees = objectMapper.readValue(new FileReader("src/main/resources/employees.json"), new TypeReference<List<Employee>>() {

        });
        return employees;

    }
}
