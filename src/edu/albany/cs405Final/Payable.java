package edu.albany.cs405Final;

import java.util.Collection;

/**Abstract class that makes sure an object is payable (like an employee or a piece of equipment)
 * Generic class that forces a getCost implementation and has a getTotal method to
 * get the total cost
 * @param <T>
 */
public abstract class Payable<T> {

	/**Implement as an accessor for the cost (or salary) of the object
	 * @return the cost
	 */
	public abstract double getCost();
	
	/**Get the total cost of the objects in the collection using getCost() method
	 * @param collection - a collection of <T> objects
	 * @return the total cost
	 */
	public static<T> double getTotal(Collection<T> collection) {
		double total = 0;
						
		for(T t: collection) {
			total += ((Payable<T>) t).getCost();
		}
		return total;
	}
}
