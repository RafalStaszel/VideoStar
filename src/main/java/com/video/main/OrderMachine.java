package com.video.main;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


import com.video.data.DataLocal;
import com.video.data.Database;
import com.video.film.Film;

public class OrderMachine {
	
	DataLocal dataLocal = new DataLocal();

	public void start() {

		// Database database = new Database();
		// database.runBase();
		
		//test user
		String user = "Rafal";

		Scanner scan = new Scanner(System.in);
		System.out.println("Wybierz opcjê \n1 - Poka¿ filmy\n2 - Po¿ycz film \n3 - Oddaj film \n4 - Przegl¹d wypo¿yczeñ");
		int chosen = scan.nextInt();
		

		switch (chosen) {
		case 1: {
			// pokaz filmy
			// casetette.showFilms();
			dataLocal.pokazFilmy();
			// dataLocal.pokazFilmyIterator();
			break;
		}
		case 2: {
			// wypozyczenie filmu
			System.out.println("Jaki film po¿yczasz?");
			int selectFilm = scan.nextInt();
			dataLocal.setBorrowFilm(selectFilm-1,user);
			// dodac metode klienta
			
			
			
			System.out.println("Wypo¿yczasz film "+dataLocal.getFilms().get(selectFilm-1).getTitle()+"\n");
			break;
		}
		case 3:{
			System.out.println("Jaki film oddajesz?");
			int selectFilm = scan.nextInt();
			dataLocal.returnBorrowedFilm(selectFilm-1);
			System.out.println("Oddajesz film "+dataLocal.getFilms().get(selectFilm-1).getTitle()+"\n");
		}
		case 4:{
			System.out.println("Sprawdzamy status wypo¿yczeñ");
			System.out.println(dataLocal.getCustomers().get(0).toString());
		}
		

		}
		start();      // loop na klasie

	}

}
