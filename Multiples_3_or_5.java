package project_Euler;

public class Multiples_3_or_5 {

	public static void main(String[] args) {

		int multiples = 0;
		
		for (int i = 0; i<1000; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				System.out.println(i);
				multiples += i;
			}
		}
		System.out.println(multiples);
	}

}
