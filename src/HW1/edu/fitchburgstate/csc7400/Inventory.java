/* Class		 : Object-Oriented Design and Analysis
* Professor  : Orlando Montalvo
* Assignment : HW 2
* Students	 : Aditya(@01392300)
* 		   Nikhil(@01392295)
*		   Raghunandan(@01390645 )
*/
package HW1.edu.fitchburgstate.csc7400;
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
  /*provides the list of the matched guitar by comparing arguments in guitarsepc
   * @Param guitarspec object
   * 
   * */
	  public List<Guitar> search(GuitarSpec search) 
	  {
			List<Guitar> guitarslist = new LinkedList(); 
			for  (Iterator<Guitar> i = guitars.iterator(); i.hasNext(); ) 
		    {
			      Guitar guitar = (Guitar)i.next();
			      GuitarSpec guitarspec = guitar.getGuitarSpec();
			 
			      if(search.Match(guitarspec)) 
			      {
			    	  	guitarslist.add(guitar);   //If matched, guitar is added to the list
			      }
			    }
			    return guitarslist;
			
    
  }
	  /*For returning the guitar based on the price we need this method which compares the price of a guitar
	   * @param guitar object
	   * */
	 
	  public List<Guitar> priceComp(Guitar guitar) 
	  {
	  	  List<Guitar> Price = new LinkedList<Guitar>();
	    for (Iterator<Guitar> i = guitars.iterator(); i.hasNext(); ) 
	    {
	      Guitar guitar1 = (Guitar)i.next();
	      int Result = Double.compare(guitar.getPrice(),guitar1.getPrice()); 
	      if (Result == 0)             
	      {
	      	Price.add(guitar1);    
	      }
	    }
	    return Price;
	  }
	  
}
