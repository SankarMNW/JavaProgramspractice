package javaCodes;

import java.util.Scanner;

public class TestProgram {
	
//	To Reverse the given String
	public static void main(String args[]) {
		
	int row = 6;
	
	// Outer loop for rows
	for(int i=1; i<=row; i++) {
		// inner loop for space
		for(int j=row-i; j>=0; j--) {
			System.out.print(" ");
		}
		// inner loop for columns
		for(int j=1; j<=i; j++) {
			System.out.print("* ");
		}
		System.out.println();
	}

		
		
		
		
		
	}

}
