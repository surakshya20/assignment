package firstAssignment;

public abstract class Employee {
	public int grossSalary;
	public int incomeTax;
	public int netSalary;
	
	abstract void calculateNetSalary();
	abstract void displayNetSalary();

}
 
 class Manager extends Employee{
	
	public Manager(int grossSalary,int incomeTax) {
		this.grossSalary=grossSalary;
		this.incomeTax=incomeTax;
	}
	
	void calculateNetSalary() {
		netSalary=grossSalary-incomeTax;
	}
	void displayNetSalary() {
		System.out.println("The total net salary of the manager is:"+netSalary);
	}
}

 class Clerk extends Employee{
	
	public Clerk(int grossSalary,int incomeTax) {
		this.grossSalary=grossSalary;
		this.incomeTax=incomeTax;
	}
	void calculateNetSalary() {
		netSalary=grossSalary-incomeTax;
	}
	void displayNetSalary() {
		System.out.println("The total net salary of the clerk is:"+netSalary);
	}
}

class TestAbstraction{
	 public  static void  main(String args[]){  
	Employee m=new Manager(20000,2000);
	Employee c=new Clerk(15000,1000);
	m.calculateNetSalary();
	m.displayNetSalary();
	c.calculateNetSalary();
	c.displayNetSalary();
	
	 }	
}
