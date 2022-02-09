package prep;
import java.util.ArrayList;
import java.util.List;

public class Company
{
	private List<Employee> employees;
	
	//Initialize employees array for the company
	public Company() {
		employees = new ArrayList<Employee>();
	}
	
	//Add employee without payroll specified to array
	public void addEmployee(String name, double rate, double hours) 
	{
		Employee e = new Employee(name, rate, hours);
		employees.add(e);
	}
	
	//Add employee with payroll specified to array.
	public void addEmployee(String name, double rate, double hours, Payroll payroll) 
	{
		Employee e = new Employee(name, rate, hours, payroll);
		employees.add(e);
	}
	
	public void addEmployee(Employee e)
	{
		employees.add(e);
	}
	
	//Set the hours for the specific employee.
	public void setHours(Employee employee, double hours)
	{
		employee.setHours(hours);
	}
	
	//Set the payroll type for the specific employee
	public void setPayroll(Employee employee, Payroll payroll)
	{
		employee.setPayroll(payroll);
	}
	
	//Returns a list of the payment for each employee.
	public double [] payEmployees()
	{
		int employee_size = employees.size();
		double [] paid_amts = new double[employee_size];
		for (int i = 0; i < employee_size; i++)
		{
			paid_amts[i] = employees.get(i).pay();
		}
		
		return paid_amts;
	}
}
