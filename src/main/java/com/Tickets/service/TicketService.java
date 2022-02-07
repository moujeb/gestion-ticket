package com.Tickets.service;

import java.util.List;

import com.Tickets.model.Client;
import com.Tickets.model.Ticket;




public interface TicketService {
	Ticket saveTicket(Ticket c);
	int NombreTEmployer(String email);
	int NombreTFmployer(String email);
	
	
	
	Ticket updateTicket(Ticket c);
	void deleteTicket(Ticket c);
	void deleteTicketById(Long id);
	Ticket getTicket(Long id);
	List<Ticket> getAllTickets();
	List<Ticket> findByClient (String email);
	List<Ticket> findByStatus (String status);
	List<Ticket> findByStatusF ();
	List<Ticket> findByStatusR ();
	List<Ticket>GetAllTickets();
	List<Ticket>Interventions();
	int findByPrioriteFN ();
	int findByPrioriteFH ();
	int findByPrioriteFF ();
	int findByPrioriteFI ();
	int findByPrioriteFU ();
	
	/**/
	int findByPrioriteON ();
	int findByPrioriteOH ();
	int findByPrioriteOF ();
	int findByPrioriteOI ();
	int findByPrioriteOU ();
	List<Ticket> findByEmployer(String email);
	List<Ticket> findByInterventionEmail(String email);
}
