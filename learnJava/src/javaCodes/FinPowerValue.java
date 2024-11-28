package javaCodes;

public class FinPowerValue {
	
	public static void main(String[] args) {
		int value = 5;
		int power = 3;
		int result = 1;
		for(int i=1; i<=power; i++) {
			result *= value;
		}
		
		System.out.println(result);
	}

}
