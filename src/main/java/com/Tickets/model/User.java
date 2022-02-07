package com.Tickets.model;

import java.io.Serializable;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.fasterxml.jackson.annotation.JsonIgnore;

	@Entity
	@Table(uniqueConstraints={@UniqueConstraint(columnNames={"email"})})
	@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
		public class User {
			@Id
			//@GeneratedValue(strategy = GenerationType.IDENTITY)
			private String email;
		private int numtel;
			private String nom,prenom,role;
			
			public User(String email, int numtel, String nom, String prenom, String role, String password, int enabled,
					String image) {
				super();
				this.email = email;
				this.numtel = numtel;
				this.nom = nom;
				this.prenom = prenom;
				this.role = role;
				this.password = password;
				this.enabled = enabled;
				this.image = image;
			}


			public String getRole() {
				return role;
			}


			public void setRole(String role) {
				this.role = role;
			}

			private String password;
			private int enabled;
			@Column(name="image",columnDefinition = "TEXT")
			private  String image;	

			public String getImage() {
				return image;
			}

			
			public int getNumtel() {
				return numtel;
			}

			public void setNumtel(int numtel) {
				this.numtel = numtel;
			}

			public String getNom() {
				return nom;
			}

			public void setNom(String nom) {
				this.nom = nom;
			}

			public String getPrenom() {
				return prenom;
			}

			public void setPrenom(String prenom) {
				this.prenom = prenom;
			}

			public String getEmail() {
				return email;
			}

			public void setEmail(String email) {
				this.email = email;
			}

			public String getPassword() {
				return password;
			}

			public void setPassword(String password) {
				this.password = password;
			}

			public int getEnabled() {
				return enabled;
			}

			public void setEnabled(int enabled) {
				this.enabled = enabled;
			}

			public void setImage(String image) {
				this.image = image;
			}

			public User(long cin, int numtel, String nom, String prenom, String email, String password, int enabled,
					String image) {
				super();
				this.numtel = numtel;
				this.nom = nom;
				this.prenom = prenom;
				this.email = email;
				this.password = password;
				this.enabled = enabled;
				this.image = image;
			}

			public User() {
				super();
			}




				}