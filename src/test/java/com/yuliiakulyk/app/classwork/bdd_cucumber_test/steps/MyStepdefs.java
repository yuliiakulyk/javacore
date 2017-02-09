package com.yuliiakulyk.app.classwork.bdd_cucumber_test.steps;

import com.yuliiakulyk.app.classwork.bdd_cucumber_test.pages.AddProjectAsEntrepreneurStepOnePage;
import com.yuliiakulyk.app.classwork.bdd_cucumber_test.pages.AddProjectAsEntrepreneurStepTwoPage;
import com.yuliiakulyk.app.equerest_site_page_factory.tests.EquerestBaseTest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

/**
 * Created by Yuliia Kulyk on 22.01.2017.
 */
public class MyStepdefs extends EquerestBaseTest {
    AddProjectAsEntrepreneurStepOnePage page1;
    AddProjectAsEntrepreneurStepTwoPage page2;


    @Given("^I am on new project registration page$")
    public void iAmOnNewProjectRegistrationPage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        setUp();
        page1 = new AddProjectAsEntrepreneurStepOnePage(driver);
        driver.get("https://dev.equerest.com/register#/entrepreneur");
    }


    @When("^I fill my First Name \"([^\"]*)\" and Last Name \"([^\"]*)\" into Full Name field$")
    public void iFillMyFirstNameAndLastNameIntoFullNameField(String name, String surname) throws Throwable {
        page1.fillField(page1.name, name + " " + surname);
    }


    @And("^I fill my City \"([^\"]*)\" into City field$")
    public void iFillMyCityIntoCityField(String city) throws Throwable {
        page1.fillField(page1.city, city);
    }

    @And("^I fill my phone number \"([^\"]*)\" into Phone field$")
    public void iFillMyPhoneNumberIntoPhoneField(String phone) throws Throwable {
        page1.fillField(page1.phone, phone);
    }

    @And("^I fill my email address \"([^\"]*)\" into Email field$")
    public void iFillMyEmailAddressIntoEmailField(String email) throws Throwable {
        page1.fillField(page1.email, email);
    }

    @And("^I fill my desired password \"([^\"]*)\" into Password field$")
    public void iFillMyDesiredPasswordIntoPasswordField(String password) throws Throwable {
        page1.fillField(page1.password, password);
    }

    @And("^I set checkbox to show my password$")
    public void iSetCheckboxToShowMyPassword() throws Throwable {
        driver.findElement(page1.checkbox).click();
    }

    @And("^I go next to second project registration page$")
    public void iGoNextToSecondProjectRegistrationPage() throws Throwable {
        page2 = page1.clickOnGoToStep2();
    }


    @And("^I fill my project name \"([^\"]*)\" into Project name field$")
    public void iFillMyProjectNameIntoProjectNameField(String name) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        page2.fillField(page2.projectName, name);
    }

    @And("^I fill my project description \"([^\"]*)\" into Description field$")
    public void iFillMyProjectDescriptionIntoDescriptionField(String description) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        page2.fillField(page2.projectDescription, description);
    }


    @And("^I click stage radiobutton (\\d+)$")
    public void iClickStageRadiobutton(int numberFromZero) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        page2.fillStageByNumber(numberFromZero);
    }

    @And("^I fill competitive advantages \"([^\"]*)\" into Advantages field$")
    public void iFillCompetitiveAdvantagesIntoAdvantagesField(String advantages) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        page2.fillField(page2.advantages, advantages);
    }

    @And("^I fill monetization model \"([^\"]*)\" into Monetization field$")
    public void iFillMonetizationModelIntoMonetizationField(String monetization) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        page2.fillField(page2.monetizationModel, monetization);
    }

    @And("^I fill investment sum \"([^\"]*)\" into sum field$")
    public void iFillInvestmentSumIntoSumField(String sum) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        page2.fillField(page2.requiredAmount, sum);
    }

    @And("^I click Finish registration$")
    public void iClickFinishRegistration() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        page2.clickOnCheckboxAgree();
        driver.findElement(page2.endRegistrationButton).click();
    }

    @Then("^I should see finish page$")
    public void iShouldSeeFinishPage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Thread.sleep(3000);
        Assert.assertEquals("https://dev.equerest.com/register#/entrepreneur/finish", driver.getCurrentUrl());
        tearDown();
    }

}
