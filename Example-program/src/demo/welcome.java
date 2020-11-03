package demo;

public class welcome {

	public static void main(String[] args) {
		System.out.println("HOla");
		demostrateArrays();
		
		
		
	}
	
	public static void demostrateArrays() {
		Person p1 = new Person( 7 );		
		p1.tellAge();
		
		
		Person[]  classmates =  new Person[4];
		
		int[] myInts = new int[6];
		
		classmates[0] = new Person(4);
		classmates[2] = new Person(6);
		classmates[1] = new Person(8);
		classmates[3] = new Person(7);
		
	}
	
	

}
