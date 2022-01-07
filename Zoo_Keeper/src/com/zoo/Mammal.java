package com.zoo;

public class Mammal {
	public int energyLevel;
	public Mammal (int energyLevel) {
		this.energyLevel = energyLevel;
	}
	public int displayEnergy() {
		System.out.println("Energy level" + energyLevel);
		return energyLevel;
	}
}
