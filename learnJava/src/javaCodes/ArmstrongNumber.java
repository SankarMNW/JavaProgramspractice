package javaCodes;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
//		System.out.println("Armstrong Number........");
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int num = scan.nextInt();
		
		int sum=0, reminder, digit = 0;
		int temp;
		
		// Assign the num value in temp variable
		temp=num;
		
		// find how many digits are available in given number
		while(temp>0) {
			temp = temp/10;
			digit++;
		}		
		System.out.println("No.of Digits:"+digit);
		
		// Reassign the num value in temp variable
		temp=num;
		while(temp>0) {
			reminder = temp%10;
			sum += Math.pow(reminder, digit);
			temp = temp/10;
		}
		
		if(num == sum)
            System.out.println(num + " is an Armstrong number.");
        else
            System.out.println(num + " is not an Armstrong number.");
	}

}
