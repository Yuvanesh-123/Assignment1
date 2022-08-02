package week1day1;
//getting the values in main method
public class Employee {
	public void EmployeeName(String name){
		System.out.println(name);
	}
	public void EmployeeID(int ID){
		System.out.println(ID);
	}
	public void EmployeeAddress(String Address){
		System.out.println(Address);
	}
	public void EmployeeSalary(double  Salary){
		System.out.println(Salary);
	}
	public void EmployeeMobileNumber(long   Number){
		System.out.println(Number);
	}

	public static void main(String[] args) {
	Employee det = new Employee();
	det.EmployeeName("Yuvanesh.s");
	det.EmployeeID(648);
	det.EmployeeAddress("2/3 yyyy xxxx zzzz");
	det.EmployeeSalary(150000);
	det.EmployeeMobileNumber(7394535511L);

	}

}
