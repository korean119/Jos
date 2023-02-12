package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SingInPage {
	 protected WebDriver driver;
	 
	  // <input name="user_name" type="text" value="">
	 

	  private By useremail = By.name("email");
	  // <input name="password" type="password" value="">
	  private By passwordBy = By.name("password");
	  // <input name="sign_in" type="submit" value="SignIn">
	  private By signinBy = By.cssSelector(".tagGNBContractSetupStartBtn");

	  public SingInPage(WebDriver driver){
	    this.driver = driver;
	     if (!driver.getTitle().equals("Sign In Page")) {
	      throw new IllegalStateException("This is not Sign In Page," +
	            " current page is: " + driver.getCurrentUrl());
	    }
	  }
	  /**
	    * Login as valid user
	    *
	    * @param userName
	    * @param password
	    * @return HomePage object
	    */
	  public HomePage loginValidUser(String userName, String password) {
	    driver.findElement(useremail).sendKeys(userName);
	    driver.findElement(passwordBy).sendKeys(password);
	    driver.findElement(signinBy).click();
	    return new HomePage(driver);
	  }
	}

	  
	 

