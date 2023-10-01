package firstdemo;

public class Manager extends Employee {
	private String Department;

	public Manager(int Empid, String Empname, String department) {
		super(Empid, Empname);
		Department = department;
	}

	public String getDepartment() {
		return Department;
	}

	public void setDepartment(String department) {
		Department = department;
	}
	
	public  void display() {
		System.out.println("MANAGER ");
		System.out.println("---------");
		System.out.println("EmpID:"+getEmpid());
		System.out.println("EMPNAME:"+getEmpname());
		System.out.println("DEPARTMENT:"+Department);
		
	}

}