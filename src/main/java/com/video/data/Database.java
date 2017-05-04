package com.video.data;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.video.film.Film;

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

}
