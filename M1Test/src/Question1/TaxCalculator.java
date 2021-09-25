package Question1;
public class TaxCalculator
{
	public static double taxableAmount(double monthlySalary)
	{
		if(monthlySalary>=1 && monthlySalary<=250000)
		{
			return 0;
		}
		else if(monthlySalary>250000 && monthlySalary<=500000)
		{
			return ((monthlySalary/100)*10)*12;
		}
		else if(monthlySalary>500000 && monthlySalary<=1000000)
		{
			return ((monthlySalary/100)*20)*12;
		}
		else if(monthlySalary>1000000)
		{
			return ((monthlySalary/100)*30)*12;
		}
		else
		{
			return 0;
		}
	}
}
