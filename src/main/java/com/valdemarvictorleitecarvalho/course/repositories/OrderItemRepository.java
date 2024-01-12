package com.valdemarvictorleitecarvalho.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.valdemarvictorleitecarvalho.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
