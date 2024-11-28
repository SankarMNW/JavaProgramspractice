package javaArrayPrograms;

public class FindLargestFromArray {

	public static void main(String[] args) {

		int[] a = {10005,95,1,12,74,25,10006,964,10};
		int b = a[0];
		
		for(int i=0; i<a.length; i++) {
			// if give (a[i]<b) find lowest value in array
			if(a[i]>b) {
				b = a[i];
			}
		}
		
		System.out.println(b);
	}

}
