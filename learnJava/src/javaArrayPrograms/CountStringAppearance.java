package javaArrayPrograms;

import java.util.HashMap;

public class CountStringAppearance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] fruits = {"Apple","Orange","Apple","Banana","Orange","Orange","Grapes","Banana"};
		int len = fruits.length;
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		for(int i=0; i<len; i++) {
			int count=0;
			for(int j=0; j<len; j++) {
				if(fruits[i].contains(fruits[j])) {
					count++;
					map.put(fruits[i], count);
				}
			}
		}
		System.out.println(map);
	}

}
