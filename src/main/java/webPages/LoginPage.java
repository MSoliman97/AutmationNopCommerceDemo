package webPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase{
    /*******************************************Constructor*******************************************/
public LoginPage (WebDriver driver){
    super(driver);
}

    /*******************************************Elements*******************************************/

    @FindBy(xpath = "//li/a[@href='/login?returnUrl=%2F']")
    WebElement loginPageBtn;
    @FindBy(xpath = "//div/input[@class='email']")
    WebElement emailTxt;
    @FindBy(xpath = "//div/input[@class='password']")
    WebElement passwordTxt;
    @FindBy(xpath ="//div/input[@type='checkbox']" )
    WebElement rememberMeCheckBox;
    @FindBy(xpath = "//div/button[@type='submit']")
    WebElement loginBtn;

    /*******************************************Methods*******************************************/
public void navigateToLoginPage(){
    loginPageBtn.click();
}
public void enterUsernameAndPassword(String email, String password){
    waitEleByVisibility(emailTxt,5);
    emailTxt.click();
    emailTxt.sendKeys(email);

    passwordTxt.click();
    passwordTxt.sendKeys(password);
}
public void pressOnRememberMe(){
    rememberMeCheckBox.click();
}
public void logInBtn (){

    loginBtn.click();
}
public void loginToAccount (String email , String password){
    navigateToLoginPage();
    enterUsernameAndPassword(email , password);
    pressOnRememberMe();
    logInBtn();
}
}
