package HW1.edu.fitchburgstate.csc7400;
/* @subject:OOAD
* @author:orlando
* @version:1.1
* Students:@1392300 Aditya
* 			@01392295 Nikhil
* 			@01390645 Raghunandan
*/
/*this enum class store the type value*/
public enum Type {
	Electric, Acoustic;
	public String toString()/*overrode to sting to get types*/
	{
		switch(this)
		{
		case Electric:
			return "Electric";
		case Acoustic:
			return "Acoustic";
		default: throw new IllegalArgumentException();
		
		}
	}

}
