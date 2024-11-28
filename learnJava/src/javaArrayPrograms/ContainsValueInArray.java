package javaArrayPrograms;

public class ContainsValueInArray {

	public static void main(String[] args) {
		int[] arr = {3,5,2,6,7,8,9};
		boolean flag = false;
		int findValue = 5;
		for(int n:arr) {
			if(n == findValue) {
				flag = true;
			}
		}
		
		if(flag) {
			System.out.println("is Found");
		}else {
			System.out.println("is not Found");
		}
	}
}
