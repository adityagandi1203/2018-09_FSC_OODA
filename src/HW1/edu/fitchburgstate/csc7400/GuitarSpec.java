package HW1.edu.fitchburgstate.csc7400;
/* @subject:OOAD
* @author:orlando
* @version:1.1
* Students:@1392300 Aditya
* 			@01392295 Nikhil
* 			@01390645 Raghunandan
*/
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
	
	public Boolean match(GuitarSpec g)
	{
		return((manufacturer==g.manufacturer)||(type==g.type)||(backwood==g.backwood)||(topwood==g.topwood)||(model.toLowerCase().equals(g.model.toLowerCase())));
		
		
		
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
