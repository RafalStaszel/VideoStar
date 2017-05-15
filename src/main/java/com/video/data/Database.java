package com.video.data;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.video.film.Film;




// probably class to remove, in its place will be Rest Service (RestVideo)
public class Database {
	
	
	

	public void runBase() {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("videoBaza");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		entityManager.getTransaction().begin();

		// placeholder

		entityManager.getTransaction().commit();
		entityManager.close();
		entityManagerFactory.close();

	}

	public Film findById(int i) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("videoBaza");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		entityManager.getTransaction().begin();

		Film film = entityManager.find(Film.class, i);

		entityManager.getTransaction().commit();
		entityManager.close();
		entityManagerFactory.close();

		return film;
	}
	
	public void showFilms (){
		 EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("videoBaza");
		 EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		
		Query query = entityManager.createNativeQuery("SELECT * FROM videoBaza.film;", Film.class);
		
		ArrayList<Film> films = (ArrayList<Film>) query.getResultList();
		entityManager.getTransaction().commit();
		entityManager.close();
		entityManagerFactory.close();
		for (Film film : films) {
			System.out.println(film.toString());
		}
		
	}

}
