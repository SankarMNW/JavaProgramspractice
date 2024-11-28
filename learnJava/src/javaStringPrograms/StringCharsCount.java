package javaStringPrograms;

import java.util.Scanner;

public class StringCharsCount {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String str = scan.nextLine();
		
		int count=0;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)!=' ') {
				count++;
			}
		}
		
		System.out.println("Given String Chars Count: "+count);
		

	}

}
