package Question2;
public class Q2Main
{
    public static void main(String args[])
    {
       try
       {
            Account a1=new Account("Anu",10000);
            Transaction t1=new Transaction();
            System.out.println(a1.getBalance());
            System.out.println(t1.deposit(a1,500));
            System.out.println(t1.withdraw(a1,1500));
            System.out.println(t1.withdraw(a1,20000));
       }
       catch(InsufficientBalanceException i)
       {
           System.out.println("Insufficient Balance");
       }
        
    }
}
