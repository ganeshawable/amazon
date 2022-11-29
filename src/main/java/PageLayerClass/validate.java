package PageLayerClass;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;

public class validate extends BaseClass {

	@FindBy(xpath = "//span[@class='a-price-whole']")
	List<WebElement> price;

	@FindBy(xpath = "//span[@class='a-icon-alt']")
	List<WebElement> star;

	public validate() {
		PageFactory.initElements(driver, this);
	}

	public void pricevalidate() {
		for (WebElement pr : price) {
			String price = pr.getText();
			System.out.println(price);
			int prcc = Integer.parseInt(price);
			Integer prd=Integer.valueOf(prcc);
			if (prd >= 30000 && prd <= 50000) {
				System.out.println("Price is under set limit");
			} else {
				System.out.println("price is mismatch with filter");
			}
		}
	}

	public void ratingvalidate() {
		for (WebElement rate : star) {
			String price = rate.getText();
			System.out.println(price);
		}
	}

}
