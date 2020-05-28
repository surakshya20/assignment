package firstAssignment;

import java.util.Scanner;

public class SimpleInterest {
 
	public static void main(String arng[]){
		Scanner data = new Scanner(System.in);
		int P, T,R;
		System.out.println("Enter Principal:");
		P = data.nextInt();
		System.out.println("Enter Time:");
		T = data.nextInt();
		System.out.println("Enter Rate:");
		R= data.nextInt();
		

		interest(P,T,R);

		}
		// sum method
		public static void interest(int P, int T,int R){
		int SI=1;
		SI=(P*T*R)/100;
		System.out.println("The calculated simple interest is:"+SI);

		}
}
