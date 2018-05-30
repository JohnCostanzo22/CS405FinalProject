package edu.albany.cs405Final;

/**A Microphone has a price and a size
 *
 */
public class Microphone extends Equipment {

	private int size;

	/**Constructor sets fields
	 * @param price
	 * @param size
	 */
	public Microphone(double price, int size) {
		super(price);
		this.size = size;
	}
	
	/**Accessor
	 * @return
	 */
	public int getSize() {
		return size;
	}

	/**Mutator
	 * @param size
	 */
	public void setSize(int size) {
		this.size = size;
	}
	
	/* Creates a String representation of Microphone
	 * @return String
	 */
	public String toString() {
		return "Microphone of size: " + size + " costing: " + this.getCost();
	}
}
