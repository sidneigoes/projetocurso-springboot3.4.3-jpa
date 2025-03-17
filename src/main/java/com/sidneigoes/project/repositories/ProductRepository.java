package com.sidneigoes.project.repositories;

import com.sidneigoes.project.entities.Product;
import com.sidneigoes.project.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
