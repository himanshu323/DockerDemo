package com.newtours.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegistrationPage {

    private WebDriverWait wait;
    private WebDriver driver;

    public RegistrationPage(WebDriver driver){

        this.driver=driver;

        this.wait=new WebDriverWait(driver,60);

        PageFactory.initElements(driver,this);
    }

    @FindBy(name="firstName")
    public WebElement firstNameField;

    @FindBy(name = "lastName")
    private WebElement lastNameTxt;

    @FindBy(name = "email")
    private WebElement usernameTxt;

    @FindBy(name = "password")
    private WebElement passwordTxt;

    @FindBy(name = "confirmPassword")
    private WebElement confirmPasswordTxt;

    @FindBy(name = "register")
    private WebElement submitBtn;


    public void launch()
    {

        this.driver.get("http://newtours.demoaut.com/mercuryregister.php?osCsid=c2d48bb935480403e54b0d8edabfe48c");

        this.wait.until(ExpectedConditions.visibilityOf(this.firstNameField));

    }

    public void enterUserDetails(String firstName, String lastName){
        this.firstNameField.sendKeys(firstName);
        this.lastNameTxt.sendKeys(lastName);
    }

    public void enterUserCredentials(String username, String password){
        this.usernameTxt.sendKeys(username);
        this.passwordTxt.sendKeys(password);
        this.confirmPasswordTxt.sendKeys(password);
    }

    public void submit(){
        this.submitBtn.click();
    }


}
