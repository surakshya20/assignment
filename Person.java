package firstAssignment;
 class Person {

	String personName;
	 double salary;
	 
	 public Person(String personName,double salary) {
		 this.personName=personName;
		 this.salary=salary;
	 }
	 
	 void display() {
		 System.out.println("Name of the person is:"+personName);
		 System.out.println("salary of the person is :"+salary);
	 }
	
}
 class Politician extends Person{
	 
	public Politician(String personName, double salary) {
		super(personName, salary);
	}

 }
	
class Sportsman extends Person{
	public Sportsman(String personName, double salary) {
		super(personName, salary);
		
	}
}
class HierarchicalInheritance{
 public  static void  main(String args[]){  
	Politician p=new Politician("Ram",300000);
	Sportsman s=new Sportsman("Hari",20000);
	p.display();
	s.display();
}	
}


