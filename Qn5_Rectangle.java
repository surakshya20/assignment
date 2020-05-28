package firstAssignment;

public class Qn5_Rectangle {
		int length;  
		int width;  
		 void insertValue(int length, int width){  
		  this.length=length;  
		  this.width=width;  
		 }  
		 void calculateArea()
		 {
			 System.out.println(length*width);
			 }  
		 
		 
		 public static void main(String args[]){  
		  Qn5_Rectangle r1=new Qn5_Rectangle();  
		  Qn5_Rectangle r2=new Qn5_Rectangle();  
		  r1.insertValue(11,5);  
		  r2.insertValue(3,15);  
		  r1.calculateArea();  
		  r2.calculateArea();  
		}  
		}  

