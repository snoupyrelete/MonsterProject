package monster.controller;

import monster.model.MarshmallowMonster;
import java.util.Scanner;

public class MonsterController
{
	private MarshmallowMonster firstMonster;
	private Scanner keyboardInput;
	
	public MonsterController()
	{
		// Call to constructor with keyword "new"
		firstMonster = new MarshmallowMonster("Ongaflokonas", 329.87, false, 12, 9, 1);
		keyboardInput = new Scanner(System.in);
	}
	
	public void start() // Methods
	{
		// Using Getters (usually .getSomeVariable)
		System.out.println(firstMonster.getHairCount());
//		 if (firstMonster.getEyeCount() == 1)
//		 {
//			 System.out.println("My monster is a cyclops!");
//		 }
		 firstMonster.setHairCount(11.2);
		 System.out.println(firstMonster.getHairCount());
		 System.out.println("Greetings earthling, would you like to give me a human name, to better blend in and overtake your race?");
		 String answer = keyboardInput.nextLine();
		 
		 if (answer.equalsIgnoreCase("yes"))
		 {
			 System.out.println("What shall I be called, earthling?");
			 String newName = keyboardInput.nextLine();
			 firstMonster.setName(newName);
			 System.out.println(firstMonster); // Implicitly called by toString
		 } 
		 else
		 {
			 System.out.println("Fine, I'll take over the world anyways!");
			 while (true);
			 {
				 System.out.println("x");
			 }
		 } 
	}
}
