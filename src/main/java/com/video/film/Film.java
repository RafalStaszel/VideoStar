package com.video.film;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Film")
public class Film {
	
	@Id
	@GeneratedValue
	private int id;
	@Column(name= "title" , nullable = false , length = 20)
	private String title;
	@Column(name = "avaible ")
	private boolean avaible;
	
	
public Film (int id ,String title){
	this.id = id;
	this.title = title;
	avaible = true;
}

public Film(){
	
}



public int getId() {
	return id;
}



public void setId(int id) {
	this.id = id;
}



public String getTitle() {
	return title;
}



public void setTitle(String title) {
	this.title = title;
}



public boolean isAvaible() {
	return avaible;
}



public void setAvaible(boolean avaible) {
	this.avaible = avaible;
}



@Override
public String toString() {
	// dodac pokazywanie id w metodzie toString
	String avaibleStr;
	if(avaible == true)
		avaibleStr = "tak";
	else 
		avaibleStr = "wypo¿yczony";
	return "Numer w katalogu = "+id + " tytu³ = " + title + ", dostêpny = " + avaibleStr;
}

}
