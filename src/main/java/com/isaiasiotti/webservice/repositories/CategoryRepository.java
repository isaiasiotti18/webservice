package com.isaiasiotti.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.isaiasiotti.webservice.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
