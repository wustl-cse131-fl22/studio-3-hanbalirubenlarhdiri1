package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Input the maximum (non-prime) number (n): ");
		int n = in.nextInt();
		
		//int value;

		int[] values = new int[n];

		
		
		for(int i = 0; i < values.length - 1; i++) 
		{
			values[i] = i + 2;
			System.out.println( values[i] );
		}
		for(int j = 1; j < values.length - 1; j++) 
		{
			values[j] = j + 2;
			if (values[j] % 2 != 0) {
			if (values[j] % 3 != 3)
			{
				System.out.println(values[j]);
			}
			
		}
		
		}
	}

}
//hard code 2,3,5,7 in 
//repeat same steps to find what is divisible