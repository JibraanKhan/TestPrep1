package prep;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
public class CompanyTest
{
	Company company;
	Employee j;
	Employee a;
	Employee b;
	Contractor c = new Contractor();
	Hourly h = new Hourly();
	Salary s = new Salary();
	
	@Before
	public void setUp() throws Exception
	{
		j = new Employee("John", 5);
		j.setHours(35);
		j.setPayroll(s);
		
		b = new Employee("Bob", 12, c);
		b.setHours(59);
		
		company = new Company();
		company.addEmployee(j);
		company.addEmployee("Ashley", 10, 45, h); //Name, rate, hours, and payroll
		company.addEmployee(b);
	}

	@Test
	public void test()
	{
		double [] payments = new double[] {200, 475, 708};
		
		assertTrue(Arrays.equals(payments, company.payEmployees()));
		
	}

}
