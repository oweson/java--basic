package StaticSingleClasss;

import com.heima.designdodel.StaticSingleClasss;

public class TestStaticClass {
	public static void main(String[] args) {
		StaticSingleClasss a = StaticSingleClasss.getsInstance();
		StaticSingleClasss aa = StaticSingleClasss.getsInstance();
		System.out.println(a==aa);
	}

}
