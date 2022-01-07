package com.zoo;

public class Bat extends Mammal{
	public Bat(int energyLevel) {
		super(energyLevel);
	}
	public int fly() {
		System.out.println("FWOOM!");
		return energyLevel -= 50;
		}
		
		public int eatHumans() {
		System.out.println("BAAAAHHHHHHHHHH!");
		return energyLevel += 25;
		}
			
		public int attackTown() {
		System.out.println("*people screaming for joy that their marshmallows are toasted");
		return energyLevel -= 100;
		}
}