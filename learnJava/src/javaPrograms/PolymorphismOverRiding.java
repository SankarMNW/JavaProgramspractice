package javaPrograms;

class Animal {
	public void displayInfo() {
		System.out.println("Print Animal Class method");
	}
}

class Dog extends Animal{
	public void displayInfo() {
		// if you access the superclass method using "super" Keyword
		super.displayInfo();
		System.out.println("Print Dog class method");
	}
}

class Goat extends Dog{
	public void displayInfo() {
		System.out.println("Print Goat class method");
	}
}

public class PolymorphismOverRiding {
	
	public static void main(String args[]) {
		Goat obj = new Goat();
		obj.displayInfo();
	}
}
