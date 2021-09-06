package com.baggio.projeto.order.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baggio.projeto.order.entities.Order;
import com.baggio.projeto.order.repositories.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository orderRepository;
	
	
	public List<Order> findAll() {
		return orderRepository.findAll();
	}
	
	public Order findById(Long id) {
		Optional<Order> orderOptional = orderRepository.findById(id); 
		return orderOptional.get();
	}
	
}
