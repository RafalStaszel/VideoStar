package com.video.data;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Iterator;

import com.video.customer.Customer;
import com.video.film.Film;

//klasa testowa na wypadek jakby polaczenie do bazy nie dzialalo
public class DataLocal {

	private static ArrayList<Film> films = new ArrayList<>();
	private static ArrayList<Customer> customers = new ArrayList<>();

	public DataLocal() {
		Film film1 = new Film(01, "Terminator");
		Film film2 = new Film(02, "Predator");
		films.add(film1);
		films.add(film2);

	}

	public static ArrayList<Customer> getCustomers() {
		return customers;
	}

	// trzeba zdecydowac, ktory przeglad listy jest lepszy
	// (long czasProgramu currentTimeMillis() mozemy sprawdzic gdy lista bedzie
	// dluzsza)
	public void pokazFilmy() {

		System.out.println("Nasze filmy: ");
		for (Film f : films) {
			System.out.println(f);
		}
	}

	public void pokazFilmyIterator() {
		for (Iterator<Film> i = films.iterator(); i.hasNext();) {
			Film item = i.next();
			System.out.println(item);

		}
	}

	public void setBorrowFilm(int i, String user) {
		films.get(i).setAvaible(false);
		Customer customer1 = new Customer(user, films.get(1).getTitle(), LocalDate.of(2016, Month.NOVEMBER, 9));

		customers.add(customer1);
	}

	public void returnBorrowedFilm(int i) {
		films.get(i).setAvaible(true);
	}

	public static ArrayList<Film> getFilms() {
		return films;
	}

	public static void setFilms(ArrayList<Film> films) {
		DataLocal.films = films;
	}

}
