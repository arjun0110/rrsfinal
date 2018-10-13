package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class Searchresults_SM  extends ProjectMethods{
	
	public Searchresults_SM() {		
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.XPATH,using="//*[contains(@class,'catalogo-title')]")
	private WebElement searchconfirmtext;
	
	public Searchresults_SM searchConfirm()
	{
		highLighterMethod(driver, searchconfirmtext);
		verifyDisplayed(searchconfirmtext);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@id,'add-button')]")
	private WebElement addtocartbutton;
	
	public Searchresults_SM addingtocart()
	{
		highLighterMethod(driver, searchconfirmtext);
		verifyDisplayed(searchconfirmtext);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@id,'cartgotocartbutton')]")
	private WebElement viewCartbutton;
	
	public Cartdetails viewcarts()
	{
		
		highLighterMethod(driver, viewCartbutton);
		click(viewCartbutton);
		return new Cartdetails();
	}
		

}
