package org.java_gyan.miscellenous.sort_employees;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class Demo {

    public static void main(String[] args) {


        List<Employee> employeeList=new ArrayList<>();
        employeeList.add(new Employee("mayank","manager","250000"));
        employeeList.add(new Employee("shiju","manager","150000"));
        employeeList.add(new Employee("ashutosh","dev","350000"));
        employeeList.add(new Employee("ritu","dev","250000"));
        employeeList.add(new Employee("aancahal","qa","250000"));
        employeeList.add(new Employee("aditya","qa","150000"));
        Comparator<Employee> comparing = Comparator.comparing(Employee::getSalary);
        Map<String, Optional<Employee>> collect = employeeList.stream().collect(
                Collectors.groupingBy(Employee::getDept, Collectors.reducing(BinaryOperator.maxBy(comparing))));


        System.out.println(collect);
    }
}
