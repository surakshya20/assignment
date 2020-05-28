package firstAssignment;

import java.util.Scanner;

public class SmallestNumber {

	public static void main(String arng[]){
		Scanner input = new Scanner(System.in);
		double num1, num2,num3;
		System.out.println("Enter the first number:");
		num1 = input.nextDouble();
		System.out.println("Enter the second number:");
		num2 = input.nextDouble();
		System.out.println("Enter the third number:");
		num3 = input.nextDouble();

		smallest(num1,num2,num3);
		
		

		}
		
		public static void smallest(double num1, double num2,double num3){
			 if(num1<=num2 && num1<=num3){
			        System.out.println(num1+" is the smallest number");
			        
			    }
			    else if(num2<=num1 && num2<=num3){
			        System.out.println(num2+" is the smallest number");
			        
			    }
			    else{
			        System.out.println(num3+" is the smallest number");
			        
			    }
		

		}
}
