package encapsulation;

public class EmployeeDetails {
	private String empName="Tejesh";
	private double salary=90.099;
	private int age=23;
	private String dept="Testing";
	private String phonenumber="899876678";
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getEmpName() {
		return empName;
	}
	public int getAge() {
		return age;
	}
	

}
