package HW1;
/**
 * @subject:OOAD
 * @author:orlando
 * @version:1.1
 * 01392300 Aditya
 * @01392295 Nikhil
 * @01390645 Raghunandan
 */

import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class InventoryTestAss2 

{
	
	
	@BeforeEach
	void setUp() throws Exception 
	{
		
	}
	

	@Test
	public void addTest()
	{
		//first we declare GuitarSpec and we add it to inventory
		GuitarSpec g = new GuitarSpec(Manufacturer.Fender, "Stratocaster", Type.Electric,
				Wood.Alder, Wood.Alder);
		Inventory i=new Inventory();
		i.addGuitar("V95693", 1499.95,g);
		
		Guitar g1=i.getGuitar("V95693");
		assertEquals(1499.95,g1.getPrice());//checking the price of so guitar is sucessfully added
		
	}
	@Test
	public void getGuitar()
	{
		GuitarSpec g = new GuitarSpec(Manufacturer.Fender, "Stratocaster", Type.Electric,
				Wood.Alder, Wood.Alder);
		Inventory i=new Inventory();
		i.addGuitar("V95693", 1499.95,g);
		GuitarSpec g1 = new GuitarSpec(Manufacturer.Olson, "SJ", Type.Acoustic,
				Wood.IndianRosewood, Wood.Cedar);
		i.addGuitar("1092",12995.95,g1);
		
		Guitar g2=i.getGuitar("1092");
		Guitar g3=i.getGuitar("V95693");
		assertEquals("V95693",g3.getSerialNumber());
		assertEquals("1092",g2.getSerialNumber());//getting right guitar
		
		
	}
	@Test
	public void searchGuitar()
	{
		Inventory i=new Inventory();
		GuitarSpec g = new GuitarSpec(Manufacturer.Gibson, "Les Paul", Type.Electric,
					Wood.Mahogany, Wood.Maple);
		
		i.addGuitar("70108276", 2295.95,g);
		
		Guitar search=new Guitar("70108276", 2295.95,g);
		List<Guitar> lis=i.search(search);
	
		assertEquals(2,lis.size());//we compared and serched and should get size as 2
	    
		
	}
	
	
	
}
