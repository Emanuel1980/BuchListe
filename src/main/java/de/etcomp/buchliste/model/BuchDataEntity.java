package de.etcomp.buchliste.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="buecher")
public class BuchDataEntity {
	
	@Id
	@Column(name="id", unique=true, nullable=false, updatable=false)
	private String Id;
	
	@Column(name="buch_titel")
	private String buchTitel;
	
	private String author;
	
	private String genre;
	
	private String inhalt;
	
	private String notiz;

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getBuchTitel() {
		return buchTitel;
	}

	public void setBuchTitel(String buchTitel) {
		this.buchTitel = buchTitel;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getInhalt() {
		return inhalt;
	}

	public void setInhalt(String inhalt) {
		this.inhalt = inhalt;
	}

	public String getNotiz() {
		return notiz;
	}

	public void setNotiz(String notiz) {
		this.notiz = notiz;
	}

}
