package com.video.customer;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

import com.video.film.Film;

public class Customer {
	String name;
	String filmName;
	LocalDate localDate;
	public Customer(String name, String filmName, LocalDate localDate) {
		this.name = name;
		this.filmName = filmName;
		this.localDate = localDate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFilmName() {
		return filmName;
	}
	public void setFilmName(String filmName) {
		this.filmName = filmName;
	}
	public LocalDate getLocalDate() {
		return localDate;
	}
	public void setLocalDate(LocalDate localDate) {
		this.localDate = localDate;
	}
	@Override
	public String toString() {
	long period = ChronoUnit.DAYS.between(localDate, localDate.now());
	if(period > 7){
		return "Klient imie = " + name + ", po퓓czony film = " + filmName + ", data wypo퓓czenia = " + localDate + 
				" ilo쒏 dni = " + period +" czas preroczony o "+ (period-7)+" dni\n";
	}
	else{
		return "Klient imie = " + name + ", po퓓czony film = " + filmName + ", data wypo퓓czenia = " + localDate + 
				" ilo쒏 dni = " + period +"\n";
	}
	}
	
	
	
	

}
