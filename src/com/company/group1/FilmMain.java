package com.company.group1;

// Problem 5

import java.util.ArrayList;
import java.util.List;

class Film {
	String name;
	String language;
	String lead_actor;
	String category;
	int duration;
	
	public Film() {}

	public Film(String name, String language, String lead_actor, String category, int duration) {
		this.name = name;
		this.language = language;
		this.lead_actor = lead_actor;
		this.category = category;
		this.duration = duration;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getLead_actor() {
		return lead_actor;
	}

	public void setLead_actor(String lead_actor) {
		this.lead_actor = lead_actor;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "Film [name=" + name + ", language=" + language + ", lead_actor=" + lead_actor + ", category=" + category
				+ ", duration=" + duration + "]";
	}
	
	
	
}

public class FilmMain {

	public static void main(String[] args) {
		Film f1 = new Film("Commando", "English" , "Arnold" ,"Action" , 160);
		Film f2 = new Film("Commando: 2", "English" , "Arnold" ,"Action" , 120);
		Film f3 = new Film("Shivaji: The Boss", "Tamil" , "Rajini" ,"Drama" , 180);
		Film f4 = new Film("Hera Pheri", "Hindi" , "Akshay Kumar" ,"Comedy" , 190);
		Film f5 = new Film("Hangover", "English" , "Bradley Cooper" ,"Comedy" , 150);
		

		Film[] arrayFilms = new Film[5];
		arrayFilms[0] = f1;
		arrayFilms[1] = f2;
		arrayFilms[2] = f3;
		arrayFilms[3] = f4;
		arrayFilms[4] = f5;
		
//		Problem Statement 1 
		String movieName1 = new String();
		int shortDuration = Integer.MAX_VALUE;
		String movieName2 = new String();

		List<String> comedyMovies = new ArrayList<>();

		for (int i = 0; i < arrayFilms.length; i++) {
			if(arrayFilms[i].getLanguage().equals("English") && arrayFilms[i].getLead_actor().equals("Arnold")) {
				int currentDuration = arrayFilms[i].getDuration();
				if(currentDuration < shortDuration) {
					shortDuration = currentDuration;
					movieName1 = arrayFilms[i].getName();
				}
			}

			if(arrayFilms[i].getLanguage().equals("Tamil") && arrayFilms[i].getLead_actor().equals("Rajini")) {
				movieName2 = arrayFilms[i].getName();
			}

			if(arrayFilms[i].getCategory().equals("Comedy")) {
				comedyMovies.add(arrayFilms[i].getName());
			}
		}

		System.out.println("English Movie With Arnold as lead actor and has shortest Duration: "+ movieName1);
		System.out.println("Tamil Film with Rajini as a lead actor : " + movieName2);
		System.out.println("Comedy Movies : " + comedyMovies);
	}

}
