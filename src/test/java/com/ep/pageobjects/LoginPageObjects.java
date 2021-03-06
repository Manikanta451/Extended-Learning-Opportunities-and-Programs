package com.ep.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.ep.pagefactory.CommonBase;

public class LoginPageObjects extends CommonBase{
	
	protected LoginPageObjects(WebDriver driver) {
		super(driver);
	}

	@FindBy(how = How.XPATH, using = "/html/body/header/nav/div/div[2]/ul/li[5]/a")
	
	public static WebElement btnlogIn;
	
	@FindBy(how = How.ID, using = "EmailId")
	
	public static WebElement Emailid;
	
	@FindBy(how = How.ID, using = "PassWord")
	
	public static WebElement Password;
	
	@FindBy(how = How.XPATH, using = "/html/body/div/section/div/div/form/div/div/input[3]")
			  
	public  static WebElement Loginbutton;
}
