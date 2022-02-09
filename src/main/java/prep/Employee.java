package prep;

public class Employee
{
	String name;
	double rate;
	double hours;
	Payroll payroll;
	
	//First constructor to make new employee based only on
	//name, rate, and hours
	public Employee(String name, double rate, double hours)
	{
		this.name = name;
		this.rate = rate;
		this.hours = hours;
	}
	
	//Second constructor to make new employee based additionally on
	//payroll.
	public Employee(String name, double rate, double hours, Payroll payroll)
	{
		this.name = name;
		this.rate = rate;
		this.hours = hours;
		this.payroll = payroll;
	}
	
	/**
	 * @return  the name of specific employee
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * @param the name of the employee
	 */
	public void setName(String name)
	{
		this.name = name;
	}

	/**
	 * @return get the rate of the specific employee
	 */
	public double getRate()
	{
		return rate;
	}

	/**
	 * @param the rate of the employee
	 */
	public void setRate(double rate)
	{
		this.rate = rate;
	}

	/**
	 * @return the hours that the specific employee worked
	 */
	public double getHours()
	{
		return hours;
	}

	//Calls the pay method of the payroll object (contractor/salary worker)
	public double pay()
	{
		return payroll.pay(hours, rate);
	}
	
	//Sets the payroll object of the employee, if they are not initialized 
	//with one or if they change from a salary worker to a contractor
	public void setPayroll(Payroll payroll) 
	{
		this.payroll = payroll;
	}
	
	//Updates the hours of the employee object
	public void setHours(double hours)
	{
		this.hours = hours;
	}
}
