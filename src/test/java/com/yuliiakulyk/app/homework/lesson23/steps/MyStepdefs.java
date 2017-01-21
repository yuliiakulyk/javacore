package com.yuliiakulyk.app.homework.lesson23.steps;


import com.sun.org.apache.regexp.internal.RE;
import com.yuliiakulyk.app.homework.lesson21.pages.EntrepreneurPage;
import com.yuliiakulyk.app.homework.lesson23.features.EquerestBaseTest;
import com.yuliiakulyk.app.homework.lesson23.features.RegisterEntrepreneurPage1TestEquerest;
import com.yuliiakulyk.app.homework.lesson23.pages.AddProjectAsEntrepreneurStepOnePage;
import com.yuliiakulyk.app.homework.lesson23.pages.RegisterEntrepreneurPage1;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Yuliia Kulyk on 21.01.2017.
 */
public class MyStepdefs extends EquerestBaseTest {

    @Given("^I am on new project registration page$")
    public void iAmOnNewProjectRegistrationPage() throws Throwable {
        setUp();
        AddProjectAsEntrepreneurStepOnePage page1 = new AddProjectAsEntrepreneurStepOnePage(driver);




        throw new cucumber.api.PendingException();
    }

    @When("^I fill my First Name \"([^\"]*)\" and Last Name \"([^\"]*)\" into Full Name field$")
    public void iFillMyFirstNameAndLastNameIntoFullNameField(String arg0, String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }


}
