package javaCodes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		
		int num = 32287679;
		int digit = 0;
		
		int value=0;

		String numOfStr = String.valueOf(num);
		
		for(int j=0; j<numOfStr.length(); j++) {
			char a = numOfStr.charAt(j);
			int n = Character.getNumericValue(a);
			if(n>value) {
				value = n;
			}
		}
		
		System.out.println(value);
		
	}
}
