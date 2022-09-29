package test1;

public class EmployeeApp {

	public static void main(String[] args) {
		Employee employee = new Employee();
		//employee.employeeId = 100; //because the var is private in employee class..
		employee.setEmployeeId(100);
		employee.setEmployeeName("Virat Kohli");
		employee.setEmployeeSalary(55000);	

		
		//System.out.println(getEmployeeId);
		System.out.println("Id - "+employee.getEmployeeId());
		System.out.println("Name - "+employee.getEmployeeName());
		System.out.println("Salary - "+employee.getEmployeeSalary());
	}

}
