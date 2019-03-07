/**
 * 
 */
/**
 * @author 16692
 *
 */
package banking;

class Account
{
	private double balance;
	
	public Account(  double balance)
	{
		this.balance = balance;
	}
	
	public double getBalance ()
	{ 
		return balance;
		
	}
	
	public void withdraw(double withdraw)
	{
	  
		balance = balance - withdraw;
	}
	 
	public void deposit( double deposit)
	{
		balance = balance + deposit;
	}
}



/* PRESET CODE BEGIN - NEVER TOUCH CODE BELOW */

/*
 * This class creates the program to test the banking classes.
 * It creates a new Bank, sets the Customer (with an initial balance),
 * and performs a series of transactions with the Account object.
 */



public class Main{

  public static void main(String[] args) {
    Account  account;

    // Create an account that can has a 500.00 balance.
    System.out.println("Creating an account with a 500.00 balance.");
    account = new Account(500.00);

    System.out.println("Withdraw 150.00");
    account.withdraw(150.00);

    System.out.println("Deposit 22.50");
    account.deposit(22.50);

    System.out.println("Withdraw 47.62");
    account.withdraw(47.62);

    // Print out the final account balance
    System.out.println("The account has a balance of " + account.getBalance());
  }
}

/* PRESET CODE END - NEVER TOUCH CODE ABOVE */


