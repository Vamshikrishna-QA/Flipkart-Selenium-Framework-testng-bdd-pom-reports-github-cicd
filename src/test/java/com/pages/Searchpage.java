package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.Libaryclass;

public class Searchpage extends Libaryclass {
	
	public Searchpage(WebDriver driver) {
		
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
		
		}
	
	@FindBy(xpath="//input[@name='q'")
	WebElement Searchtext;
	
	
	
	
	
	
	
	
	
	
	
	

}
