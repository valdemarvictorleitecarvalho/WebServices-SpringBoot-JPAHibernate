package com.valdemarvictorleitecarvalho.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.valdemarvictorleitecarvalho.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
