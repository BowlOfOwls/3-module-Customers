package com.rest.simplecrm;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// Service is where we will put our business logic (i.e. decisions, procesing, computations, etc.)
// Service layer will call the repository layer to update the data store.
// CustomerService will need an instance of CustomerRepository
// Remember concept of composition?
// SelfServiceMachine
// Vending Machine IS A SelfServiceMachine (Inheritance)
// Vending Machine HAS A Cashbox (Composition)

@Service
public class CustomerServiceImpl implements CustomerService {

  // private CustomerRepository customerRepository = new CustomerRepository();

  @Autowired
  private CustomerRepository customerRepository;

  // Create
  @Override
  public Customer createCustomer(Customer customer) {
    Customer newCustomer = customerRepository.createCustomer(customer);
    // return customerRepository.createCustomer(customer);
    return newCustomer;
  }

  // Get One
  @Override
  public Customer getCustomer(String id) {
    Customer foundCustomer = customerRepository.getCustomer(findIndexById(id));
    return foundCustomer;
  }

  // Get All
  @Override
  public ArrayList<Customer> getAllCustomers() {
    ArrayList<Customer> allCustomers = customerRepository.getAllCustomers();
    return allCustomers;
  }

  // Update
  @Override
  public Customer updateCustomer(String id, Customer customer) {
    Customer updatedCustomer = customerRepository.updateCustomer(findIndexById(id), customer);
    return updatedCustomer;
  }

  // Delete
  @Override
  public void deleteCustomer(String id) {
    customerRepository.deleteCustomer(findIndexById(id));
  }

  // Technically this is part of the business logic and should in be service
  // Because the controller mainly just handles HTTP request and response
  // Helper Method
  private int findIndexById(String id) {

    for (Customer customer : customerRepository.getAllCustomers()) {
      if (customer.getId().equals(id)) {
        return customerRepository.getAllCustomers().indexOf(customer);
      }
    }

    // return -1;
    throw new CustmoerNotFoundException();

  }

}
