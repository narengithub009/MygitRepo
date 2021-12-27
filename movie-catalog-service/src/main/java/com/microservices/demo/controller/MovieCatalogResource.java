package com.microservices.demo.controller;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import com.microservices.demo.model.CatalogItem;
import com.microservices.demo.model.Movie;
import com.microservices.demo.model.Rating;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private WebClient.Builder builder;
	
	@RequestMapping("/{userId}")
	public List<CatalogItem> getCatalog(@PathVariable("userId") String userId){
		//RestTemplate restTemplate=new RestTemplate();
		List<Rating> ratings=Arrays.asList(
				new Rating("1234", 9),
				new Rating("4567", 9)
				);
		
		return ratings.stream().map(rating -> {
		Movie movie= restTemplate.getForObject("http://localhost:8082/movies/" +rating.getMovieId(), Movie.class);
		
		/*Movie movie= builder.build()
				.get()
				.uri("http://localhost:8082/movies/" +rating.getMovieId())
				.retrieve()
				.bodyToMono(Movie.class)
				.block();*/
		
			return new CatalogItem(movie.getName(),"Test",9);
		}).collect(Collectors.toList());
	/*	return Collections.singletonList(

				new CatalogItem("Jai Bhim", "Test", 9));*/
	}
}
