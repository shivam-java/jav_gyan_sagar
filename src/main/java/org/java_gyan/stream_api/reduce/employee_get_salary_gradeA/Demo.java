package org.java_gyan.stream_api.reduce.employee_get_salary_gradeA;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Employee> employeeList=new ArrayList<>();
        Employee e1=new Employee("virat",10000,"A");
        Employee e2=new Employee("rohit",9000,"A");
        Employee e3=new Employee("bumrah",8000,"A");
        Employee e4=new Employee("surya",6100,"A");

        employeeList.addAll(List.of(e1,e2,e3,e4));
        double a = employeeList.stream().filter(e -> e.grade.equals("A")).
                mapToInt(e -> e.salary).average().getAsDouble();
        System.out.println(a);

    }
}
