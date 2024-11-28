package javaCodes;

import java.util.Scanner;

public class PrimeNoOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int num = scan.nextInt();
		boolean flag = false;
		
		if(num==0 || num==1) {
			flag = true;
		}
		
		for(int i=2; i<=num/2; i++) {
			if(num%i==0) {
				flag = true;
				break;
			}
		}
		
		if (flag == false) {
			System.out.println(num+" is a prime number");
		}else {
			System.out.println(num+" is not a prime number");
		}
	}

}
