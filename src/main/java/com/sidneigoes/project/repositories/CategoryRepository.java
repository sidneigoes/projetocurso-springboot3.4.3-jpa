package com.sidneigoes.project.repositories;

import com.sidneigoes.project.entities.Category;
import com.sidneigoes.project.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {
}
