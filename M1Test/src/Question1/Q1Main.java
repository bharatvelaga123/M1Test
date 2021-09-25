package Question1;
public class Q1Main
{
	public static void main(String args[])
	{
		TaxCalculator tc = new TaxCalculator();
		System.out.println("Annual Taxable Amount is:"+tc.taxableAmount(300000.00));
	}
}
