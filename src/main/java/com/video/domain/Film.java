package com.video.domain;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Film {

	private int id;
	private String title;
	private boolean avaible;

	public Film(int id, String title) {
		this.id = id;
		this.title = title;
		avaible = true;
	}

	public Film() {

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
		String avaibleStr;
		if (avaible == true)
			avaibleStr = "tak";
		else
			avaibleStr = "wypo¿yczony";
		return "Numer w katalogu = " + id + " tytu³ = " + title + ", dostêpny = " + avaibleStr;
	}

}
