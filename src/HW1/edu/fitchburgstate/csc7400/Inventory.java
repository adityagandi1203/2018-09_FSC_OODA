package HW1.edu.fitchburgstate.csc7400;
/* @subject:OOAD
* @author:orlando
* @version:1.1
* Students:@1392300 Aditya
* 			@01392295 Nikhil
* 			@01390645 Raghunandan
*/
/*Inventory  Class keeps a searchable collection of Guitars. It is meant to be use
 * to find matching guitars for customers. */
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class Inventory {
  private List<Guitar> guitars = new LinkedList<Guitar>();
  /*Provide serialNumber,price, guitar spec to add a guitar
  Adds a new guitar by providing serialNumber,price,builder,model,type,backWood and topWood*/
  
  public void addGuitar(String serialNumber, double price,GuitarSpec g)//add new guitar to list with serial num,price and guitar spec 
  			{
	  				Guitar guitar = new Guitar(serialNumber, price, g);
	  					guitars.add(guitar);
  			}
  /*return the guitar based on the serial number*/
  public Guitar getGuitar(String serialNumber) {
    for (Iterator i = guitars.iterator(); i.hasNext(); ) {
      Guitar guitar = (Guitar)i.next();
      if (guitar.getSerialNumber().equals(serialNumber)) {
        return guitar;
      }
    }
    return null;
  }
  /*provides the list of the matched guitar by comparing guitarspec */
	  public List<Guitar> search(Guitar searchGuitar) 
	  {
			List<Guitar> guitarsList = new LinkedList(); 
			
			for (Iterator i = guitars.iterator(); i.hasNext();) {
				Guitar guitar = (Guitar) i.next();
				
				if (guitar.getGuitarSpec().match(searchGuitar.getGuitarSpec())) //checks the spec
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
