package UtilsLayer;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class HandlesDropDown extends BaseLayer.BaseClass {

	public static void handlesDPbyselectbyvalue(WebElement wb, String Value) {
		new Select(wb).selectByValue(Value);
	}

	public static void handlesDPbyselectbyindex(WebElement wb, int index) {
		new Select(wb).selectByIndex(index);
	}

	public static void handlesDPbyselectbyvisibleText(WebElement wb, String Value) {
		new Select(wb).selectByVisibleText(Value);
	}

	public static String checkselectedvalue(WebElement wb) {
		return new Select(wb).getFirstSelectedOption().getText();
	}

	public static int countTotalValuesInDP(WebElement wb) {
		return new Select(wb).getOptions().size();
	}

	public static void printAllDpValue(WebElement wb) {
		List<WebElement> ls = new Select(wb).getOptions();
		for (WebElement abc : ls) {
			System.out.println(abc.getText());
		}
	}
	
	public void clickAllDpValue(WebElement wb,String content) throws Exception {
		List<WebElement> ls = new Select(wb).getOptions();
		for (WebElement abc : ls) {
			abc.click();
			Thread.sleep(10);
			if(abc.getText().contains(content)) {
				break;
			}
		}
		
	}


	public static Boolean checkSpecificValueIsPresent(WebElement wb, String Value) {
		for (WebElement abc : new Select(wb).getOptions()) {
			if (abc.getText().contains(Value)) {
				return true;
			}
		}
		return false;
	}
}
