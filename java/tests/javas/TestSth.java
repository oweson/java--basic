package javas;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.omg.CORBA.PUBLIC_MEMBER;


public class TestSth {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("boforeclass");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("afterclass");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("bofore");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("after");
	}

	@Test
	public void test() {
		System.out.println("just for test");
		//fail("Not yet implemented");
	}
	/*@Test(timeout=2000)
	public void a(){
		while(true){
			System.out.println(1);
		}
		
	}*/
	@Test
	public void aa(){}

}
