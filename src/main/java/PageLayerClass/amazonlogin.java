package PageLayerClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;

public class amazonlogin extends BaseClass {

	@FindBy(xpath = "//*[@id=\"gw-sign-in-button\"]/span/a")
	WebElement lgbt;
	
	//@FindBy(xpath = "//*[@id=\"nav-al-your-account\"]/a[1]/span")
	//WebElement loginbtn;

	@FindBy(id = "ap_email")
	WebElement mail;

	@FindBy(id = "continue")
	WebElement ctn;

	@FindBy(id = "ap_password")
	WebElement password;
	
	@FindBy(id = "signInSubmit")
	WebElement signin;
	public amazonlogin() {
		PageFactory.initElements(driver, this);
	}


	public void login(String uname, String pass) {
		driver.navigate().to("https://www.amazon.in/");
		lgbt.click();
		mail.sendKeys(uname);
		ctn.click();
		password.sendKeys(pass);
		signin.click();

	}
}
