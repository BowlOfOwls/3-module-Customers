package com.rest.simplecrm;

import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.stereotype.Repository;

// the repository is unneccassary, as a JpaRepository it is already a bean
// @Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    // lst one of the Entity that you want to save
    // 2nd is the data type of the ID, in this case being Integer
    // We do not implement the methods here as Spring Jpa will automatially provide
    // the implementation and it will become a bean for us


}
