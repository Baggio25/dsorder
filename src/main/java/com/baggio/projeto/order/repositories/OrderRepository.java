package com.baggio.projeto.order.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.baggio.projeto.order.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
