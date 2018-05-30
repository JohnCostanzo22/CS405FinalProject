package edu.albany.cs405Final;

/**Abstract class for a person with a name, salary,
 * and extends Payable
 */
public abstract class Person extends Payable<Person> {

	private String name;
	private double salary;
	
	/** Constructor sets fields
	 * @param name
	 * @param salary
	 */
	public Person(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}
	
	/** Accessor
	 * @return - name
	 */
	public String getName() {
		return name;
	}
	
	/** Mutator
	 * @param salary - new salary
	 */
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	/* Accessor
	 * @return - salary
	 */
	@Override
	public double getCost() {
		return salary;
	}

}
