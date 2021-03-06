package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class Productdetails extends ProjectMethods{
	
	public Productdetails() {		
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.XPATH,using="//*[contains(@id,'add-button')]")
	private WebElement clickaproduct;
	
	public Cart addingtocart(String xpath)
	{
		explicitWait(xpath);
		click(clickaproduct);
		try {
			Thread.sleep(7500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new Cart();
	}
	
	public Cart addingtocarths() {
		
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", clickaproduct);
		return new Cart();
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@title,'2')]")
	private WebElement emidropdown;
	
	public Productdetails clickemidropdown()
	{
		
		
		click(emidropdown);
		click(emidropdown);	
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@class,'delivery')]")
	private WebElement deliverysection;
	
	public Productdetails deliveryoptions()
	{
		
		highLighterMethod(driver, deliverysection);
		verifyDisplayed(deliverysection);
		
		return this;
	}
	

}