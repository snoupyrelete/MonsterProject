package monster.model;

public class MarshmallowMonster
{
	private String name;
	private double hairCount;
	private boolean hasBellyButton; 
	private int noseCount; 
	private int armCount; 
	private int eyeCount;
	
	public MarshmallowMonster() // Default constructor, could delete this, it's not necessary.
	{
		this.name = "Urnmu G'uk"; // plate
		this.hairCount = 2.2; // pretzel
		this.hasBellyButton = false; // n/a
		this.noseCount = -29292; // mike n ike
		this.armCount = 100; // licorice 
		this.eyeCount = -2299; // m n m
	}
	
	public MarshmallowMonster(String name, double hairCount, boolean hasBellyButton, int noseCount, int armCount, int eyeCount)
	{
		this.name = name;
		this.hairCount = hairCount;
		this.hasBellyButton = hasBellyButton;
		this.noseCount = noseCount;
		this.armCount= armCount;
		this.eyeCount = eyeCount;
	}
	
	// Override java's toString() 
	public String toString() // Return type of string
	{
		String description = "My monster's name is " + this.name;
		
		return description;
	}
	
	//  GETTERS
	public String getName()
	{
		return name;
	}
	public double getHairCount()
	{
		return hairCount;
	}
	public boolean getHasBellyButton() 
	{
		return hasBellyButton;
	}
	public int getNoseCount()
	{
		return noseCount;
	}
	public int getArmCount()
	{
		return armCount;
	}
	public int getEyeCount()
	{
		return eyeCount;
	}
	// SETTERS 
	public void setName(String name)
	 {
		this.name = name;
	 }
	public void setHairCount(double hairCount)
	{
		this.hairCount = hairCount;
	}
	public void setHasBellyButton(boolean hasBellyButton)
	{
		this.hasBellyButton = hasBellyButton;
	}
	public void setNoseCount(int noseCount)
	{
		this.noseCount = noseCount;
	}
	public void setArmCount(int noseCount)
	{
		this.noseCount = noseCount;
	}
	public void setEyeCount(int eyeCount)
	{
		this.eyeCount = eyeCount;
	}
}


