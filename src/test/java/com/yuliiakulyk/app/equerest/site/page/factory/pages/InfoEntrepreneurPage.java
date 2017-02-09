package com.yuliiakulyk.app.equerest.site.page.factory.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by Yuliia Kulyk on 06.01.2017.
 */
public class InfoEntrepreneurPage extends EquerestBasePage {
    public String infoEntrepreneurUrl = urlHome + "/info/entrepreneur";

    @FindBy(how = How.XPATH, using = "(//a[contains(@class, 'button-orange')])[1]")
    public WebElement submitProject1Button;

    @FindBy(how = How.XPATH, using = "(//a[contains(@class, 'button-orange')])[2]")
    public WebElement submitProject2Button;

    @FindBy(how = How.XPATH, using = "(//a[contains(@class, 'button-orange')])[3]")
    public WebElement submitProject3Button;

}
