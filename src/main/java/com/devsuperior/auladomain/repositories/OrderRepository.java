package com.devsuperior.auladomain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.auladomain.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
