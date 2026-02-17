package com.isaiasiotti.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.isaiasiotti.webservice.entities.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

}
