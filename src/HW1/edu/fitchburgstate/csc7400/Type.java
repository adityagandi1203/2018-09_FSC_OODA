/* Class		 : Object-Oriented Design and Analysis
* Professor  : Orlando Montalvo
* Assignment : HW 2
* Students	 : Aditya(@01392300)
* 			   Nikhil(@01392295)
*			   Raghunandan(@01390645 )
*/
package HW1.edu.fitchburgstate.csc7400;

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
