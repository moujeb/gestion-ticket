package com.Tickets.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.Tickets.model.Intervention;
import com.Tickets.model.Ticket;


public interface InterventionRepository extends JpaRepository<Intervention, Long>{
	@Query("select count(e.id)  from Intervention h ,Ticket e where e.id =?1 and e.id=h.Ticket.id ")
	 public int NombreByIntervention (Long id);
	 
}
