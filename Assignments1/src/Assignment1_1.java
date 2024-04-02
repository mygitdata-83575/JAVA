import java.util.Scanner;
public class Assignment1_1 {
	
	public static void main(String[] args) {
	int num;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number - ");
	num = sc.nextInt();
	String n1 = Integer.toBinaryString(num);
	String n2 = Integer.toOctalString(num);
	String n3 = Integer.toHexString(num);
	
	System.out.println("Number : "+num);
	System.out.println("Binary Equivalent : "+n1);
	System.out.println("Octal Equivalent : "+n2);
	System.out.println("Hexadecimal Equivalent : "+n3);
	
	}
	
}
