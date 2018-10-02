package HW2;
/**
 * @subject:OOAD
 * @author:orlando
 * @version:1.1
 * 01392300 Aditya
 * @01392295 Nikhil
 * @01390645 Raghunandan
 */


import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class Inventory {
  private List<Guitar> guitars = new LinkedList<Guitar>();
  
  public void addGuitar(String serialNumber, double price,GuitarSpec g)//add new guitar to list with serial num,price and guitar spec 
  			{
	  				Guitar guitar = new Guitar(serialNumber, price, g);
	  					guitars.add(guitar);
  			}
  public Guitar getGuitar(String serialNumber) {
    for (Iterator i = guitars.iterator(); i.hasNext(); ) {
      Guitar guitar = (Guitar)i.next();
      if (guitar.getSerialNumber().equals(serialNumber)) {
        return guitar;
      }
    }
    return null;
  }
  
	  public List<Guitar> search(Guitar searchGuitar) {
			List<Guitar> guitarsList = new LinkedList(); 
			
			for (Iterator i = guitars.iterator(); i.hasNext();) {
				Guitar guitar = (Guitar) i.next();
				
				if (guitar.getGuitarSpec().Match(searchGuitar.getGuitarSpec())) //checks the spec
				{
					guitarsList.add(guitar);
				}

				
				if (guitar.getPrice() == searchGuitar.getPrice()) //checks the price
				{
					guitarsList.add(guitar);
				}
			}
			return guitarsList;
    
  }
}
