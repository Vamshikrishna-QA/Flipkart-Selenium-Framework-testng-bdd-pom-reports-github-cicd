package com.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.Libaryclass;
import com.reuseablefunctions.resuable;

public class Searchpage extends Libaryclass {
	
	resuable re;
	
	public Searchpage(WebDriver driver) {
		
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
		
		}
	@FindBy(xpath="//input[@placeholder='Search for Products, Brands and More']")
	WebElement Searchtext;
	
	
	@FindBy(xpath="//html[@lang='en-IN']")
	WebElement homepage;
	
	
	@FindBy(xpath="//*[@id='container']")
	WebElement Searchresults;
	
	
	
	public void Search(String text) {
		re=new resuable(driver);
		re.Entervalue(Searchtext, text);
		}
	
	
	public void clicksearch() {
		Searchtext.sendKeys(Keys.ENTER);
	}
	
	public void homepage() {
		System.out.println(homepage.isDisplayed());
	}
	
	public void results() {
		System.out.println(Searchresults.isDisplayed());
	}
	
	
	
	

}
