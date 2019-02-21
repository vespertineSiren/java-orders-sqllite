package com.lambdaschool.javaordersqlite.Repository;

import com.lambdaschool.javaordersqlite.Models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
