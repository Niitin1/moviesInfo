package io.nitinLearn.moviesinfoservice.bean;

public class MovieSummary {
	
	private String title;
	private String overview;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getOverview() {
		return overview;
	}
	public void setOverview(String overview) {
		this.overview = overview;
	}
	public MovieSummary(String title, String overview) {
		super();
		this.title = title;
		this.overview = overview;
	}
	public MovieSummary() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "MovieSummary [title=" + title + ", overview=" + overview + "]";
	}
	
	

}
