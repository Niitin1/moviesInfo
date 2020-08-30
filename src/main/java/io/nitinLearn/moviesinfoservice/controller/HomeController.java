package io.nitinLearn.moviesinfoservice.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import io.nitinLearn.moviesinfoservice.bean.Movie;
import io.nitinLearn.moviesinfoservice.service.HomeService;


@RestController
public class HomeController {
	
	@Autowired
	HomeService homeService;
	
	private final Logger log = Logger.getLogger(this.getClass());
	
	@GetMapping(value = "/")
	public String getTest() {
		log.info("test");
		return "movieInfo";
	}
	
	@GetMapping(value="/movieInfo/{movieId}")
	public Movie getMovieInfo(@PathVariable String movieId) {
		log.info("movie id is "+movieId);
		return homeService.getMovieInfo(movieId);
	}
	

}
