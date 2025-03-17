package com.sidneigoes.project.repositories;

import com.sidneigoes.project.entities.Order;
import com.sidneigoes.project.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {
}
