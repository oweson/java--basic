package com.heima.designdodel;

public class AnimalFactory {
	public Animal getAnimal(String type) {
		if (type == null) {
			return null;
		}
		if (type.equalsIgnoreCase("bird")) {
			return new Bird();
		} else if (type.equalsIgnoreCase("Ant")) {
			return new Ant();
		}
		return null;
	}

	public Animal getAnimal1(String type) {
		if (type == null) {
			return null;
		}
		if (type.equalsIgnoreCase("bird")) {
			return new Bird();
		} else if (type.equalsIgnoreCase("Ant")) {
			return new Ant();
		}
		return null;
		// TODO Auto-generated method stub
		//return null;
	}



}
