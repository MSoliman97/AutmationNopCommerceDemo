package webPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PageBase {

    WebDriver driver;
    String baseEmail = "any4@gmail.com";
    String  basePassword = "123456";
    public PageBase(WebDriver driver){
        this.driver = driver;
        //driver.findElement(By.xpath("//li/a[@href='/register?returnUrl=%2F']"));
        PageFactory.initElements(driver,this);
    }

    public void select (WebElement ele , int index){
        Select select = new Select(ele);
        select.selectByIndex(index);

    }
    protected void waitEleByVisibility(WebElement ele , int sec) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(sec));
        wait.until(ExpectedConditions.visibilityOf(ele));
    }
}
