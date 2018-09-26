package HW1;
/**
 * @subject:OOAD
 * @author:orlando
 * @version:1.1
 * 01392300 Aditya
 * @01392295 Nikhil
 * @01390645 Raghunandan
 */


public enum Manufacturer {

	Fender,
	Martin,
	Gibson,
	Collings,
	Olson,
	Ryan,
	PRS;
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
