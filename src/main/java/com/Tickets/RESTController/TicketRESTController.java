package com.Tickets.RESTController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.Tickets.model.Ticket;
import com.Tickets.repository.TicketRepository;
import com.Tickets.service.TicketService;


@RestController
@RequestMapping("/api/Tickets")
@CrossOrigin(origins = "http://localhost:4200")
public class TicketRESTController {
	@Autowired
	TicketService TicketService;
	
	@Autowired
	TicketRepository TicketRepository;

	@RequestMapping(method=RequestMethod.GET)
	public List<Ticket> getAllTickets()
	{
		return TicketService.getAllTickets();
	}
	@RequestMapping(value="Intervention",method=RequestMethod.GET)
	public List<Ticket> Intervention()
	{
		return TicketRepository.GetAllTickets();
	}
	
	@RequestMapping(value="Interventions",method=RequestMethod.GET)
	public List<Ticket> Interventions()
	{
		return TicketRepository.Interventions();
	}
	
	@RequestMapping(value="Intervention/{email}",method=RequestMethod.GET)
	public List<Ticket> findByInterventionEmail(@PathVariable("email") String email)
	{
		return TicketRepository.findByInterventionEmail(email);
	}
	
	
	@RequestMapping(value="Clients/{email}",method = RequestMethod.GET)
	public List<Ticket> findByClient(@PathVariable("email") String email)
	{
		return TicketService.findByClient(email);
	}
	@RequestMapping(value="employers/{email}",method = RequestMethod.GET)
	public List<Ticket> findByEmployer(@PathVariable("email") String email)
	{
		return TicketRepository.findByEmployer(email);
	}
	@RequestMapping(value="status/{status}",method = RequestMethod.GET)
	public List<Ticket> findByStatus(@PathVariable("status") String status)
	{
		return TicketService.findByStatus(status);
	}
	@RequestMapping(value="status",method = RequestMethod.GET)
	public List<Ticket> findByStatusF()
	{
		return TicketService.findByStatusF();
	}
	@RequestMapping(value="statusR",method = RequestMethod.GET)
	public List<Ticket> findByStatusR()
	{
		return TicketService.findByStatusR();
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Ticket getTicketById(@PathVariable("id") Long id) {
		return TicketService.getTicket(id);
	}
	
	
	@RequestMapping(method = RequestMethod.PUT)
	public Ticket updateTicket(@RequestBody Ticket Ticket) {
		System.out.print(Ticket.getStatus());
		long now ;
		now = System.currentTimeMillis();
		if((Ticket.getStatus().equals("Resolu"))||(Ticket.getStatus().equals("Rejeté"))||(Ticket.getStatus().equals("Fermé")))
		{
			Date date = new Date(now);
			System.out.println(date);
			String s =date.toString();
			String t=s.substring(0,10 );
			String t1=s.substring(24,28 );
			Ticket.setDatF(t+" "+t1);
			System.out.println(t);
			System.out.println(t1);
     		Ticket.setDateF(date);
		return TicketService.saveTicket(Ticket);
		}
		else {
		return TicketService.saveTicket(Ticket);}
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	public void deleteTicket(@PathVariable("id") Long id)
	{
			TicketService.deleteTicketById(id);
	}
	@RequestMapping(method = RequestMethod.POST)
	public Ticket createTicket(@RequestBody Ticket Ticket)
	{
		  
				long now ;
				now = System.currentTimeMillis();
				Date date = new Date(now);
				System.out.println(date);
				String s =date.toString();
				String t=s.substring(0,10 );
				String t1=s.substring(24,28 );
				Ticket.setDatd(t+" "+t1);
				System.out.println(t);
				System.out.println(t1);
			     
				Ticket.setDateD(date);
				
		Ticket.setEnable("1");
		System.out.println("****");
		System.out.println(Ticket.getEmployer());
		
		return TicketService.saveTicket(Ticket);
	}
	@RequestMapping(value ="/nb",method = RequestMethod.GET)
	public int nombre(){
	return TicketRepository.Nombre();
	}
	@RequestMapping(value ="/nbE/{email}",method = RequestMethod.GET)
	public int NombreTEmployer(@PathVariable("email") String email){
	return TicketRepository.NombreTEmployer(email);
	}
	
	@RequestMapping(value ="/nbF/{email}",method = RequestMethod.GET)
	public int NombreTfEmployer(@PathVariable("email") String email){
	return TicketRepository.NombreTfEmployer(email);
	}
	
	
	@RequestMapping(value ="/FN",method = RequestMethod.GET)
	public int findByPrioriteFN(){
	return TicketRepository.findByPrioriteFN();
	}
	@RequestMapping(value ="/FH",method = RequestMethod.GET)
	public int findByPrioriteFH(){
	return TicketRepository.findByPrioriteFH();
	}
	@RequestMapping(value ="/FI",method = RequestMethod.GET)
	public int findByPrioriteFI(){
	return TicketRepository.findByPrioriteFI();
	}
	@RequestMapping(value ="/FF",method = RequestMethod.GET)
	public int findByPrioriteFF(){
	return TicketRepository.findByPrioriteFF();
	}
	@RequestMapping(value ="/FU",method = RequestMethod.GET)
	public int findByPrioriteFU(){
	return TicketRepository.findByPrioriteFF();
	}
	@RequestMapping(value ="/ON",method = RequestMethod.GET)
	public int findByPrioriteON(){
	return TicketRepository.findByPrioriteON();
	}
	@RequestMapping(value ="/OH",method = RequestMethod.GET)
	public int findByPrioriteOH(){
	return TicketRepository.findByPrioriteOH();
	}
	@RequestMapping(value ="/OI",method = RequestMethod.GET)
	public int findByPrioriteOI(){
	return TicketRepository.findByPrioriteOI();
	}
	@RequestMapping(value ="/OF",method = RequestMethod.GET)
	public int findByPrioriteOF(){
	return TicketRepository.findByPrioriteFF();
	}
	@RequestMapping(value ="/OU",method = RequestMethod.GET)
	public int findByPrioriteOU(){
	return TicketRepository.findByPrioriteFF();
	}
	@RequestMapping(value ="/filtreDate/{dd}/{df}",method = RequestMethod.GET)
	public  List<Ticket> filtreDate(Date dd ,Date df){
	return TicketRepository.findByFiltre(dd, df);
	}
}
