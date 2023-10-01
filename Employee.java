package firstdemo;

public class Employee {
	private int Empid;
	private String Empname;
	
	public Employee(int Empid,String Empname) {
		super();
		this.Empid=Empid;
		this.Empname=Empname;
	}

	public int getEmpid() {
		return Empid;
	}

	public void setEmpid(int empid) {
		Empid = empid;
	}

	public String getEmpname() {
		return Empname;
	}

	public void setEmpname(String empname) {
		Empname = empname;
	}


	
}
