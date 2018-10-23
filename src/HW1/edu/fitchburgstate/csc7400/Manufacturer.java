package HW1.edu.fitchburgstate.csc7400;
/* @subject:OOAD
* @author:orlando
* @version:1.1
* Students:@1392300 Aditya
* 			@01392295 Nikhil
* 			@01390645 Raghunandan
*/
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
