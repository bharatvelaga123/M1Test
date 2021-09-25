package Question2;
import java.util.*;
import java.time.*;
class InsufficientBalanceException extends Exception{}
class Account
{
	int accountNumber=1000000001;
	String accountHolderName;
	LocalDate openedDate;
	double balance;
	Account(String name,double bal) throws InsufficientBalanceException
	{
		this.accountNumber+=1;
		this.accountHolderName=name;
		this.openedDate=LocalDate.now();
		if(bal>=5000)
		{
			this.balance=bal;
		}
		else
		{
			throw new InsufficientBalanceException();
		}
	}
	void setBalance(double b)
	{
		this.balance=b;
	}
	double getBalance()
	{
		return this.balance;
	}
	LocalDate getOpenedDate()
	{
		return this.openedDate;
	}
	int getAccountNumber()
	{
		return this.accountNumber;
	}
	String getAccountHolderName()
	{
		return this.accountHolderName;
	}
	// provide all constructors , setters , getters and validation methods
	// always balance must not be less than 5000 Rs.
}	

	