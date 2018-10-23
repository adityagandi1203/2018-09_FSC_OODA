package HW1.edu.fitchburgstate.csc7400;
/*
 /* @subject:OOAD
 * @author:orlando
 * @version:1.1
 * Students:@1392300 Aditya
 * 			@01392295 Nikhil
 * 			@01390645 Raghunandan
 */
/*This class interact with guitar spec and inventory to provide best matching guitars*/

import java.util.Iterator;
import java.util.List;


/*This method take the input from customer based on user input it searches the inventory and 
 * get all the matching records and displays to customer */
public class FindGuitarTester {

	public static void main(String[] args) {
		// Set up Rick's guitar inventory
		Inventory inventory = new Inventory();
		initializeInventory(inventory);
		
		GuitarSpec erinspec=new GuitarSpec(Manufacturer.Fender,"Stratocaster",Type.Electric,Wood.Alder,Wood.Alder);
		Guitar whatErinLikes = new Guitar("", 1499.95, erinspec);

		List listguitar=inventory.search(whatErinLikes);

		if (listguitar != null) 
		{
		
			for(Iterator i=listguitar.iterator();i.hasNext();)
			{
				Guitar g=(Guitar)i.next();
				System.out.println("Erin, you might like this " +
						g.getGuitarSpec().getManufacturer() + " " + g.getGuitarSpec().getModel() +  " " +
						g.getGuitarSpec().getType() + " guitar:\n   " +
						g.getGuitarSpec().getbackwood() + " back and sides,\n   " +
						g.getGuitarSpec().getTopwood() + " top.\nYou can have it for only $" +
						g.getPrice() + "!");
			}}
			else 
			{
				System.out.println("Sorry, Erin, we have nothing for you.");
			}
		}
	/*@param inventory object
	 * it intializes all the guitars below.
	 * 
	 * */
	
		

		private static void initializeInventory(Inventory inventory) {
			inventory.addGuitar("11277", 3999.95, new GuitarSpec (Manufacturer.Collings, "CJ", Type.Acoustic,
					Wood.IndianRosewood, Wood.Sitka));																//adding guitar with enums
			inventory.addGuitar("V95693", 1499.95, new GuitarSpec (Manufacturer.Fender, "Stratocaster", Type.Electric,
					Wood.Alder, Wood.Alder));
			inventory.addGuitar("V95123", 1549.95, new GuitarSpec (Manufacturer.Fender, "Stratocaster", Type.Electric,
					Wood.Alder, Wood.Alder));
			inventory.addGuitar("122784", 5495.95, new GuitarSpec (Manufacturer.Martin, "D-18", Type.Acoustic,
					Wood.Mahogany, Wood.Adirondack));
			inventory.addGuitar("76531", 6295.95, new GuitarSpec (Manufacturer.Martin, "OM-28", Type.Acoustic,
					Wood.IndianRosewood, Wood.Adirondack));
			inventory.addGuitar("70108276", 2295.95, new GuitarSpec (Manufacturer.Gibson, "Les Paul", Type.Electric,
					Wood.Mahogany, Wood.Maple));
			inventory.addGuitar("82765501", 1890.95, new GuitarSpec (Manufacturer.Gibson, "SG '61 Reissue", Type.Electric,
					Wood.Mahogany, Wood.Mahogany));
			inventory.addGuitar("77023", 6275.95, new GuitarSpec (Manufacturer.Martin, "D-28", Type.Acoustic,
					Wood.BrazilianRosewood, Wood.Adirondack));

			inventory.addGuitar("1092",12995.95, new GuitarSpec (Manufacturer.Olson, "SJ", Type.Acoustic,
					Wood.IndianRosewood, Wood.Cedar));
			inventory.addGuitar("566-62",8999.95, new GuitarSpec (Manufacturer.Ryan, "Cathedral", Type.Acoustic,
					Wood.Cocobolo, Wood.Cedar));
			inventory.addGuitar("6 2958",2100.95, new GuitarSpec (Manufacturer.PRS, "Dave Navarro Signature", Type.Electric,
					Wood.Mahogany, Wood.Maple));

		}
	}
