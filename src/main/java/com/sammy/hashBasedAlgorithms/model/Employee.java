package com.sammy.hashBasedAlgorithms.model;

public class Employee {
    private int id;
    private String name;
    private String department;

    public Employee(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    public int id() {
        return id;
    }

    public String name() {
        return name;
    }

    public String department() {
        return department;
    }
}
