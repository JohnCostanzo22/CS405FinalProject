package edu.albany.cs405Final;

/**Abstract Class equipment has a price
 * and extends Payable with a getCost method implementation
 */
public abstract class Equipment extends Payable<Equipment>{

	private double price;
	
	/**Constructor sets price
	 * @param price
	 */
	public Equipment(double price) {
		this.price = price;
	}
	
	/**Mutator
	 * @param price
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	
	/* Accessor
	 * @return price
	 */
	@Override
	public double getCost() {
		return price;
	}

}
