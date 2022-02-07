package com.Tickets.service;
import java.util.List;

import javax.mail.MessagingException;

import com.Tickets.model.Ticket;
import com.Tickets.model.User;

public interface UserService {
	User saveUser(User c) ;
	User updateUser(User c);
	void deleteUser(User c);
	User getUser(String email);
	List<User> getAllUsers();
	void ContactUs(User c);
	List<User> findByRole ();
	List<User> findClients();

}