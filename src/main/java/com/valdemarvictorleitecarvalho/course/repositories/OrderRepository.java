package com.valdemarvictorleitecarvalho.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.valdemarvictorleitecarvalho.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
