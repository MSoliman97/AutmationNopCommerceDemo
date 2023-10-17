package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import webPages.LoginPage;
import webPages.RegisterPage;

import java.time.Duration;

public class RegAndLogin2Test extends TestBase{

    RegisterPage rp;
    LoginPage lp ;
    @Test
    public void Register() {
        rp = new RegisterPage(driver);
        rp.enterRegPage();
        rp.gender();
        rp.enterFirstName("Marwan");
        rp.enterLastName("Soliman");
        rp.enterDateOfBirth();
        rp.enterEmail("any@gmail.com");
        rp.enterPassword("123456");
        rp.pressOnRegisterBtn();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        String expectedResultReg ="Your registration completed";
        WebElement successfulReg = driver.findElement(By.cssSelector("div.result"));
        String actualResultReg = successfulReg.getText();
        Assert.assertEquals(actualResultReg,expectedResultReg);

    }

    @Test
    public void login(){
        lp = new LoginPage(driver);
        lp.loginToAccount("any@gmail.com", "123456");
        WebElement logout = driver.findElement(By.cssSelector("a[class='ico-logout']"));
        String expectedResulLogin = "Log out";
        String actualResultLogin = logout.getText();
        Assert.assertEquals(actualResultLogin,expectedResulLogin);

    }

}
