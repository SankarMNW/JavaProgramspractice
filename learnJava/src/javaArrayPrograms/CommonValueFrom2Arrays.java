package javaArrayPrograms;

import java.util.ArrayList;
import java.util.List;

public class CommonValueFrom2Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 5, 6, 3, 8};
        
        List<Integer> common = new ArrayList<Integer>();
        
        for(int i=0; i<arr1.length; i++) {
        	for(int j=0; j<arr2.length; j++) {
        		if(arr1[i] == arr2[j]) {
        			common.add(arr1[i]);
        		}
        	}
        }
        
        System.out.println(common);
	}

}
