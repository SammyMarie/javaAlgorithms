package com.sammy.hashBasedAlgorithms;

import com.sammy.hashBasedAlgorithms.model.Employee;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class MainAlgorithm {

    public static void main(String[] args) {
        Employee firstEmployee = new Employee(3827, "Robby", "Technology");
        Employee secondEmployee = new Employee(9612, "Bobby", "Marketing");
        Employee thirdEmployee = new Employee(2519, "Sally", "Sales");

        Map<Integer, Employee> employeeById = new HashMap<>();
        employeeById.putIfAbsent(firstEmployee.id(), firstEmployee);
        employeeById.putIfAbsent(secondEmployee.id(), secondEmployee);
        employeeById.putIfAbsent(thirdEmployee.id(), thirdEmployee);

        Employee someEmployee = employeeById.get(9612);

        Optional.ofNullable(someEmployee)
                .ifPresent(employee -> System.out.println(employee.name() + ": " + employee.department()));

        Set<String> productCodes = new HashSet<>();
        productCodes.add("2T26B");
        productCodes.add("9K42P");
        productCodes.add("H5J781");

        System.out.println(productCodes.contains("H5J781"));
        System.out.println(productCodes.contains("9KTYP"));
    }
}
