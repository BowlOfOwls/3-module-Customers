package com.rest.simplecrm;

import java.util.ArrayList;
import java.util.List;
// import org.springframework.beans.factory.annotation.Autowired;
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

  // Field-based injection
  // @Autowired
  // private CustomerRepository customerRepository;
  private CustomerRepository customerRepository;

  // Constructor-based injection
  // @Autowired
  public CustomerServiceImpl(CustomerRepository customerRepository) {
    this.customerRepository = customerRepository;
  }
  // CustomerServiceImpl(mockRepository)

  // Create
  @Override
  public Customer createCustomer(Customer customer) {
    Customer newCustomer = customerRepository.save(customer);
    return newCustomer;
  }

  // Get One
  @Override
  public Customer getCustomer(int id) {
    Customer foundCustomer = customerRepository.findById(id).get();
    return foundCustomer;
  }
  // Get All
  @Override
  public ArrayList<Customer> getAllCustomers() {
    List<Customer> allCustomers = customerRepository.findAll();
    return (ArrayList<Customer>) allCustomers;
  }

  // Update
  @Override
  public Customer updateCustomer(int id, Customer customer) {
    Customer customerToUpdate = customerRepository.findById(id).get();

    // Update the customer retrieved from DB
    customerToUpdate.setFirstName(customer.getFirstName());
    customerToUpdate.setLastName(customer.getLastName());
    customerToUpdate.setEmail(customer.getEmail());
    customerToUpdate.setContactNo(customer.getContactNo());
    customerToUpdate.setJobTitle(customer.getJobTitle());
    customerToUpdate.setYob(customer.getYob());
    
    return customerRepository.save(customerToUpdate);
  }

  // Delete
  @Override
  public void deleteCustomer(int id) {
    customerRepository.deleteById(id);
  }

}