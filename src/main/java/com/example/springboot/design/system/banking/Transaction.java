package com.example.springboot.design.system.banking;

/**
 *
 * Private Variables:<br>
 * {@link #accountNumber}: Long<br>
 * {@link #bank}: Bank<br>
 */
public class Transaction implements TransactionInterface{
	private Long accountNumber;
	private Bank bank;
	private int attemptedPin;

	/**
	 *
	 * @param bank
	 *            The bank where the account is housed.
	 * @param accountNumber
	 *            The customer's account number.
	 * @param attemptedPin
	 *            The PIN entered by the customer.
	 * @throws Exception
	 *             Account validation failed.
	 */
	public Transaction(Bank bank, Long accountNumber, int attemptedPin) throws Exception {
		this.accountNumber=accountNumber;
		this.bank=bank;
		this.attemptedPin=attemptedPin;
	}

	public double getBalance() {
		// complete the function
        if(bank.authenticateUser(accountNumber,attemptedPin))
		return bank.getBalance(accountNumber);
        throw new RuntimeException("");
	}

	public void credit(double amount) {
		// complete the function
		if (bank.authenticateUser(accountNumber,attemptedPin))
			bank.credit(accountNumber,amount);
	}

	public boolean debit(double amount) {
		// complete the function
        if(bank.authenticateUser(accountNumber,attemptedPin))
        	return bank.debit(accountNumber,amount);
        return false;
	}
}
