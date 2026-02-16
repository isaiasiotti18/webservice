package com.isaiasiotti.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.isaiasiotti.webservice.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
