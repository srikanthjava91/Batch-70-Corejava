package com.languagefundamentals.constructors;

//class Test1{
////	Movie m = new Movie();//The constructor Movie() is not visible
//}

public class Movie {

	String hero;
	String heroine;
	String director;
	double budget;
	String movieName;
	String producer;

	private Movie() {
		System.out.println("no-arg constructor called !");
	}

	Movie(String producer, String director) {
		this();
		System.out.println("parameterized-1 constructor called !!");
		this.producer = producer;
		this.director = director;
	}

	Movie(Movie m, String hero, double budget) {
		this(m.producer, m.director);
		System.out.println("parameterized-2 constructor called !!");
		this.budget = budget;
		this.hero = hero;

	}

	Movie(Movie m, String heroine, String movieName) {
		this(m, m.hero, m.budget);
		System.out.println("parameterized-3 constructor called !!");
		this.heroine = heroine;
		this.movieName = movieName;
	}

	public static void main(String[] args) {
		System.out.println("main method started !!");

		Movie m1 = new Movie();
		m1.showDetails();

		Movie m2 = new Movie("D V V ", "Rajamouli");
		m2.showDetails();

		Movie m3 = new Movie(m2, "Mahehsh Babu", 50000000000.00);
		m3.showDetails();

		Movie m4 = new Movie(m3, "Priyanka Chopra", "VARANASI");
		m4.showDetails();

		System.out.println("main method ended !!");

	}

	void showDetails() {
		System.out.println("Name of the Hero : " + hero);
		System.out.println("Name of the Heroine : " + heroine);
		System.out.println("Name of the Movie : " + movieName);
		System.out.println("Name of the Director : " + director);
		System.out.println("Name of the Producer : " + producer);
		System.out.println("Budget of the Movie : " + budget);
		System.out.println("***********************************");
	}

}
