/**
 * 
 */
package basic.array;


class MultiDimArrayDemo {
	/**
	 * 1 二维数组
	 * @param args
	 */
	public static void main(String[] args) {
		String[][] names = { { "Mr. ", "Mrs. ", "Ms. " }, { "Smith", "Jones" } };
		// Mr. Smith
		System.out.println(names[0][0] + names[1][0]);
		// Ms. Jones
		System.out.println(names[0][2] + names[1][1]);
	}
}