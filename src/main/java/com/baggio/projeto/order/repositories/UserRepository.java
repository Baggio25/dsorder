package com.baggio.projeto.order.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.baggio.projeto.order.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
