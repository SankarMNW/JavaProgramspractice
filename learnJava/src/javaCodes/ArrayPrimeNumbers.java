package javaCodes;

public class ArrayPrimeNumbers {
	
	public static void main(String[] args) {
		int num[] = {10,20,12,41,23,11,89,69};
		int numbers = 0;
		
		for(int i=0; i<=num.length-1; i++) {
			numbers = num[i];
			boolean primeNumber = false;
			for (int j = 2; j <numbers; j++) {
				if (numbers%j==0) {
					System.out.println("given number is not prime "+numbers);
					primeNumber=true;
					break;
				}
				
				
			}
			 if (primeNumber==false) {
				System.out.println("given number is prime "+numbers);
			}


	}
	}

}
