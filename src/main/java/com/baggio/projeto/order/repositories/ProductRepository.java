package com.baggio.projeto.order.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.baggio.projeto.order.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
