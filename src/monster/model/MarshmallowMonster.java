package monster.model;

public class MarshmallowMonster
{
	private String name;
	private double hairCount;
	private boolean hasBellyButton; 
	private int noseCount; 
	private int armCount; 
	private int eyeCount;
	
	
	
	public MarshmallowMonster()
	{
		this.name = "Urnmu G'uk"; // plate
		this.hairCount = 2.2; // pretzel
		this.hasBellyButton = false; // n/a
		this.noseCount = 1; // mike n ike
		this.armCount = 3; // licorice 
		this.eyeCount = 4; // m n m
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
}

/* 1 arm,
 *  2 noses,
 *  2.3 hair, 
 *  1 eye, 
 *  named Urnmu G'uk, 
 *  no belly button
 */
