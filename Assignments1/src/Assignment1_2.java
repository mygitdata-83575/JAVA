//Accept 2 double values from User (using Scanner). Check data type. If arguments are not
//doubles, supply suitable error message & terminate.
//If numbers are double values, print its average.
//Hint : Check Scanner class for the methods

import java.util.Scanner;

public class Assignment1_2 {
	public static void main(String[] args) {
		double n1 = 0;
		double n2 = 0;
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a first number");
		if(sc.hasNextDouble()) {
			n1 = sc.nextDouble();
			System.out.println("First value is : "+n1);
			
		}
		else {
			System.out.println("Enter a valid number");
			return;
		}
		System.out.println("Enter a second number");
		if(sc.hasNextDouble()) {
			n2 = sc.nextDouble();
			System.out.println("Second value is : "+n2);
		}
		else {
			System.out.println("Enter a valid number");
		}
		double avg = (n1+n2)/2;
		System.out.println("Avg of numbers : "+avg);
	}

}
