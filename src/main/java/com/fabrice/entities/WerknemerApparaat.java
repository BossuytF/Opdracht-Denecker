package com.fabrice.entities;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="WerknemerApparaat")
public class WerknemerApparaat implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private String id;
	
	@Column(name="startStaat")
	private String startStaat; 
	
	@Column(name="eindStaat")
	private String eindStaat; 
	
	@Column(name="startDatum")
	private Date startDatum; 
	
	@Column(name="eindDatum")
	private Date eindDatum; 
	
	@ManyToOne
	@JoinColumn(name="werknemerNummer")
	private Werknemer werknemer;
	
	@ManyToOne
	@JoinColumn(name="apparaatCode")
	private Apparaat apparaat;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getStartStaat() {
		return startStaat;
	}

	public void setStartStaat(String startStaat) {
		this.startStaat = startStaat;
	}

	public String getEindStaat() {
		return eindStaat;
	}

	public void setEindStaat(String eindStaat) {
		this.eindStaat = eindStaat;
	}

	public Date getStartDatum() {
		return startDatum;
	}

	public void setStartDatum(Date startDatum) {
		this.startDatum = startDatum;
	}

	public Date getEindDatum() {
		return eindDatum;
	}

	public void setEindDatum(Date eindDatum) {
		this.eindDatum = eindDatum;
	}

	public Werknemer getWerknemer() {
		return werknemer;
	}

	public void setWerknemer(Werknemer werknemer) {
		this.werknemer = werknemer;
	}

	public Apparaat getApparaat() {
		return apparaat;
	}

	public void setApparaat(Apparaat apparaat) {
		this.apparaat = apparaat;
	}
	
	
	
	

}
