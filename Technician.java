package firstdemo;

public class Technician extends Employee {
	private String Technician;

	public Technician(int Empid, String Empname, String technician) {
		super(Empid, Empname);
		Technician = technician;
	}

	public String getTechnician() {
		return Technician;
	}

	public void setTechnician(String technician) {
		Technician = technician;
	}
	
	
	public void display() {
		System.out.println("TECHNICIAN");
		System.out.println("---------");
		System.out.println("EmpID:"+getEmpid());
		System.out.println("EMPNAME:"+getEmpname());
		System.out.println("TECHNICIAN:"+Technician);
		
	}

}
