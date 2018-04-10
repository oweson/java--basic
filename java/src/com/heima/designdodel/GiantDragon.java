package com.heima.designdodel;

public class GiantDragon {
	private GiantDragon() {
	}

	public static GiantDragon g;

	// 1llay加载；
	// 进行同步
	public static synchronized GiantDragon getLover() {
		if (g == null) {
			synchronized (GiantDragon.class) {
				if (g == null) {

					g = new GiantDragon();

				}
				// 2为了安全进行双重加锁

			}
		}
		return g;
	}
}
