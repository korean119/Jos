package PagesObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class _0_BasePage {

	public WebDriver driver;

    

	public _0_BasePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
}

	 
// 만약에 또 객채 못 찾으면 wait 사용 할 예정 	 
//    Wait Wrapper Method
//    public void waitVisibility(By elementBy) {
//        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(elementBy));
//    }
//    
//
//    //Click Method
//    public void click (By elementBy) {
//        waitVisibility(elementBy);
//        driver.findElement(elementBy).click();
//    }
//    //Write Text
//    public void writeText (By elementBy, String text) {
//        waitVisibility(elementBy);
//        driver.findElement(elementBy).sendKeys(text);
//    }
//    //Read Text
//    public String readText (By elementBy) {
//        waitVisibility(elementBy);
//        return driver.findElement(elementBy).getText();
//    }
//    //Assert
//    public void assertEquals (By elementBy, String expectedText) {
//        waitVisibility(elementBy);
//        Assert.assertEquals(readText(elementBy), expectedText);
//    }
//}

