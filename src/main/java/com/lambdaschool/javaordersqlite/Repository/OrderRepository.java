package com.lambdaschool.javaordersqlite.Repository;

import com.lambdaschool.javaordersqlite.Models.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
