package com.thedkhenry.java_jdbc_basics.exercises.myecommerce.models;

public class Employee {
    private int id;
    private String name;
    private int managerID;
    private String title;
    private String dob;
    private double salary;
    private String department;

    public Employee() {
    }

    public Employee(String name, int managerID, String title, String dob, double salary, String department) {
        this.name = name;
        this.managerID = managerID;
        this.title = title;
        this.dob = dob;
        this.salary = salary;
        this.department = department;
    }

    public Employee(int id, String name, int managerID, String title, String dob, double salary, String department) {
        this.id = id;
        this.name = name;
        this.managerID = managerID;
        this.title = title;
        this.dob = dob;
        this.salary = salary;
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", managerID=" + managerID +
                ", title='" + title + '\'' +
                ", dob='" + dob + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getManagerID() {
        return managerID;
    }

    public void setManagerID(int managerID) {
        this.managerID = managerID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}