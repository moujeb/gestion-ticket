package com.Tickets.model;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
	public class Client extends User{
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private String email;
		@OneToMany(mappedBy = "client")
		@JsonIgnore
		private List<Ticket> tickets;

		public Client() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Client(String email, int numtel, String nom, String prenom, String role, String password, int enabled,
				String image) {
			super(email, numtel, nom, prenom, role, password, enabled, image);
		}

		public List<Ticket> getTickets() {
			return tickets;
		}

		public void setTickets(List<Ticket> tickets) {
			this.tickets = tickets;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

	

		public Client(long cin, int numtel, String nom, String prenom, String email, String password, int enabled,
				String image) {
			super(cin, numtel, nom, prenom, email, password, enabled, image);
		}

	
		

		


	
}