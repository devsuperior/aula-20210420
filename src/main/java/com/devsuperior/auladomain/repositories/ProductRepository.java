package com.devsuperior.auladomain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.auladomain.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
