package basic.ocean.A_threadpool.facotory;

public class Main {
	
	public static void main(String args[]){
		
		Main m = new Main();
		int a = 10;
        ThreadFactory.getDefaultNormalPool().execute(m, "print", a,"ÄãºÃ£¬ÊÀ½ç£¡");

	}
	public void print(Integer a,String str){
		System.out.println("hello world!!! Integer "+a+str);
	}

}
