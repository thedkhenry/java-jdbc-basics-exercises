package com.thedkhenry.java_jdbc_basics.exercises.myecommerce.sql_files;

public class CustomerSQL {
    public static final String INSERT = "insert";
    public static final String UPDATE = "update";
    public static final String DELETE = "delete";
    public static final String FINDCUSTBYCOUNTRY = "SELECT * FROM customers WHERE country = ?";
    public static final String ADDCUSTOMER =  "INSERT INTO customers(name, email, status) VALUE (?,?,?)";
    public static final String UPDATEBYID = "UPDATE customers SET Name = ?, email = ?, status = ? WHERE CustomerId = ?";
    public static final String FINDCUSTBYCREDITLIMIT = "SELECT * FROM customers WHERE creditLimit = ?";
    public static final String DELETEBYID = "DELETE FROM customers WHERE CustomerId = ?";
}