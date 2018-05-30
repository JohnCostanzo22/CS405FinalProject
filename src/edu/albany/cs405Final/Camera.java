package edu.albany.cs405Final;

/**A Camera has a price, zoom, and
 * weight
 */
public class Camera extends Equipment {

	private int zoom;
	private int weight;
	
	/** Constructor sets fields
	 * @param price
	 * @param zoom
	 * @param weight
	 */
	public Camera(double price, int zoom, int weight) {
		super(price);
		this.zoom = zoom;
		this.weight = weight;
	}
	
	/** Accessor
	 * @return
	 */
	public int getZoom() {
		return zoom;
	}

	/** Mutator
	 * @param zoom
	 */
	public void setZoom(int zoom) {
		this.zoom = zoom;
	}

	/** Accessor
	 * @return
	 */
	public int getWeight() {
		return weight;
	}

	/**Mutator
	 * @param weight
	 */
	public void setWeight(int weight) {
		this.weight = weight;
	}

	/* Creates a String representation of a Camera
	 * @return String
	 */
	public String toString() {
		return "Camera with zoom: " + zoom + " weight: " + weight + " costing: $" + this.getCost();
	}
}
