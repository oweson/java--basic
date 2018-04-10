package com.heima.designdodel;

public class GiantDragon {
	private GiantDragon() {
	}

	public static GiantDragon g = new GiantDragon();

	public static GiantDragon getLover() {
		return g;
	}

	

}
