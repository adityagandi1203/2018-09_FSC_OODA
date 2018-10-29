/* Class		 : Object-Oriented Design and Analysis
* Professor  : Orlando Montalvo
* Assignment : HW 2
* Students	 : Aditya(@01392300)
* 	           Nikhil(@01392295)
*		   Raghunandan(@01390645 )
*/
package HW1.edu.fitchburgstate.csc7400;
/*This class contain the information of ricks store guitar class contain guitar spec object which contain this class information,
 * 
 *  */

public class GuitarSpec
{
	private String model;
	
	private Manufacturer manufacturer; 
	private Type type;
	private Wood backwood;
	private Wood topwood;
	public GuitarSpec(Manufacturer manufacturer,String model, Type type,Wood backwood,Wood topwood)
	{
		this.manufacturer=manufacturer;
		this.type=type;
		this.backwood=backwood;
		this.topwood=topwood;
		this.model=model;
		
	}
	/*this method return each guitar with searched guitar guitar*/
	
	public Boolean Match(GuitarSpec g)
	{
		return((this.manufacturer==g.manufacturer)||(this.type==g.type)||(this.backwood==g.backwood)||(this.topwood==g.topwood)||(this.model.toLowerCase().equals(g.model.toLowerCase())));
		
		
		
	}
	/*returns the manufacturer*/
	public Manufacturer getManufacturer()
	{
		return manufacturer;
		
	}
	/*returns the type*/
	public Type getType()
	{
		return type;
		
	}
	/*return backwood*/
	public Wood getbackwood()
	{
		return backwood;
		
	}
	/*return topwood*/
	public Wood getTopwood()
	{
		return topwood;
		
	}
	/*return model*/
	public String getModel()
	{
		return model;
		
	}
	/*sets the model 
	 * @param model string value*/
	public void setModel(String model)
	
	{
		this.model=model;
	}
	/*sets the type 
	 * @param enum type value*/
	public void setType(Type type)
	{
		this.type=type;
	}
	/*sets the topwood 
	 * @param enum wood value*/
	public void setTopwood(Wood topwood)
	{
		this.topwood=topwood;
	}
	/*sets the backwood 
	 * @param enum wood value*/
	public void setBackwood(Wood backwood)
	{
		
		this.backwood=backwood;
	}

}
