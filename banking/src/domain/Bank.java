package domain;
import java.text.NumberFormat;
import java.util.*;
import java.text.NumberFormat;

class Customer
{
	private  Account Accounts[];
	private String firstName ;
	private String lastName  ;
	private int numberOfCustomers;
	
	public Customer(String f, String l)
	{
	        firstName = f;
	        lastName = l;
	        Accounts = new Account[15];
		
	}
	public String getFirstName()
	{
		return this.firstName;
	}
	public String getLastName()
	{
		return this.lastName;
	}
	public Account getAccount( int alndex)
	{	
		return Accounts[alndex];  
	}
	 
	public void addAccount(Account  acc   )
	{
		
		Accounts[ numberOfCustomers ] = acc;
		numberOfCustomers++;
		
		
	}
	public int getNumOfAccounts()
	{
		return numberOfCustomers;
	} 
}

/*       */
class Bank
{
	
	private  Customer customers[];
	private int numberOfCustomers=0;
	private static Bank bankInstance = new Bank();
	
	public static  Bank getBank()
	{
		return bankInstance;
	}
	
	private Bank()
	{
	      customers = new Customer[15];
	}
	public void addCustomer(String f, String l)
	{
		Customer Customers = new Customer(f, l);
		customers[ numberOfCustomers ] = Customers;
		numberOfCustomers++;
	}
	
	public int  getNumOfCustomers ()
	{
		return this.numberOfCustomers;
	}
	
	public Customer getCustomer (int index)
	{
		return customers[index];
		
	}
}
/*       */
class Account
{
	protected double balance;
	
	public Account(  double balance)
	{
		this.balance = balance;
	}
	
	public double getBalance ()
	{ 
		return balance;
		
	}
	
	public boolean withdraw(double amt)
	{
	  if(amt < balance)
	  {
		  balance = balance - amt;
		  return true;
	  }
	  else
	  {
		  return false;
	  }
		
	}
	 
	public boolean deposit( double amt)
	{
		balance = balance + amt;
		return true;
	}
}



class SavingsAccount extends Account
{
	private double interestRate;
	
	public SavingsAccount(double  balance, double interest_rate)
	{
		super(balance);
		this.interestRate = interest_rate;
		
	}
	
}

class CheckingAccount extends Account
{
	private double overdraftProtection;
	
	
    public CheckingAccount(double balance)
    {
    	super(balance);
    }
    
    public CheckingAccount(double balance, double protect)
    {
    	super(balance);
    	this.overdraftProtection = protect;
    }
    

	public boolean withdraw(double amt)
	{
	  if(amt <= balance)
	  {
		  balance = balance - amt;	
		 return true;		 
	  }
	  else
	  {
		  if (amt-balance <= overdraftProtection)
		  {
			  balance=0;
			  return true;
		  }
		  else 
		  {
			 
			  return false;
		  }
	  }
		
	}
    
}
class CustomerReport 
{
	public void generateReport() {
		NumberFormat currency_format = NumberFormat.getCurrencyInstance();

		Bank bank =  Bank.getBank();/*** STEP 1: RETRIEVE BANK SINGLETON OBJECT HERE ***/

		Customer customer;

		System.out.println("CUSTOMERS REPORT");
		System.out.println("================");

		for ( int cust_idx = 0; cust_idx < bank.getNumOfCustomers(); cust_idx++ ) {
		customer = bank.getCustomer(cust_idx);

		System.out.println();
		System.out.println("Customer: "
		+ customer.getLastName() + ", "
		+ customer.getFirstName());

		for ( int acct_idx = 0; acct_idx < customer.getNumOfAccounts(); acct_idx++ ) {
		Account account = customer.getAccount(acct_idx);
		String account_type = "";

		// Determine the account type
		if ( account instanceof SavingsAccount ) {
		account_type = "Savings Account";
		} else if ( account instanceof CheckingAccount ) {
		account_type = "Checking Account";
		} else {
		account_type = "Unknown Account Type";
		}

		// Print the current balance of the account
		System.out.println(" " + account_type + ": current balance is "
		+ currency_format.format(account.getBalance()));
		}
		}
		}
}


/* PRESET CODE BEGIN - NEVER TOUCH CODE BELOW */



class Main {

	public static void main(String[] args) {
		Bank bank = Bank.getBank();
		Customer customer;
		int curCustomer = 0;
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		s.nextLine();
		// Create several customers and their accounts according to data
		while (t-- > 0) {
			String f = s.next();
			String l = s.next();
			s.nextLine();
			bank.addCustomer(f, l);
			customer = bank.getCustomer(curCustomer++);
			int numAccount = s.nextInt();
			s.nextLine();
			while (numAccount-- > 0) {
				String[] type = s.nextLine().split(" ");
				double balance;
				double interesOrProtect;
				char op = type[0].charAt(0);
				if (op == 'C' || op == 'c') {
					balance = Double.parseDouble(type[1]);
					if (type.length == 3) {
						interesOrProtect = Double.parseDouble(type[2]);
						customer.addAccount(new CheckingAccount(balance,
								interesOrProtect));
					} else {
						customer.addAccount(new CheckingAccount(balance));
					}
				} else if (op == 'S' || op == 's') {
					balance = Double.parseDouble(type[1]);
					interesOrProtect = Double.parseDouble(type[2]);
					customer.addAccount(new SavingsAccount(balance,
							interesOrProtect));
				} else if (op == 'A' || op == 'a') {
					int cIndex = Integer.parseInt(type[1]);
					int aIndex = Integer.parseInt(type[2]);
					customer.addAccount(bank.getCustomer(cIndex).getAccount(
							aIndex));
				}
			}
		}
		
		CustomerReport cr = new CustomerReport();
		cr.generateReport();
	}
}

/* PRESET CODE END - NEVER TOUCH CODE ABOVE */
