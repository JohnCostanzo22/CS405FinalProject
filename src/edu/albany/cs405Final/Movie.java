package edu.albany.cs405Final;

import java.util.ArrayList;

/**Movie uses Facade design Pattern to hide all of the inner classes
 * Maintains lists of employees and equipment to track costs of a movie
 */
public class Movie {

	//using ArrayList to allow for any amount of employees and equipment
	private ArrayList<Person> employees;
	private ArrayList<Equipment> equipment;
	private String title;
	private double budget;
	
	/** Constructor sets fields and initializes ArrayLists
	 * @param title
	 * @param budget
	 */
	public Movie(String title, double budget) {
		this.title = title;
		this.budget = budget;
		employees = new ArrayList<>();
		equipment = new ArrayList<>();
	}
	
	/** Mutator
	 * @param title
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	
	/** Adds a new Actor to employees
	 * @param name
	 * @param salary
	 * @param role
	 */
	public void addActor(String name, double salary, String role) {
		employees.add(new Actor(name, salary, role));
	}
	
	/** Adds a new Director to employees
	 * Also removes old director from employees
	 * @param name
	 * @param salary
	 * @param movies
	 */
	public void addDirector(String name, double salary, ArrayList<String> movies) {
		employees.remove(Director.getDirector());
		Director.changeDirector(name, salary, movies);
		employees.add(Director.getDirector());
	}
	
	/** Adds a new Operator with a new Camera to employees and equipment
	 * @param name
	 * @param salary
	 * @param price
	 * @param zoom
	 * @param weight
	 */
	public void addOperatorWithCamera(String name, double salary, double price,
			int zoom, int weight) {
		Equipment camera = new Camera(price, zoom, weight);
		equipment.add(camera);
		employees.add(new Operator(name, salary, camera));
	}
	
	/** Adds a new Operator with a new Microphone to employees and equipment
	 * @param name
	 * @param salary
	 * @param price
	 * @param size
	 */
	public void addOperatorWithMicrophone(String name, double salary, double price,
			int size) {
		Equipment microphone = new Microphone(price, size);
		equipment.add(microphone);
		employees.add(new Operator(name, salary, microphone));
	}
	
	/** gets the Total cost of Employees
	 * @return
	 */
	public double getCostEmployees() {
		return Payable.getTotal(employees);
	}
	
	/** gets the total cost of Equipment
	 * @return
	 */
	public double getCostEquipment() {
		return Payable.getTotal(equipment);
	}
	
	/** gets the total cost of both employees and equipment
	 * @return
	 */
	public double getTotalCost() {
		return this.getCostEmployees() + this.getCostEquipment();
	}
	
	/** gets the remaining budget for the movie
	 * @return
	 */
	public double getRemainingBudget() {
		//allow movie to go over budget because that happens
		return budget - this.getTotalCost();
	}
	
	/* Creates a String representation of the movie
	 * @return String
	 */
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(title + " with a budget of $" + budget + "\n");
		for(Person person: employees) {
			stringBuilder.append(person.toString() + "\n");
		}
		return stringBuilder.toString();
	}
}
