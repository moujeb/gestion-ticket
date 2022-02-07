package com.Tickets.RESTController;

import java.util.List;




import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.Tickets.model.Client;
import com.Tickets.model.Mail;
import com.Tickets.model.User;
import com.Tickets.repository.UserRepository;
import com.Tickets.service.UserService;
	@RestController
	@RequestMapping("/api/users")
	@CrossOrigin(origins = "http://localhost:4200")
	public class UserRESTController {
		
        Mail mail;
		@Autowired
		UserService userService;
		@Autowired
	    private JavaMailSender mailSender;
		@Autowired
		UserRepository userRepository;
		
		@RequestMapping(method=RequestMethod.GET)
		public List<User> getAllusers()
		{
		    	return userService.getAllUsers();
		}
		@RequestMapping(value="role",method=RequestMethod.GET)
		public List<User> findByRole()
		{
		    	return userService.findByRole();
		}
		@RequestMapping(value="clients",method=RequestMethod.GET)
		public List<User> findClients()
		{
		    	return userService.findClients();
		}
		@RequestMapping(value="/{email}",method = RequestMethod.GET)
		public User getUserById(@PathVariable("email") String email) {
			System.out.print("heeeeeeeeeeeeeeeeeeeeeeer");
			return userService.getUser(email);
		}
		
		@RequestMapping(method = RequestMethod.POST)
		public User createUser(@RequestBody User user)
		{
			user.setEnabled(1);
			System.out.println("****");
			System.out.println("HELLLLLOOO");
			return userService.saveUser(user);
		}
		@RequestMapping(method = RequestMethod.PUT)
		public User updateuser(@RequestBody User user) {
			System.out.print("update user");
			return userService.updateUser(user);
		}
		

		
	
		
		
		@RequestMapping(value ="/login/{email}",method = RequestMethod.GET)
		public User getuserByEmailPassword(@PathVariable("email") String
		email) {
			System.out.print("offf");
			
		return userRepository.findByEmail(email);
		}
		@RequestMapping(value ="users/{email}",method = RequestMethod.GET)
		public int getuser(@PathVariable("email") String email) {
			if(userRepository.findByEmail(email) !=null)
				return 1;
			else
				return 0;
		
		}
	
		
		@RequestMapping(value ="/Inscript/{email}",method = RequestMethod.GET)
		public User getuserByEmail(@PathVariable("email") String
		email) {
		return userRepository.findByEmail(email);
		}
		
		
		
		/*@RequestMapping(value="valide/{id}",method = RequestMethod.GET)
		public User saveUser(@PathVariable("id") Long id)
		{
         int enable=0;
         System.out.print(enable);
			User user = userService.getUser(id);

			user.setEnabled(null);	
			return user;
		}*/
		
		@RequestMapping(value ="/nb",method = RequestMethod.GET)
		public int nombre(){
		return userRepository.Nombre();
		}

	}



