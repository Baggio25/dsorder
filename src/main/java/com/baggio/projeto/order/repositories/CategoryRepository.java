package com.baggio.projeto.order.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.baggio.projeto.order.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
