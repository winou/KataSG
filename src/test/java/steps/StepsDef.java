package steps;

import application.impl.ServiceAccountImpl;
import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import domain.model.Account;
import domain.model.Statement;
import domain.service.IserviceAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;

import static org.assertj.core.api.Assertions.*;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

import static domain.model.Amount.amountOf;


@ContextConfiguration("classpath*:cucumber.xml")
public class StepsDef {


    private IserviceAccount serviceAccount;

    private Scenario scenario;
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
    @Before
    public void before(Scenario scenario) {

        serviceAccount=new ServiceAccountImpl();
        this.scenario = scenario;
    }

    @Given("^an existing client with id \"([^\"]*)\"$")
    public void an_existing_client_with_id(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        serviceAccount.findAccount(arg1);
    }

    @When("^the client deposits \"([^\"]*)\" EUR into her account$")
    public void the_client_deposits_EUR_into_her_account(String arg1) throws Throwable {
        serviceAccount.deposit(Long.valueOf(arg1),new Date());
    }

    @Then("^the new balance is \"([^\"]*)\" EUR$")
    public void the_new_balance_is_EUR(String arg1) throws Throwable {
        assertThat(amountOf(Integer.valueOf(arg1))).isEqualTo(serviceAccount.getBalance());
    }
    @When("^the client withdraws \"([^\"]*)\" EUR into her account$")
    public void the_client_withdraws_EUR_into_her_account(String arg1) throws Throwable {
        serviceAccount.retrait(Long.valueOf(arg1),new Date());
    }
    @Given("^the client deposits \"([^\"]*)\" EUR into her account in date \"([^\"]*)\"$")
    public void the_client_deposits_EUR_into_her_account_in_date(String arg1, String arg2) throws Throwable {
        serviceAccount.deposit(Long.valueOf(arg1),formatter.parse(arg2));
    }

    @Given("^the client withdraws \"([^\"]*)\" EUR into her account in date \"([^\"]*)\"$")
    public void the_client_withdraws_EUR_into_her_account_in_date(String arg1, String arg2) throws Throwable {
        serviceAccount.retrait(Long.valueOf(arg1),formatter.parse(arg2));
    }

    @When("^client check her account$")
    public void client_check_her_account() throws Throwable {

    }
    @Then("^generate the history of opertions$")
    public void generate_the_history_of_opertions() throws Throwable {

        scenario.write("History of operations : ");
        scenario.write(serviceAccount.histroy());
    }




}
