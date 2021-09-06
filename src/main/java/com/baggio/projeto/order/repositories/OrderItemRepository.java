package com.baggio.projeto.order.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.baggio.projeto.order.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
