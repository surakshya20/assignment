package firstAssignment;

import java.util.Scanner;

public class Product {
	public static void main(String arng[]){
		Scanner data = new Scanner(System.in);
		int num1, num2;
		System.out.println("Enter the first number:");
		num1 = data.nextInt();
		System.out.println("Enter the second number:");
		num2 = data.nextInt();

		mul(num1,num2);

		}
		// sum method
		public static void mul(int num1, int num2){
		int product=1;
		product=num1*num2;
		System.out.println("Product of two numbers is:"+product);

		}

}
