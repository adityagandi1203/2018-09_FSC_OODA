/* Class		 : Object-Oriented Design and Analysis
* Professor  : Orlando Montalvo
* Assignment : HW 2
* Students	 : Aditya(@01392300)
* 			   Nikhil(@01392295)
*			   Raghunandan(@01390645 )
*/
package HW1.edu.fitchburgstate.csc7400;
/*This class store some values of the  manufacturer */
public enum Manufacturer {

	Fender,
	Martin,
	Gibson,
	Collings,
	Olson,
	Ryan,
	PRS;
	/*return the enum  values*/
	public String toString()
	{
		switch(this)
		{
		case Fender:
			return "Fender";
		case Martin:
			return "Martin";
		case Gibson:
			return "Gibson";
		case Collings:
			return "Collings";
		case Olson:
			return "Olson";
		case Ryan:
			return "Ryan";
		case PRS:
			return "PRS";
		default: throw new IllegalArgumentException();
					
		
		
		}
	}
}
