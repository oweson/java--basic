package basic.river.exceptiontest;

public class Demo1Exception {
	public static void demo1(String name,int age){
		if(name==null && name.length()<=0){
			throw new RuntimeException("name is null");
		}
		else{
			if(age>0){
				System.out.println("haha is correct"+ Demo3ShopStateEnum.CHECK.toString());
			}
		}
		
	}
	public static void main(String[] args) {
		demo1(" ", 1);
	}

}
