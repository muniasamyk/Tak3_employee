package firstdemo;

public class mainemp extends Employee{
	
	public mainemp(int Empid,String Empname) {
		super(Empid,Empname);
	}
	
	public static void main(String[]args) {
		Manager m1=new Manager(5031,"MUNIYASAMI","IT");
		
		m1.display();
		
		Technician t1=new Technician (5032,"SURIYA","JAVA");
		t1.display();
	}

}