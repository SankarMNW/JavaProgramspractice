package javaArrayPrograms;

public class OneTimeAppeaInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Write a code find the element in Only one time appear in an array
		
		int arr[] = {3,5,1,5,1,3,2};
		int length = arr.length;
		int output = 0;
		
		for(int i=0; i<length; i++) {
			boolean flag = false;
			for(int j=0; j<length; j++) {
				if(i==j) {
					continue;
				}else if (arr[i]==arr[j]) {
					flag = true;
				}
			}
			if(flag == false) {
				output = arr[i];
			}
		}
		
		System.out.println("One time Appear value: "+output);

	}

}
