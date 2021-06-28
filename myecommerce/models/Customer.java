package com.thedkhenry.java_jdbc_basics.exercises.myecommerce.models;

public class Customer {
    private int customerID;
    private String name;
    private String dob;
    private int employeeID;
    private String email;
    private String country;
    private String status;
    private double creditLimit;

    public Customer() {
    }

    public Customer(String name, String dob, int employeeID, String email, String country, String status, double creditLimit) {
        this.name = name;
        this.dob = dob;
        this.employeeID = employeeID;
        this.email = email;
        this.country = country;
        this.status = status;
        this.creditLimit = creditLimit;
    }

    public Customer(int customerID, String name, String dob, int employeeID, String email, String country, String status, double creditLimit) {
        this.customerID = customerID;
        this.name = name;
        this.dob = dob;
        this.employeeID = employeeID;
        this.email = email;
        this.country = country;
        this.status = status;
        this.creditLimit = creditLimit;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "CustomerID=" + customerID +
                ", Name='" + name + '\'' +
                ", dob='" + dob + '\'' +
                ", EmployeeId=" + employeeID +
                ", email='" + email + '\'' +
                ", country='" + country + '\'' +
                ", status='" + status + '\'' +
                ", creditLimit=" + creditLimit +
                '}';
    }
}
