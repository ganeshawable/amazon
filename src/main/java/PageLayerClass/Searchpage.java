package PageLayerClass;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;

public class Searchpage extends BaseClass {

	@FindBy(xpath = "//input[@class='gLFyf']")
	WebElement searchbox;

	@FindBy(xpath = "//div[@class='FPdoLc lJ9FBc']//input[@class='gNO89b']")
	WebElement searchbutton;

	@FindBy(xpath = "//div[@class='TbwUpd NJjxre']")
	List<WebElement> searchresult;

	public Searchpage() {
		PageFactory.initElements(driver, this);
	}

	public void search(String searchname) {
		searchbox.sendKeys(searchname);
		searchbutton.click();
		for(WebElement a:searchresult) {
			String d=a.getText();
			System.out.println(d);
		}
			
		}

}
