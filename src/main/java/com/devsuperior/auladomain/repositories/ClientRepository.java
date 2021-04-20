package com.devsuperior.auladomain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.auladomain.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
