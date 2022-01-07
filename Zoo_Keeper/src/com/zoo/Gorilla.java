package com.zoo;

public class Gorilla extends Mammal {
	public Gorilla(int energyLevel) {
		super(energyLevel);
	}
	public int throwSomething() {
	System.out.println("Time to throw something!");
	return energyLevel -= 5;
	}
	
	public int eatBananas() {
	System.out.println("Time to eat yellow thing!");
	return energyLevel += 10;
	}
		
	public int climb() {
	System.out.println("Time to use hands and feet to get high!");
	return energyLevel -= 10;
	}
}
