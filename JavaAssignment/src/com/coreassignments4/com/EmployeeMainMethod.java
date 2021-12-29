package com.coreassignments4.com;

import java.util.HashSet;

public class EmployeeMainMethod {

    public static void main(String[] args) {

        HashSet<Employee> hs = new HashSet<>();
        Employee employee1 = new Employee(1,"Abhi",90000, "Mech");
        hs.add(employee1);
        Employee employee2 = new Employee(2,"Raj",70000, "Ece");
        hs.add(employee2);
        System.out.println(hs);

    }
}
