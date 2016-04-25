package application.impl;

import domain.model.Account;
import domain.model.Amount;
import domain.model.IrepositoryAccount;
import domain.model.RepositoryAccountImpl;
import domain.service.IserviceAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Date;

import static domain.model.Amount.amountOf;

/**
 * Created by winoo on 23/04/2016.
 */
@Service
public class ServiceAccountImpl implements IserviceAccount {

    private Account account = null;

    private IrepositoryAccount repsitoryAccount ;

    public ServiceAccountImpl() {
        repsitoryAccount=new RepositoryAccountImpl();
    }
    public void findAccount(String id) throws Exception {

        account = repsitoryAccount.findById(id);
        if(account==null)
            throw new Exception("not found account");
    }
    public void deposit(Long amount, Date date) {
        account.deposit(amountOf(amount.intValue()), date);
    }

    public void retrait(Long amount, Date date) {
        account.withdrawal(amountOf(amount.intValue()), date);
    }
    public Amount getBalance()
    {
       return account.getBalance();
    }

    public String histroy() {
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        PrintStream out = new PrintStream(os);

        account.printStatement(out);
        return os.toString();
    }
}
