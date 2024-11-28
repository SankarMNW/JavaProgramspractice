package javaCodes;

import java.util.Iterator;
import java.util.Scanner;

public class JavaPatterns {
	
	public void rightPattern(int n) {
		for(int i=1; i<=n; i++) {  // Rows
			for(int j=1; j<=i; j++) {  // Columns
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void leftPattern(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=2*(n-i); j>=0; j--) {
				System.out.print(" ");
			}			
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
	}
	
	public static void main(String args[]) {
		
//		 Creating Object for class
		JavaPatterns obj = new JavaPatterns();
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the No of Rows: ");
		int n = scan.nextInt();
		
//		obj.rightPattern(n);
		obj.leftPattern(n);
		
		
	}

}
