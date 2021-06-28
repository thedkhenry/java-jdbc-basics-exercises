package com.thedkhenry.java_jdbc_basics.exercises.myecommerce.dao;

import com.thedkhenry.java_jdbc_basics.exercises.myecommerce.models.Customer;

import java.sql.ResultSet;
import java.util.ArrayList;

public interface CustomerDAO {

    /**
     * Returns a list containing all of the customers in
     * the specified country
     *
     * @param country the country to restrict the search to
     *
     * @return the list of customer objects
     */
    ArrayList<Customer> findCustomerByCountry(String country);

    /**
     * Returns a list containing all of the customers with
     * the specified credit limit
     *
     * @param creditLimit the credit limit to restrict the search to
     *
     * @return the list of customer objects
     */
    ArrayList<Customer> findCustomerByCreditLimit(double creditLimit);

    /**
     * Returns the number of rows affected by the
     * update statement
     *
     * @param c the customer to be updated
     *
     * @return the number of rows updated
     */
    int updateCustomerByID(Customer c);

    /**
     * Returns the number of rows affected by the
     * delete statement
     *
     * @param c the customer to be deleted
     *
     * @return the number of rows deleted
     */
    int deleteCustomerByID(Customer c);

    /**
     * Returns the number of rows affected by the
     * insert statement
     *
     * @param c the customer to be inserted
     *
     * @return the number of rows inserted
     */
    int insertCustomer(Customer c);

    /**
     * Updates or inserts a customer depending on the operation
     * specified. Operation must be either "insert" or "update".
     *
     * @param id the id to be updated/inserted
     * @param name the name to be updated/inserted
     * @param email the email to be updated/inserted
     * @param status the status to be updated/inserted
     * @param operation the type of operation to execute
     */
    void setCustomerInformation(int id, String name, String email, String status, String operation);

    /**
     * Writes the specified ResultSet to a file.
     *
     * @param rs the ResultSet to be written
     *
     * @return true if file writing was successful
     */
    boolean writeToFile(ResultSet rs);
}