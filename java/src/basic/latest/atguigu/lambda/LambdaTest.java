package basic.latest.atguigu.lambda;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class LambdaTest {
	
	List<Employee> emps = Arrays.asList(
			new Employee(101, "张三", 18, 9999.99),
			new Employee(102, "李四", 59, 6666.66),
			new Employee(103, "王五", 28, 3333.33),
			new Employee(104, "赵六", 8, 7777.77),
			new Employee(105, "田七", 38, 5555.55)
	);
	
	@Test
	public void test1(){
		Collections.sort(emps, (e1, e2) -> {
			if(e1.getAge() == e2.getAge()){
					return e1.getName().compareTo(e2.getName());
			}else{
				// 默认是升序，负号在前表示降序，大的上升！
				return -Integer.compare(e1.getAge(), e2.getAge());
			}
		});
		
		for (Employee emp : emps) {
			System.out.println(emp);
		}
	}
	

	

	

	


}
