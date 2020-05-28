package firstAssignment;

public class ArrayIndexOutOfBoundExceptionExample {

	public static void main(String args[]) 
    { 
        try{ 
            int a[] = new int[2]; 
            a[3] = 7;
                      
        } 
        catch(ArrayIndexOutOfBoundsException e){ 
            System.out.println ("Array Index is Out Of Bounds"); 
        } 
    } 
}
