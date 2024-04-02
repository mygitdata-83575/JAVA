//3. Display food menu to user. User will select items from menu along with the quantity. (eg 1. Dosa
//2. Samosa 3. Idli ... 10 . Generate Bill ) Assign fixed prices to food items(hard code the prices)
//When user enters 'Generate Bill' option , display total bill & exit.
//(No need of any class, and no need to display the food deatils. Only display the total of orderd
//food)

import java.util.Scanner;

public class Assignment1_3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int choice,quantity;
		int generateBill = 0;
		do {
			System.out.println("Menu");
			System.out.println("0.Exit");
			System.out.println("1.Dosa (Rs.35)");
			System.out.println("2.Samosa (Rs.25)");
			System.out.println("3.Idli (Rs.20)");
			System.out.println("4.Generate Bill ");
			System.out.println("Select choice from menu");
			choice = sc.nextInt();
			
			switch(choice) {
			case 0:
				System.out.println("Thank you for visiting our website");
				break;
			case 1:
				System.out.println("Enter quantity to purchase");
				quantity = sc.nextInt();
				generateBill = generateBill+(35*quantity);
				break;
			case 2:
				System.out.println("Enter quantity to purchase");
				quantity = sc.nextInt();
				generateBill = generateBill +(25*quantity);
				break;
			case 3:
				System.out.println("Enter quantity to purchase");
				quantity = sc.nextInt();
				generateBill = generateBill + (20*quantity);
				break;
			case 4:
				System.out.println("Total Bill - "+generateBill);
				break;
			default:
				System.out.println("Wrong choice");
			}
			
		}while(choice != 4);

	}

}
