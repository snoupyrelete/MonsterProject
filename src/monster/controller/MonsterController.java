package monster.controller;

import monster.model.MarshmallowMonster;

public class MonsterController
{
	private MarshmallowMonster firstMonster;
	
	public MonsterController()
	{
		firstMonster = new MarshmallowMonster("Dave", 329.87, false, 12, 9, 1);
	}
	
	public void start() // Methods
	{
		 System.out.println(firstMonster.getHairCount());
		 if(firstMonster.getEyeCount() == 1)
		 {
			 System.out.println("My monster is a cyclops!");
		 }
	}
	
}
