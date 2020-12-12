package encapsulation;

public class Test1 {

	public static void main(String[] args) {
	EmployeeDetails e=new EmployeeDetails();
	System.out.println(e.getEmpName());
	System.out.println(e.getAge());
	System.out.println(e.getDept());
	e.setDept("Developer");
	System.out.println("current dept "+e.getDept());
	System.out.println(e.getPhonenumber());
	e.setPhonenumber("1234566789");
	System.out.println("After changeing phonenumb "+e.getPhonenumber());
	System.out.println(e.getSalary());
	e.setSalary(98765.90);
	System.out.println("After setting salary "+e.getSalary());
	

	
	}

}
