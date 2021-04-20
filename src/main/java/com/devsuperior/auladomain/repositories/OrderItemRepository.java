package com.devsuperior.auladomain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.auladomain.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
