package other;

public class Person {
	protected String name;
	protected int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String showInfo() {
		return name + " (" + age + "��)";
	}
	
	public String getName() {
		return name;
	}
}
