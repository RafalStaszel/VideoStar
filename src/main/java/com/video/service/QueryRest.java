package com.video.service;

import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.video.domain.Film;

public class QueryRest {

	/*
	 * dziala, ale wszystko static, trzeba pochowac robienie url, moze jakos
	 * przez beana byloby ladniej albo oznaczyc ze to mvp tylko
	 */
	

	static String url = "http://195.181.211.92:8080/RestVideo/video/";
	static RestTemplate restTemplate = new RestTemplate();

	public Film findById(int id) {

		String variousQuery = "findId/";
		Film quote = restTemplate.getForObject(makeQuery(id, variousQuery), Film.class);
		System.out.println(quote.getTitle());
		return quote;
	}

	public List<Film> findAll() {
		String variousQuery = "all";

		ResponseEntity<List<Film>> rateResponse = restTemplate.exchange((url + variousQuery),
				HttpMethod.GET, null,
				new ParameterizedTypeReference<List<Film>>() {});
		List<Film> films = rateResponse.getBody();

		
		
		for (Film film : films) {
			System.out.println(film.getTitle());
		}
		return films;
	}

	private String makeQuery(int id, String variousQuery) {

		String query = url + variousQuery + String.valueOf(id);
		System.out.println(query);
		return query;
	}

}
