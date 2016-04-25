package domain.model;

import java.io.PrintStream;
import java.util.Date;

public class Account {

	private Statement statement;
	
	private Amount balance = Amount.amountOf(0);
	private String accountName;
	private String id;
	private String password;
    public Account(String id,String password,String name)
	{
		this.password=password;
		this.id=id;
		this.accountName=name;
		this.statement=new Statement();
	}
	public Account(Statement statement) {
		this.statement = statement;
		balance= Amount.amountOf(0);

	}
    public void accountName(String name)
	{
		this.accountName=name;
	}
	public void deposit(Amount value, Date date) {
		recordTransaction(value, date);
	}
	public void balance(int amount)
	{
		balance = Amount.amountOf(amount);
	}
	public Amount getBalance()
	{
		return balance;
	}
	public Statement getStatement()
	{
		return statement;
	}

	public void withdrawal(Amount value, Date date) {
		recordTransaction(value.negative(), date);
	}

	public void printStatement(PrintStream printer) {
		statement.printTo(printer);
	}

	private void recordTransaction(Amount value, Date date) {
		Transaction transaction = new Transaction(value, date);
		Amount balanceAfterTransaction = transaction.balanceAfterTransaction(balance);
		balance = balanceAfterTransaction;
		statement.addLineContaining(transaction, balanceAfterTransaction);
	}
	
}
