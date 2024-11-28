package javaPrograms;


// Inheritance
class Calculation {
	int z;
	public void addition(int a, int b) {
		z = a+b;
		System.out.println("Addition of A&B: "+z);
	}
	
	public void substraction(int a, int b) {
		z = a-b;
		System.out.println("Substraction of A&B: "+z);
	}
}

class My_Calculation extends Calculation{
	public void multiplication(int a, int b) {
		z = a*b;
		System.out.println("Multiplication of A&B: "+z);
	}
}


public class JavaInheritance {

	public static void main(String[] args) {
		JavaInheritance jI = new JavaInheritance();
		My_Calculation obj = new My_Calculation();
		int a=30 , b=20;
		obj.addition(a, b);
		obj.substraction(a, b);
		obj.multiplication(a, b);
		
		System.out.println(obj instanceof Calculation);

	}

}
