package demo;

public class Person {
	private int age ;
	
	public Person(int age) {
		this.age = age;
	}
	
	public void tellAge () {
		System.out.println("My age is " + this.age);
	}
}
