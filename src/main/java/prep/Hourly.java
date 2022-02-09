package prep;

public class Hourly implements Payroll
{

	public Hourly()
	{
		// TODO Auto-generated constructor stub
	}

	public double pay(double hours, double rate)
	{
		// TODO Auto-generated method stub
		if (hours > 40) {
			double money = 40 * rate;
			money += (hours - 40) * (1.5 * rate);
			
			return money;
		}
		
		return hours * rate;
	}

}
