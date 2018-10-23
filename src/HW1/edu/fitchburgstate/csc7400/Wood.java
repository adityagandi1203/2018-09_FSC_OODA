package HW1.edu.fitchburgstate.csc7400;
/* @subject:OOAD
* @author:orlando
* @version:1.1
* Students:@1392300 Aditya
* 			@01392295 Nikhil
* 			@01390645 Raghunandan
*/
/*this class return the type of wood this is a common enum for topwood and backwood*/

public enum Wood {
	
	IndianRosewood,
	BrazilianRosewood,
	Mahogany,
	Maple,
	Cocobolo,
	Cedar,
	Adirondack,
	Alder,
	Sitka;
	public String toString()/*override tostring to return the wood type*/
	{
		switch(this)
		{
		case IndianRosewood:
			return "Indian Rosewood";
		case BrazilianRosewood:
			return "Brazilian Rosewood";
		case Mahogany:
			return "Mahogany";
		case Maple:
			return "Maple";
		case Cocobolo:
			return "Cocobolo";
		case Cedar:
			return "Cedar";
		case Adirondack:
			return "Adirondack";
		case Alder:
			return "Alder";
		case Sitka:
			return "Sitka";
		default:throw new IllegalArgumentException();
			
			
		
		}
		
	}
	
	
	

}
