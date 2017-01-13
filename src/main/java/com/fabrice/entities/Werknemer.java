package com.fabrice.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Werknemer")
@Inheritance(strategy= InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="soort", discriminatorType=DiscriminatorType.STRING)

public class Werknemer implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="WerknemerNummer")
	private String nummer;
	
	@Column(name="voornaam")
	private String voornaam; 
	
	@Column(name="achternaam")
	private String achternaam; 
	
	@OneToMany(mappedBy = "werknemer", fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	private Set<WerknemerApparaat> werknemerApparaten;
	
	@OneToMany(mappedBy = "werknemer", fetch = FetchType.EAGER)
	private Set<Apparaat> apparaten;	
	
	public Set<Apparaat> getApparaten() {
		return apparaten;
	}


	public void setApparaten(Set<Apparaat> apparaten) {
		this.apparaten = apparaten;
	}


	public Set<WerknemerApparaat> getWerknemerApparaten() {
		return werknemerApparaten;
	}


	public void setWerknemerApparaten(Set<WerknemerApparaat> werknemerApparaten) {
		this.werknemerApparaten = werknemerApparaten;
	}


	public String getNummer() {
		return nummer;
	}


	public void setNummer(String nummer) {
		this.nummer = nummer;
	}


	public String getVoornaam() {
		return voornaam;
	}


	public void setVoornaam(String voornaam) {
		this.voornaam = voornaam;
	}


	public String getAchternaam() {
		return achternaam;
	}


	public void setAchternaam(String achternaam) {
		this.achternaam = achternaam;
	}


	@DiscriminatorValue("bediende")
	public class Bediende extends Werknemer{
		
	}
	
	@DiscriminatorValue("mechanieker")
	public class Mechanieker extends Werknemer{
		
	}
	
	@DiscriminatorValue("chauffeur")
	public class Chauffeur extends Werknemer{
		
	}
	
	@DiscriminatorValue("externe")
	public class Externe extends Werknemer{
		
	}
	
	
	
	

}
