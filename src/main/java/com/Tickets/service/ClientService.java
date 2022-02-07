package com.Tickets.service;
import java.util.List;

import com.Tickets.model.Client;
	public interface ClientService {
		Client saveClient(Client c);
		Client updateClient(Client c);
		void deleteClient(Client c);
		void deleteClientById(Long id);
		Client getClient(Long id);
		List<Client> getAllClients();
	}
