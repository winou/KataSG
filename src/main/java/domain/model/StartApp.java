package domain.model;

import static application.util.DateCreator.date;
import static domain.model.Amount.amountOf;

public class StartApp {
	
	public static void main(String[] args) {
		Account account = new Account(new Statement());
		account.deposit(amountOf(3000), date("10/01/2012"));
		account.deposit(amountOf(5000), date("13/01/2012"));
		account.withdrawal(amountOf(500), date("14/01/2012"));
		account.deposit(amountOf(5000), date("13/01/2012"));
		account.deposit(amountOf(5000), date("13/01/2012"));
		account.printStatement(System.out);
	}

}
