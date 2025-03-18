package com.sidneigoes.project.repositories;

import com.sidneigoes.project.entities.OrderItem;
import com.sidneigoes.project.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem,Long> {
}
