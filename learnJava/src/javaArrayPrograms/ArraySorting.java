package javaArrayPrograms;

class ArraySortingWays{
	
	public void ArraySelectionSort(int[] arr) {
		int temp = 0;
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]>arr[j]) {
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}				
			}
		}
		System.out.print("Selection Sort: ");
		for(int k=0; k<arr.length; k++) {
			System.out.print(arr[k]+ " ");
		}
		
		System.out.println("");
	}
	
	public void ArrayBubbleSort(int[] arr) {
		int temp=0;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length-1; j++) {  // Use length-1 because we need to check arr[j+1].
				if(arr[j]>arr[j+1]) {
					temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.print("Bubble Sort: ");
		for(int k=0; k<arr.length; k++) {
			System.out.print(arr[k]+" ");
		}
	}
	
}


public class ArraySorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {89,25,9,74,99,36,45,12,18};
		ArraySortingWays sort = new ArraySortingWays();
		sort.ArraySelectionSort(a);
		sort.ArrayBubbleSort(a);
	}

}
