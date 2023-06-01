package com.rest.simplecrm;

import java.util.ArrayList;

public interface CustomerService {
  Customer createCustomer(Customer customer);

  Customer getCustomer(int id);

  ArrayList<Customer> getAllCustomers();

  Customer updateCustomer(int id, Customer customer);

  void deleteCustomer(int id);

}