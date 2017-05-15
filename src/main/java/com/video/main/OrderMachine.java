package com.video.main;

import java.util.Scanner;

import com.video.domain.Film;
import com.video.service.QueryRest;

public class OrderMachine {

	QueryRest queryRest = new QueryRest();

	public void start() {

		// test user
		String user = "Rafal";

		Scanner scan = new Scanner(System.in);
		System.out.println("Wybierz opcjê \n1 - Poka¿ filmy\n2 - Po¿ycz film "
				+ "\n3 - Oddaj film \n4 - Przegl¹d wypo¿yczeñ");
		int chosen = scan.nextInt();

		switch (chosen) {
		case 1: {
			// pokaz filmy
			queryRest.findAll();
			break;
		}
		case 2: {
			// wypozyczenie filmu
			System.out.println("Jaki film po¿yczasz?");
			int selectFilm = scan.nextInt();
			Film film = queryRest.findById(selectFilm);

			System.out.println("Wypo¿yczasz film " + film.getTitle() + "\n");
			break;
		}
		case 3: {
			System.out.println("Jaki film oddajesz?");
			int selectFilm = scan.nextInt();
			// database.returnBorrowedFilm(selectFilm-1);
			// System.out.println("Oddajesz film
			// "+database.getFilms().get(selectFilm-1).getTitle()+"\n");
		}
		case 4: {
			System.out.println("Sprawdzamy status wypo¿yczeñ");
			// System.out.println(database.getCustomers().get(0).toString());
		}

		}
		start(); // loop na klasie

	}

}
