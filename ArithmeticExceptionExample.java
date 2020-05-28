package firstAssignment;

public class ArithmeticExceptionExample {
	
	 public static void main(String args[]) 
	    { 
	        try { 
	            int a = 50, b = 0; 
	            int c = a/b;  // cannot divide by zero 
	            System.out.println ("Result = " + c); 
	        } 
	        catch(ArithmeticException e) { 
	            System.out.println ("Can't divide the number by 0,which is an Arithmetic Exception"); 
	        } 
	    } 
	} 

