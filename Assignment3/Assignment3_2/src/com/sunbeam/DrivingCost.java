/*Q2. Create an application that calculates your daily driving cost, so that you can estimate how much
money could be saved by car pooling, which also has other advantages such as reducing carbon
emissions and reducing traffic congestion. The application should input the following information
and display the user’s cost per day of driving to work:
a) Total miles driven per day.
b) Cost per gallon of gasoline.
c) Average miles per gallon.
d) Parking fees per day.
e) Tolls per day.*/

package com.sunbeam;

import java.util.Scanner;

public class DrivingCost {

	public static void main(String[] args) {
		double totalmiles;
		double costpergallon;
		double averagemiles;
		double parkingfees;
		double tolls;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Total miles driven per day");
		totalmiles = sc.nextDouble();
		
		System.out.println("Enter Cost per gallon of gasoline");
		costpergallon = sc.nextDouble();
		
		System.out.println("Enter Average miles per gallon");
		averagemiles = sc.nextDouble();
		
		System.out.println("Enter Parking fees per day");
		parkingfees = sc.nextDouble();
		
		System.out.println("Enter Tolls per day");
		tolls = sc.nextDouble();
		
		System.out.println(" Total cost :: "+(totalmiles/averagemiles)*costpergallon + parkingfees + tolls);
	}
	

}
