package domain.model;

import java.util.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Created by winoo on 23/04/2016.
 */
@Component
public class RepositoryAccountImpl implements IrepositoryAccount{
    private Map<String,Account> mapAccount;
    public RepositoryAccountImpl()
    {
        mapAccount=new HashMap<String, Account>();
        Account account01=new Account("ID01","pass01","marie");
        Account account02=new Account("ID02","pass02","said");
        Account account03=new Account("ID03","pass03","michel");
        mapAccount.put("ID01",account01);
        mapAccount.put("ID02",account02);
        mapAccount.put("ID03",account03);
    }

    public Account findById(String id) {
        return mapAccount.get(id);
    }

}
