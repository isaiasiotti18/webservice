package com.isaiasiotti.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.isaiasiotti.webservice.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
