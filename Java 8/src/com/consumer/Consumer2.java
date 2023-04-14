package com.consumer;

import java.sql.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

class Movie
{
	private String name;
	private String hero;
	private String heroine;
	public Movie(String name, String hero, String heroine) {
		super();
		this.name = name;
		this.hero = hero;
		this.heroine = heroine;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHero() {
		return hero;
	}
	public void setHero(String hero) {
		this.hero = hero;
	}
	public String getHeroine() {
		return heroine;
	}
	public void setHeroine(String heroine) {
		this.heroine = heroine;
	}

	public String toString()
	{
		return name+" "+hero+" "+heroine;
	}
}
public class Consumer2
{
	public static List<Movie> populate()
	{
		return Arrays.asList(new Movie("Bahubali","Prabhas","Anushka"),
			               	new Movie("RRR", "NTR,Ramcharan","Alia"),
			               	new Movie("Bhola", "Ajay", "NA"));
	}
	public static void main(String[] args) {
       List<Movie> movie=populate();
      Consumer<Movie> conMov=movies->{
    	  System.out.println(movies.getName()+" "+movies.getHero()+" "+movies.getHeroine());
      };
      for(Movie m:movie)
      conMov.accept(m);
	}
}
