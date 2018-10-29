/* Class		 : Object-Oriented Design and Analysis
* Professor  : Orlando Montalvo
* Assignment : HW 2
* Students	 : Aditya(@01392300)
* 	           Nikhil(@01392295)
*	           Raghunandan(@01390645 )
*/

package HW1.edu.fitchburgstate.csc7400;

/*This class contain the information of ricks store it store like price,serial no and
 * a guitar spec object which have more info like  type wood model
 * this all info is used to search guitar */

public class Guitar {
	private GuitarSpec g;
	/**
	 * Full constructor
	 * 
	 * @param serialNumber manufacturer serial number
	 * @param price store price
	 * @param Guitarspec 
	 */
	public Guitar(String serialNumber, double price, 
			GuitarSpec g) {
		this.serialNumber = serialNumber;
		this.price = price;
		this.g=g;
		
	}
/*empty guitar constructor Default
 * */
	public Guitar() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Returns the manufacturer serial number
	 * 
	 * NB: Gets and sets do not need @params or @returns because they do one thing which
	 * is already in the comment
	 */
	public String getSerialNumber() {
		return serialNumber;
	}

	/**
	 * Returns store price of guitar
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * Sets the store price of the guitar
	 */
	public void setPrice(double newPrice) {
		this.price = newPrice;
	}

	/**
	 * Returns the name of the manufacturer
	 */
	public String getManufacturer() {
		return this.manufacturer;
	}

	/**
	 * Returns the manufacturer model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * Returns the guitar type
	 * @return
	 */
	public String getType() {
		return type;
	}

	/**
	 * Returns the type of wood used in the body
	 */
	public String getBackWood() {
		return backWood;
	}

	/**
	 * Returns the type of wood used in the face
	 * @return
	 */
	public String getTopWood() {
		return topWood;
	}

	/**
	 * The guitars manufacturer serial number
	 */
	private String serialNumber;

	/**
	 * The name of the manufacturer
	 */
	private String manufacturer;

	/**
	 * The manufacturer model number
	 */
	private String model;

	/**
	 * The guitar type (electric/acoustic)
	 */
	private String type;

	/**
	 * The wood used for the back of the guitar
	 */
	private String backWood;

	/**
	 * The wood used for the face of the guitar
	 */
	private String topWood;

	/**
	 * Rick's price for the guitar
	 */
	private double price;
	public GuitarSpec getGuitarSpec()//return the guitar spec
	{
		return g;
		
	}
	
}
