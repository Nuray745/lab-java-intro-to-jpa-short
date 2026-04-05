package org.ironhack.collections.labairline.repository;

import org.ironhack.collections.labairline.model.Customer;
import org.ironhack.collections.labairline.model.CustomerStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    List<Customer> findByCustomerStatus(CustomerStatus status);

    List<Customer> findByCustomerName(String name);
}
