package com.Tickets.service;
import java.util.List;


import javax.mail.MessagingException;

import com.Tickets.model.Client;
import com.Tickets.repository.ClientRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;




	@Service
	public class ClientServiceImpl implements ClientService{
		@Autowired
		private EmailSenderService service;
		@Autowired
		com.Tickets.repository.ClientRepository ClientRepository;
		
		@Override
		public Client saveClient(Client c) {
			String email = c.getEmail();
			String nom = c.getNom();
			String prenom = c.getPrenom();
			String password = c.getPassword();
			int numtel = c.getNumtel();
			/*client.setEmail(email);
			client.setNom(nom);
			client.setPassword(password);
			client.setCin(cin);
			client.setNumtel(numtel);
			client.setPrenom(prenom);*/
			c.setEnabled(1);
			//    verification de code client.setActive(false);
			
			return ClientRepository.save(c);
		}

		@Override
		public Client updateClient(Client c) {
			return ClientRepository.save(c);
		}

		@Override
		public void deleteClient(Client c) {
			ClientRepository.delete(c);
			
		}

		@Override
		public void deleteClientById(Long id) {
			ClientRepository.deleteById(id);
			
		}

		@Override
		public Client getClient(Long id) {
			return ClientRepository.findById(id).get();
		}

		@Override
		public List<Client> getAllClients() {
			
			return ClientRepository.findAll();
		}


		

	}

