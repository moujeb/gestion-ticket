package com.Tickets.RESTController;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.Tickets.model.Intervention;
import com.Tickets.model.Ticket;
import com.Tickets.repository.InterventionRepository;
import com.Tickets.repository.TicketRepository;
import com.Tickets.service.InterventionService;

@RestController
@RequestMapping("/api/Interventions")
@CrossOrigin(origins = "http://localhost:4200")
public class InterventionRESTController {
	@Autowired
	InterventionService InterventionService;
	
	@Autowired
	InterventionRepository InterventionRepository;
	
	@Autowired
	TicketRepository TicketRepository;
	@RequestMapping(method=RequestMethod.GET)
	public List<Intervention> getAllInterventions()
	{
		return InterventionService.getAllInterventions();
	}
	@RequestMapping(value ="/nbI/{id}",method = RequestMethod.GET)
	public int NombreTByIntervention(@PathVariable("id") Long id){
	return InterventionRepository.NombreByIntervention(id);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public Intervention updateIntervention(@RequestBody Intervention Intervention) {
		
		return InterventionService.saveIntervention(Intervention);
		
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	public void deleteIntervention(@PathVariable("id") Long id)
	{
		InterventionService.deleteInterventionById(id);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public Intervention createIntervention(@RequestBody Intervention Intervention)
	{
		Ticket t=Intervention.getTicket();
		t.setNbI(t.getNbI()+1);
		TicketRepository.save(t);
		Intervention.getTicket().setEnable("0");;
	    TicketRepository.save(Intervention.getTicket())	;
  System.out.print(  Intervention.getCommentaire());
	     System.out.print("Creation intervention");	
		return InterventionService.saveIntervention(Intervention);
	}

	
	

}


