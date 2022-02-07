package com.Tickets.service;

import java.util.List;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Tickets.model.Client;
import com.Tickets.model.Ticket;
import com.Tickets.model.Ticket;
import com.Tickets.repository.*;
@Service

public class TicketServiceImpl  implements TicketService{
	@Autowired
	private EmailSenderService service;
	@Autowired
	TicketRepository TicketRepository;
	
	@Override
	public Ticket saveTicket(Ticket c) {
	
	
		return TicketRepository.save(c);
	}

	@Override
	public Ticket updateTicket(Ticket c) {
		return TicketRepository.save(c);
	}

	@Override
	public void deleteTicket(Ticket c) {
		TicketRepository.delete(c);
		
	}

	@Override
	public void deleteTicketById(Long id) {
		TicketRepository.deleteById(id);
		
	}

	@Override
	public Ticket getTicket(Long id) {
		return TicketRepository.findById(id).get();
	}

	@Override
	public List<Ticket> getAllTickets() {
		
		return TicketRepository.findAll();
	}

	@Override
	public List<Ticket> findByClient(String email) {
		// TODO Auto-generated method stub
		return TicketRepository.findByClient(email);
	}
	@Override
	public List<Ticket> findByEmployer(String email) {
		// TODO Auto-generated method stub
		return TicketRepository.findByEmployer(email);
	}

	@Override
	public List<Ticket> findByStatus(String status) {
		// TODO Auto-generated method stub
		return TicketRepository.findByStatus(status);
	}

	@Override
	public List<Ticket> findByStatusF() {
		// TODO Auto-generated method stub
		return TicketRepository.findByStatusF();
	}

	@Override
	public List<Ticket> findByStatusR() {
		// TODO Auto-generated method stub
		return TicketRepository.findByStatusR();
	}

	@Override
	public List<Ticket> GetAllTickets() {
		// TODO Auto-generated method stub
		return TicketRepository.GetAllTickets();
	}

	@Override
	public List<Ticket> findByInterventionEmail(String email) {
		// TODO Auto-generated method stub
		return TicketRepository.findByInterventionEmail(email);
	}

	@Override
	public int NombreTEmployer(String email) {
		// TODO Auto-generated method stub
		return TicketRepository.NombreTEmployer(email);
		
	}

	@Override
	public int NombreTFmployer(String email) {
		// TODO Auto-generated method stub
		return TicketRepository.NombreTfEmployer(email);
	}
	/*voi*/
	@Override
	public int findByPrioriteFN() {
		// TODO Auto-generated method stub
		return TicketRepository.findByPrioriteFN();
	}

	@Override
	public int findByPrioriteFH() {
		// TODO Auto-generated method stub
		return TicketRepository.findByPrioriteFH();
	}

	@Override
	public int findByPrioriteFF() {
		// TODO Auto-generated method stub
		return TicketRepository.findByPrioriteFF();
	}

	@Override
	public int findByPrioriteFI() {
		// TODO Auto-generated method stub
		return TicketRepository.findByPrioriteFI();
	}

	@Override
	public int findByPrioriteFU() {
		// TODO Auto-generated method stub
		return TicketRepository.findByPrioriteFU();
	}

	@Override
	public int findByPrioriteON() {
		// TODO Auto-generated method stub
		return TicketRepository.findByPrioriteON();
	}

	@Override
	public int findByPrioriteOH() {
		// TODO Auto-generated method stub
		return TicketRepository.findByPrioriteOH();
	}
	
	@Override
	public int findByPrioriteOF() {
		// TODO Auto-generated method stub
		return TicketRepository.findByPrioriteOF();
	}

	@Override
	public int findByPrioriteOI() {
		// TODO Auto-generated method stub
		return TicketRepository.findByPrioriteOI();
	}

	@Override
	public int findByPrioriteOU() {
		// TODO Auto-generated method stub
		return TicketRepository.findByPrioriteOU();
		
		
	}

	@Override
	public List<Ticket> Interventions() {
		// TODO Auto-generated method stub
		return TicketRepository.Interventions();
	}

	
	

	


}
