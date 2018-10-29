/* Class		 : Object-Oriented Design and Analysis
* Professor  : Orlando Montalvo
* Assignment : HW 2
* Students	 : Aditya(@01392300)
* 			   Nikhil(@01392295)
*			   Raghunandan(@01390645 )
*/
package HW1.edu.fitchburgstate.csc7400;


/*This class interact with guitar spec and inventory to provide best matching guitars*/

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/*This method take the input from customer based on user input it searches the inventory and 
 * get all the matching records and displays to customer */
public class FindGuitarTester {
	private static Inventory inventory=new Inventory();
	/*
	 * This method displays the result of the searched guitar based on given parameters.
	 * args are not used
	 */
	public static void main(String[] args) {
		// Set up Rick's guitar inventory
	
		initializeInventory(inventory);
		SpecSearch();
		SearchPrice();
		
	}
	/*
	 * Finding  all  matching guitars even if one attribute match
	 */
	public static void SpecSearch()
	{
		GuitarSpec erinspec = new GuitarSpec(Manufacturer.Fender, "Stratocaster", Type.Electric, Wood.Alder,
				Wood.Alder);

		List listguitar = inventory.search(erinspec);

		if (listguitar != null) {

			for (Iterator i = listguitar.iterator(); i.hasNext();) {
				Guitar g = (Guitar) i.next();
				System.out.println("Erin, you might like this " + g.getGuitarSpec().getManufacturer() + " "
						+ g.getGuitarSpec().getModel() + " " + g.getGuitarSpec().getType() + " guitar:\n   "
						+ g.getGuitarSpec().getbackwood() + " back and sides,\n   " + g.getGuitarSpec().getTopwood()
						+ " top.\nYou can have it for only $" + g.getPrice() + "!");
			}
		} else {
			System.out.println("Sorry, Erin, we have nothing for you.");
		}
	
	}
	/*
	 * Find the guitar with the given search price
	 */
	public static void SearchPrice() 
	{
		
		Guitar price = new Guitar(); // Guitar object
		price.setPrice(1499.95); // set price for guitar
		List<Guitar> MatchGuitar = new LinkedList<>();
		MatchGuitar = inventory.priceComp(price);// Passing guitar object after setting price
		if(MatchGuitar!=null)
		{
			for (Iterator i = MatchGuitar.iterator(); i.hasNext();) {
				Guitar g = (Guitar) i.next();
				System.out.println("Erin, you might like this " + g.getGuitarSpec().getManufacturer() + " "
						
						+ g.getGuitarSpec().getbackwood() + " back and sides,\n   " + g.getGuitarSpec().getTopwood()
						+ " top.\nYou can have it for only $" + g.getPrice() + "!");
				
			
				
		}}
		else
		{
			System.out.println("Sorry, Erin, we have nothing for you.");
		}

	}

	/*
	 * @param inventory object it intializes all the guitars below.
	 * 
	 */

	private static void initializeInventory(Inventory inventory) {
		inventory.addGuitar("11277", 3999.95,
				new GuitarSpec(Manufacturer.Collings, "CJ", Type.Acoustic, Wood.IndianRosewood, Wood.Sitka)); // adding
																												// guitar
																												// with
																												// enums
		inventory.addGuitar("V95693", 1499.95,
				new GuitarSpec(Manufacturer.Fender, "Stratocaster", Type.Electric, Wood.Alder, Wood.Alder));
		inventory.addGuitar("V95123", 1549.95,
				new GuitarSpec(Manufacturer.Fender, "Stratocaster", Type.Electric, Wood.Alder, Wood.Alder));
		inventory.addGuitar("122784", 5495.95,
				new GuitarSpec(Manufacturer.Martin, "D-18", Type.Acoustic, Wood.Mahogany, Wood.Adirondack));
		inventory.addGuitar("76531", 6295.95,
				new GuitarSpec(Manufacturer.Martin, "OM-28", Type.Acoustic, Wood.IndianRosewood, Wood.Adirondack));
		inventory.addGuitar("70108276", 2295.95,
				new GuitarSpec(Manufacturer.Gibson, "Les Paul", Type.Electric, Wood.Mahogany, Wood.Maple));
		inventory.addGuitar("82765501", 1890.95,
				new GuitarSpec(Manufacturer.Gibson, "SG '61 Reissue", Type.Electric, Wood.Mahogany, Wood.Mahogany));
		inventory.addGuitar("77023", 6275.95,
				new GuitarSpec(Manufacturer.Martin, "D-28", Type.Acoustic, Wood.BrazilianRosewood, Wood.Adirondack));

		inventory.addGuitar("1092", 12995.95,
				new GuitarSpec(Manufacturer.Olson, "SJ", Type.Acoustic, Wood.IndianRosewood, Wood.Cedar));
		inventory.addGuitar("566-62", 8999.95,
				new GuitarSpec(Manufacturer.Ryan, "Cathedral", Type.Acoustic, Wood.Cocobolo, Wood.Cedar));
		inventory.addGuitar("6 2958", 2100.95,
				new GuitarSpec(Manufacturer.PRS, "Dave Navarro Signature", Type.Electric, Wood.Mahogany, Wood.Maple));

	}
}
