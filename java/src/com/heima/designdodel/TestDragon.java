package com.heima.designdodel;

public class TestDragon {

	public static void main(String[] args) {
		GiantDragon g1 = GiantDragon.getLover();
		GiantDragon g2 = GiantDragon.getLover();
		GiantDragon g3 = GiantDragon.getLover();

		// 都是同一个对象
		System.out.println(g1 == g2);
		System.out.println(g1 == g3);
		// TODO Auto-generated method stub

	}

}
