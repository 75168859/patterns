package com.miiceic.refactor.pattern.templatemethod.InterestRate;
abstract public class Account
{
    protected String accountNumber;

    public Account()
    {
		accountNumber = null;
    }

    public Account(String accountNumber)
    {
        this.accountNumber = accountNumber;
    }

    final public double calculateInterest()
    {
    	//1.
        double interestRate = doCalculateInterestRate();
        //2.
        String accountType = doCalculateAccountType();
        //3.
        double amount = calculateAmount(accountType, accountNumber);

	   	return amount * interestRate;
    }
                                    
    abstract protected String doCalculateAccountType() ;

    abstract protected double doCalculateInterestRate() ;

    final public double calculateAmount(String accountType, String accountNumber)
    {
        //retrieve amount from database...here is only a mock-up
        return 7243.00D;
    
    }
    
}
