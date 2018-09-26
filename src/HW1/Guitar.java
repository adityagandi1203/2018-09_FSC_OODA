package HW1;
/**
 * @subject:OOAD
 * @author:orlando
 * @version:1.1
 * 01392300 Aditya
 * @01392295 Nikhil
 * @01390645 Raghunandan
 */


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
	
	
	public Boolean Match(GuitarSpec g)
	{
		if((manufacturer==g.manufacturer)||(type==g.type)||(backwood==g.backwood)||(topwood==g.topwood)||(model.toLowerCase().equals(g.model.toLowerCase())))
		
		return true;
		else
		return false;
		
	}
	public Manufacturer getManufacturer()
	{
		return manufacturer;
		
	}
	public Type getType()
	{
		return type;
		
	}
	public Wood getbackwood()
	{
		return backwood;
		
	}
	public Wood getTopwood()
	{
		return topwood;
		
	}
	public String getModel()
	{
		return model;
		
	}

}



