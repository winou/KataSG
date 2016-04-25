package domain.service;

import domain.model.Amount;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by winoo on 23/04/2016.
 */

public interface IserviceAccount {

    public void deposit(Long amount,Date date);
    public void retrait(Long amount,Date date);
    public void findAccount(String id) throws Exception;
    public Amount getBalance();
    public String histroy();
}
