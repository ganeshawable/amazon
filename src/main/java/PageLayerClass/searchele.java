package PageLayerClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;

public class searchele extends BaseClass {

	@FindBy(id = "searchDropdownBox")
	WebElement drp;
	
	@FindBy(id = "twotabsearchtextbox")
	WebElement src;
	
	@FindBy(xpath = "//div[@class='nav-search-submit nav-sprite']")
	WebElement searchb;
	
	@FindBy(id = "low-price")
	WebElement lp;
	
	@FindBy(id = "high-price")
	WebElement hp;
	
	@FindBy(xpath = "//input[@class='a-button-input']")
	WebElement go;
	

	public searchele() {
		PageFactory.initElements(driver, this);
	}

	public void elect(String dptt,String cnt,double l,double h ) throws Exception {
		UtilsLayer.HandlesDropDown hd=new UtilsLayer.HandlesDropDown();
		hd.clickAllDpValue(drp,dptt);
		src.sendKeys(cnt);
		searchb.click();
		String lpp=Double.toString(l);
		String hpp=Double.toString(h);
		lp.sendKeys(lpp);
		hp.sendKeys(hpp);
		go.click();
		
		
		
	}

}
