package com.Tickets.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Tickets.model.Stat;


public interface StatRepository extends JpaRepository<Stat, Long> {

}
