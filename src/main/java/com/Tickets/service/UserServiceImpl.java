package com.Tickets.service;

import java.time.LocalDateTime;






import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

import org.springframework.stereotype.Service;

import com.Tickets.model.Mail;
import com.Tickets.model.User;


	@Service
	public class UserServiceImpl implements UserService{
		@Autowired
		private EmailSenderService service;
		
		@Autowired
		com.Tickets.repository.UserRepository UserRepository;
		
		@Override
		public User saveUser(User c) {
			String email = c.getEmail();
			String nom = c.getNom();
			String prenom = c.getPrenom();
			String password = c.getPassword();
			int numtel = c.getNumtel();
			User User = new User();
			User.setEmail(email);
			User.setNom(nom);
		
			User.setNumtel(numtel);
			User.setPrenom(prenom);
			System.out.print(email);
			
			//    verification de code User.setActive(false);
			
			return UserRepository.save(c);
			

			
		}
		/*@EventListener(ApplicationReadyEvent.class)
		public void triggerMail() throws MessagingException {

			service.sendEmailWithAttachment("tourismepfe@gmail.com",
					"This is Email Body with Attachment...",
					"This email has attachment",
					"C:\\c.jpg"
					);
		}*/
		@Override
		public User updateUser(User c) {
			return UserRepository.save(c);
		}

		@Override
		public void deleteUser(User c) {
			UserRepository.delete(c);
			
		}

		
		@Override
		public User getUser(String email) {
			return UserRepository.findByEmail(email);
		}

		@Override
		public List<User> getAllUsers() {
			
			return UserRepository.findAll();
		}

		@Autowired
	    private JavaMailSender mailSender;
		@Override
		public void ContactUs(User User)
		{
	
		        SimpleMailMessage message = new SimpleMailMessage();

		        message.setFrom(User.getEmail());
		        message.setTo("tourismepfe@gmail.com");
		        message.setText("Client ALLINONE Message");
		        message.setSubject("hhhh");

		        mailSender.send(message);
		        System.out.println("Mail Send...");
		    }
		@Override
		public List<User> findByRole() {
			// TODO Auto-generated method stub
			return UserRepository.findByRole();
		}
		@Override
		public List<User> findClients() {
			// TODO Auto-generated method stub
			return UserRepository.findClients();
		}
		
		

	}

