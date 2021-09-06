package com.baggio.projeto.order.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baggio.projeto.order.entities.Product;
import com.baggio.projeto.order.repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	
	public List<Product> findAll() {
		return productRepository.findAll();
	}
	
	public Product findById(Long id) {
		Optional<Product> productOptional = productRepository.findById(id); 
		return productOptional.get();
	}
	
}
