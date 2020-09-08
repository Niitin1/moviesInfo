package io.nitinLearn.moviesinfoservice.service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import io.nitinLearn.moviesinfoservice.bean.Movie;
import io.nitinLearn.moviesinfoservice.bean.MovieSummary;


@Service
public class HomeService {
	private final Logger log = Logger.getLogger(this.getClass());
	
	@Value("${movieAPIURL}")
	String apiUrl;
	
	@Value("${apiKey}")
	String apiKey;
	
	@Autowired
	RestTemplate restTemplate;


	public Movie getMovieInfo(String movieId) {
		// TODO Auto-generated method stub
		log.info("calling movie info service "+movieId);
		log.info("url "+apiUrl);
		log.info("api key "+apiKey);
	//	return new Movie("Test" , movieId);
		
		MovieSummary movieSummary = restTemplate.getForObject(apiUrl+movieId+"?api_key="+apiKey, MovieSummary.class);
		log.info("movie summary is "+movieSummary.toString());
		return new Movie(movieSummary.getTitle(),movieId);
	}

}
