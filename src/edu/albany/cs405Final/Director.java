package edu.albany.cs405Final;

import java.util.ArrayList;

/** Director is a Person who has a name, salary, and movie history
 * Uses the Singleton design method because a movie can only have one director
 */
public class Director extends Person {

	private static Director director = null;
	private ArrayList<String> movieHistory;
	
	/**Private constructor sets all the fields
	 * @param name
	 * @param salary
	 * @param movies
	 */
	private Director(String name, double salary, ArrayList<String> movies) {
		super(name, salary);
		movieHistory = new ArrayList<>();
		for(String movie: movies) {
			movieHistory.add(movie);
		}
	}
	
	/** Accessor
	 * @return movieHistory
	 */
	public ArrayList<String> getHistory() {
		return movieHistory;
	}
	
	/** Changes the director to a new director
	 * @param name
	 * @param salary
	 * @param movies
	 * @return the new director
	 */
	public static Director changeDirector(String name, double salary, ArrayList<String> movies) {
		director = new Director(name, salary, movies);
		return director;
	}
	
	/** Accessor
	 * @return the Director (null if no Director)
	 */
	public static Director getDirector() {
		return director;
	}
	
	/* Creates a String representation of Director
	 * @return String
	 */
	public String toString() {
		return "Director " + this.getName() + " making: $" + this.getCost() + " past movies: " + movieHistory.toString();
	}
}
