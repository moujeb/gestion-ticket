package com.Tickets.repository;

import java.util.Date;
import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.Tickets.model.Client;
import com.Tickets.model.Ticket;
import com.Tickets.model.User;


public interface TicketRepository extends JpaRepository<Ticket, Long>
{
	String R="select  h from Ticket h where h.status='Rejeté' and (h.employer.email =?1) ";
	
	@Query("select count(*) from Ticket")
    public int Nombre();
  
	
	 @Query("select h from Ticket h where h.client.email = ?1")
		List<Ticket> findByClient (	String email);
	 @Query("select h from Ticket h where h.employer.email = ?1 and h.enable='0'")
		List<Ticket> findByEmployer (	String email);
	 
	 @Query("select h from Ticket h where h.status = ?1")
		List<Ticket> findByStatus (	String status);
	 
	 @Query("select h from Ticket h where h.enable ='1' and h.employer.email =?1")
		List<Ticket> findByInterventionEmail (	String email);
	 
	 
	 
	 @Query("select h from Ticket h where h.nbI=0 ")
		List<Ticket> Interventions ();
	 
	 @Query("select h from Ticket h where h.enable ='1'")
		List<Ticket> GetAllTickets ();
	 @Query("select h from Ticket h where h.status = 'Fermé' or h.status ='Rejeté' or h.status='Resolu' ")
		List<Ticket> findByStatusF ();
	 
	 @Query("select h from Ticket h where  h.DateD >= dateD and h.DateD<=dateF ")
		List<Ticket> findByFiltre(Date dateD,Date dateF);
	 
	 
	/* @Query("select h from Ticket h where  h.titre=?1 ")
		List<Ticket> findByTitre ();
	 
	 @Query("select h from Ticket h where  h.status=?1 ")
		List<Ticket> findByStatus ();
	
	 @Query("select h from Ticket h where  h.dateD=?1 ")
		List<Ticket> findByDateD ();
	  
	 @Query("select h from Ticket h where  h.dateF=?1 ")
		List<Ticket> findByDateF ();
	 @Query("select h from Ticket h where  h.propriete=?1 ")
		List<Ticket> findByPropriete ();
	 @Query("select h from Ticket h where  h.contenue=?1 ")
		List<Ticket> findByContenue ();
	 @Query("select h from Ticket h where  h.progression=?1 ")
		List<Ticket> findByProgression ();
	 */
	 @Query("select count(*)  from Ticket h where h.status = 'Fermé' or h.propriete ='Normale'")
		public int findByPrioriteFN ();
	 
	 @Query("select count(*) from Ticket h where h.status = 'Fermé' or h.propriete ='Haut'")
	 public int  findByPrioriteFH ();
	 
	 @Query("select count(*) from Ticket h where h.status = 'Fermé' or h.propriete ='Faible'")
	 public int  findByPrioriteFF ();
	 
	 @Query("select count(*)  from Ticket h where h.status = 'Fermé' or h.propriete ='Urgent'")
	 public int  findByPrioriteFU ();
	 
	 @Query("select count(*)  from Ticket h where h.status = 'Fermé' or h.propriete ='Immédiate'")
	 public int  findByPrioriteFI ();
	 
	 
	 
	 
	 /*p*/
	 @Query("select count(*)  from Ticket h where h.status = 'Resolu' or h.propriete ='Normale'")
	 public int  findByPrioriteON ();
	 
	 @Query("select count(*)  from Ticket h where h.status = 'Resolu' or h.propriete ='Haut'")
	 public int  findByPrioriteOH ();
	 
	 @Query("select count(*)  from Ticket h where h.status = 'Resolu' or h.propriete ='Faible'")
	 public int  findByPrioriteOF ();
	 
	 @Query("select count(*)  from Ticket h where h.status = 'Resolu' or h.propriete ='Urgent'")
	 public int  findByPrioriteOU ();
	 
	 @Query("select count(*)  from Ticket h where h.status = 'Resolu' or h.propriete ='Immédiate'")
	 public int  findByPrioriteOI ();
	 
	 @Query("select count(e.id)  from Ticket h ,Employer e where h.employer.email =?1 and (h.status='Rejeté' or h.status='Resolu') and e.email=h.employer.email ")
	 public int NombreTEmployer ( String email);
	 
	 @Query("select count(e.id)  from Ticket h ,Employer e where h.employer.email =?1 and (h.status='Nouveau' or h.status='Attente de reponse' and h.status='En cours') and e.email=h.employer.email ")
	 public int NombreTfEmployer ( String email);
	 
	 @Query("select h from Ticket h where h.status = 'En cours' or h.status='Attente de reponse' or h.status='Nouveau'")
		List<Ticket> findByStatusR ();

}
