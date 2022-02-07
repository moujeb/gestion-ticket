package com.Tickets.RESTController;
	import java.util.List;


import com.Tickets.model.Client;
import com.Tickets.model.User;
import com.Tickets.repository.ClientRepository;
import com.Tickets.service.ClientService;
import com.Tickets.service.EmployerService;

import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.web.bind.annotation.CrossOrigin;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RequestMethod;
	import org.springframework.web.bind.annotation.RestController;
	@RestController
	@RequestMapping("/api/clients")
	@CrossOrigin(origins = "http://localhost:4200")
	public class ClientRESTController {
		
		@Autowired
		ClientService ClientService;
		@Autowired
		EmployerService EmployerService;
		@Autowired
		ClientRepository clientRepository;

		@RequestMapping(method=RequestMethod.GET)
		public List<Client> getAllClients()
		{
			return ClientService.getAllClients();
		}
		
		@RequestMapping(value="/{id}",method = RequestMethod.GET)
		public Client getClientById(@PathVariable("id") Long id) {
			return ClientService.getClient(id);
		}
		
		
		@RequestMapping(method = RequestMethod.PUT)
		public Client updateClient(@RequestBody Client client) {
			System.out.print("update user client");
			return ClientService.updateClient(client);
		}
		
		@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
		public void deleteClient(@PathVariable("id") Long id)
		{
				ClientService.deleteClientById(id);
		}
		@RequestMapping(method = RequestMethod.POST)
		public Client createClient(@RequestBody Client client)
		{
			client.setEnabled(0);
			System.out.println(client.getEmail());
			System.out.println(client.getRole());
			System.out.println("HELLLLLOOO");
			
			return ClientService.saveClient(client);
			
			
			}
		
		@RequestMapping(value ="/nb",method = RequestMethod.GET)
		public int nombre(){
		return clientRepository.Nombre();
		}	
	
		
		@RequestMapping(value ="/c/{email}",method = RequestMethod.GET)
		public User getuserByEmailPassword(@PathVariable("email") String
		email) {
			System.out.print("offf");
			
		return clientRepository.findByEmail(email);
		}
		
		
		/**/
		
		
		
	}


