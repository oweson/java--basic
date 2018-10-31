package javas;


public class Cat {
	private int age;
	private String name;
	private static Dog dog;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Dog getDog() {
		return dog;
	}

	public void setDog(Dog dog) {
		this.dog = dog;
	}

	public static void main(String[] args) {
		System.out.println();
		Cat cat = new Cat();
		cat.setDog(new Dog());
		dog.aa();
		
		
		// TODO Auto-generated method stub

	}

}
