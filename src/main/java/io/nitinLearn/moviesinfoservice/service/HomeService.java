package io.nitinLearn.moviesinfoservice.service;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import io.nitinLearn.moviesinfoservice.bean.Movie;


@Service
public class HomeService {
	private final Logger log = Logger.getLogger(this.getClass());


	public Movie getMovieInfo(String movieId) {
		// TODO Auto-generated method stub
		log.info("calling movie info service "+movieId);
		return new Movie("Test" , movieId);
	}

}
