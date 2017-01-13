package com.fabrice.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.Table;
import javax.persistence.InheritanceType;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;


@Entity
@Table(name="Apparaat")
@Inheritance(strategy= InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="soort", discriminatorType=DiscriminatorType.STRING)
public class Apparaat implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ApparaatCode")
	private String code;
	
	@Column(name="staat")
	private String staat; 
	
	@ManyToOne
	@JoinColumn(name="werknemerNummer")
	private Werknemer werknemer;
	
	@OneToMany(mappedBy = "apparaat")
	private Set<WerknemerApparaat> werknemerApparaten;
	
	//Getters en setters
	public Werknemer getWerknemer() {
		return werknemer;
	}

	public void setWerknemer(Werknemer werknemer) {
		this.werknemer = werknemer;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getStaat() {
		return staat;
	}

	public void setStaat(String staat) {
		this.staat = staat;
	}
	
	
	public Set<WerknemerApparaat> getWerknemerApparaten() {
		return werknemerApparaten;
	}

	public void setWerknemerApparaten(Set<WerknemerApparaat> werknemerApparaten) {
		this.werknemerApparaten = werknemerApparaten;
	}

	@DiscriminatorValue("zender")
	public class Zender extends Apparaat{
		
	}
	
	@DiscriminatorValue("badge")
	public class Badge extends Apparaat{
		
	}

	

}
