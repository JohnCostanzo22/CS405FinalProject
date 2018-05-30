package edu.albany.cs405Final;

/**Actor is a Person and has a role,
 * name, and salary
 */
public class Actor extends Person {

	private String role;
	
	/**Constructor sets fields
	 * @param name
	 * @param salary
	 * @param role
	 */
	public Actor(String name, double salary, String role) {
		super(name, salary);
		//salary < 1 not allowed
		if(salary < 1) {
			super.setSalary(1);
		}
		this.role = role;
	}
	
	/** Accessor
	 * @return
	 */
	public String getRole() {
		return role;
	}
	
	/** Mutator
	 * @param role
	 */
	public void setRole(String role) {
		this.role = role;
	}
	
	/* Creates a String representation of the class
	 * @return String
	 */
	public String toString() {
		return "" + super.getName() + " in role: " + role + " making: $" + super.getCost();
	}
}
