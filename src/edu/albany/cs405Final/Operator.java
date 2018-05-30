package edu.albany.cs405Final;

/** An Operator is a Person who has a
 * name, salary, and an equipment
 */
public class Operator extends Person{

	private Equipment equipment;

	/** Constructor sets fields
	 * @param name
	 * @param salary
	 * @param equipment
	 */
	public Operator(String name, double salary, Equipment equipment) {
		super(name,salary);
		this.equipment = equipment;
	}
	
	/** Accessor
	 * @return
	 */
	public Equipment getEquipment() {
		return equipment;
	}

	/** Mutator
	 * @param equipment
	 */
	public void setEquipment(Equipment equipment) {
		this.equipment = equipment;
	}
	
	/* Creates a String repressentation of Operator
	 * @return String
	 */
	public String toString() {
		return "Operator " + this.getName() + " with salary: $" + this.getCost() + 
				" with " + equipment.toString();
	}
}
