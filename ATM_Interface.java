import java.util.*;
import java.util.Scanner;
class ATM_Interface
{   
    class bank_account
    {    private double balance;
         public bank_account(double balance)
         {
           this.balance=balance;
         }
         public double check_balance()
         {
            return balance;
         }
        public boolean Withdraw(double amount)
        {
             if(amount<=balance&&amount>0)
             {
                balance-=amount;
                return true;
             }
             return false;
        }
         public boolean Deposit(double amount)
        {
            if(amount>0)
             {
                balance+=amount;
               return true;
            }
            return false;
        }
    }
    class atm
    {
         Scanner sc=new Scanner(System.in);
         private bank_account account;
         public atm(bank_account bc)
         {
             this.account=bc;
         }
         public void getstart()
        {
            System.out.println("----------Welcome to ATM------------");
           int n;
            do
           {
            System.out.println("1.Get bank balance\n2.Deposit money\n3.Withdraw money\n4.exit");
            System.out.println("enter(1/2/3/4) for ATM service");
            n=sc.nextInt();
            if(n==1)
               getbalance();
            else if(n==2)
                deposit();
            else if(n==3)
                withdraw();
            else if(n==4)
               System.out.println("--------Thank you--------");
            else
                System.out.println("enter valid input");
          }while(n!=4);
       }
       private void getbalance()
       {     
          System.out.println("your account balance is "+account.check_balance());
       }
       private void deposit()
       {
          System.out.println("enter amount to deposit");
          double amount=sc.nextDouble();
          if(account.Deposit(amount))
              System.out.println("amount deposited successfully\n current balance="+account.check_balance());
          else
              System.out.println("you havd entered invalid amount");
       }
       private void withdraw()
       {
            System.out.println("enter amount to withdraw");
            double amount=sc.nextDouble();
            if(account.Withdraw(amount))
              System.out.println("amount withdrawed successfully\n current balance="+account.check_balance());
            else
              System.out.println("there is no sufficient balance to withdraw");
       }
   }

   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter initial deposit to the account");
      double n=sc.nextDouble();
      ATM_Interface atm_in=new ATM_Interface();
      ATM_Interface.bank_account bc=atm_in.new bank_account(n);
      ATM_Interface.atm ATM=atm_in.new atm(bc);
      ATM.getstart();
   }
}
