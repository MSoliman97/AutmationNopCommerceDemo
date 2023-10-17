package webPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends PageBase{

    /*******************************************Constructor*******************************************/
    public RegisterPage(WebDriver driver){
        super(driver);

    }

    /*******************************************Elements*******************************************/
    @FindBy(xpath = "//li/a[@href='/register?returnUrl=%2F']")
    WebElement regPageBtn;
    @FindBy(id = "gender-male")
    WebElement genderSelect;
    @FindBy(id = "FirstName")
    WebElement firstNameTxt;
    @FindBy(id = "LastName")
    WebElement lastNameTxt;
    @FindBy(css ="select[name=DateOfBirthDay]" )
    WebElement daysList;
    @FindBy(css = "select[name=DateOfBirthMonth]")
    WebElement monthsList;
    @FindBy(css = "select[name=DateOfBirthYear]")
    WebElement yearsList;
    @FindBy(xpath = "(//div/input[@data-val=\'true\'])[3]")
    WebElement emailTxt;
    @FindBy(id = "Password")
    WebElement passwordTxt;
    @FindBy(id = "ConfirmPassword")
    WebElement confirmPasswordTxt;
    @FindBy(id = "register-button")
    WebElement regKeyBtn;

    /*******************************************Methods*******************************************/
    public void enterRegPage(){
        regPageBtn.click();
    }
    public void gender(){
        genderSelect.click();
    }
    public void enterFirstName(String firstName){
        firstNameTxt.click();
        firstNameTxt.sendKeys(firstName);
    }
    public void enterLastName(String lastName){
        lastNameTxt.click();
        lastNameTxt.sendKeys(lastName);
    }

    public void enterDateOfBirth(){

        select(daysList,24);
        select(monthsList,3);
        select(yearsList,85);
    }
    public void enterEmail(String email){
        emailTxt.click();
        emailTxt.sendKeys(email);
    }

    public void enterPassword(String password){
        passwordTxt.click();
        passwordTxt.sendKeys(password);
        confirmPasswordTxt.click();
        confirmPasswordTxt.sendKeys(password);
    }
    public void pressOnRegisterBtn(){
        regKeyBtn.click();
    }

}
