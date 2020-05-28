package firstAssignment;

public class StringIndexOutOfBoundExceptionExample {
	 public static void main(String args[]) 
	    { 
	        try { 
	            String s = " Example of string index out of bound exception "; 
	            char c = s.charAt(50); 
	            System.out.println(c); 
	        } 
	        catch(StringIndexOutOfBoundsException e) { 
	            System.out.println("String Index is Out Of Bounds Exception"); 
	        } 
	    } 

}
