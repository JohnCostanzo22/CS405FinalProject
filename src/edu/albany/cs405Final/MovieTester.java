package edu.albany.cs405Final;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *Tester class for Movie
 */
public class MovieTester {

	public static void main(String[] args) {
		
		Movie movie = new Movie("Avengers", 1000000);
		
		
		ArrayList<String> history = new ArrayList<>();
		history.add("The Shape of Water");
		history.add("Pacific Rim");
		movie.addDirector("Guillermo del Toro", 100000, history);
		System.out.print(movie +"\n");
		
		movie.setTitle("Avengers Infinity War");
		
		ArrayList<String> history2 = new ArrayList<>();
		history2.add("Community");
		history2.add("Captain America");
		movie.addDirector("Anthony Russo", 50000, history2);
		System.out.print(movie);
		System.out.println("total Costs: " + movie.getTotalCost());
		System.out.println("remaining budget: " + movie.getRemainingBudget());
		
		movie.addActor("Robert Downey Jr", 100000, "Iron Man");
		movie.addActor("Chris Hemsworth", 60000, "Thor");
		
		System.out.print(movie +"\n");
		
		movie.addOperatorWithCamera("Bob CameraMan", 500, 3000, 2, 15);
		movie.addOperatorWithMicrophone("Michael Scott", 800, 750, 12);
	
		System.out.print(movie);
		System.out.println("total Costs: " + movie.getTotalCost());
		System.out.println("remaining budget: " + movie.getRemainingBudget());
	}

}
