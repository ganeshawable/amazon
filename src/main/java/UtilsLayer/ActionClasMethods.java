package UtilsLayer;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionClasMethods extends BaseLayer.BaseClass {
	public void click(WebElement wb) {
		new Actions(driver).click(wb).build().perform();
	}
	public void doubleclick(WebElement wb) {
		new Actions(driver).doubleClick(wb).build().perform();
	}
	public void rightclick(WebElement wb) {
		new Actions(driver).contextClick(wb).build().perform();
	}
	public void movetoelement(WebElement wb) {
		new Actions(driver).moveToElement(wb).build().perform();
	}
	public void draganddrop(WebElement wb1, WebElement wb2) {
		new Actions(driver).dragAndDrop(wb1, wb2).build().perform();
	}
	public void clickandhold(WebElement wb) 
	{
		new Actions(driver).clickAndHold(wb).build().perform();
	}
	public void release()
	{
		new Actions(driver).release().build().perform();
	}
	public void enterdatainuppercase(WebElement wb,String ab)
	{
		new Actions(driver).keyDown(Keys.SHIFT).sendKeys(wb,ab).keyUp(Keys.SHIFT).build().perform();
	}

}
