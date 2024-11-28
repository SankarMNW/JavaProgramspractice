package javaPrograms;

// Compile time Polymorphism - Method Overloading
public class PolymorphismOverLoading {
	
	public int addition(int a, int b) {
		return a+b;
	}
	
	public int addition(int a, int b, int c) {
		return a+b+c;
	}
	
	public double addition(double a, double b) {
		return a+b;
	}

	public static void main(String args[]) {
		 PolymorphismOverLoading obj = new PolymorphismOverLoading();
		 System.out.println(obj.addition(5, 10));
		 System.out.println(obj.addition(5, 10, 20));
		 System.out.println(obj.addition(12.5, 10.6));
		 
	}
	

	

	
	
	
}
