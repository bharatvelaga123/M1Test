package Question2;
class Transaction
{
	public static double deposit(Account account , double amount)
	{
		account.setBalance(account.getBalance()+amount);
		return account.getBalance();
	}
	public   static double withdraw(Account account ,  double amount) throws InsufficientBalanceException
	{
		if(account.getBalance()-amount<5000)
		{
			throw new InsufficientBalanceException();
		}
		else
		{
			account.setBalance(account.getBalance()-amount);
			return account.getBalance();
		}
	}
}