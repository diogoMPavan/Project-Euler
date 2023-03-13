package project_Euler;

public class Even_Fibonacci {

	public static void main(String[] args) {

		int sum=0;
		
		int[] fib = new int[34];
		
		fib[0] = 0;
		fib[1] = 1;
		
		for (int i = 2; i < 34; i++) {
			fib[i] = fib[i-2] + fib[i-1];
			if (fib[i] % 2 == 0) {
				sum+= fib[i];
			}
		}
		System.out.println(sum);
		
	}

}
