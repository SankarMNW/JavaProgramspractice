package javaCodes;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		System.out.println("Fibonacci Series........");
		
		int n1=0, n2=1, n3;
		System.out.print(n1+ " "+ n2);
		
		// Loop start with 2 because 0 and 1 are already given in variable
		for(int i=2; i<10; i++) {
			n3 = n1+n2;
			System.out.print(" "+n3);
			n1 = n2;
			n2 = n3;
		}
	}

}
