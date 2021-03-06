package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PaymentSuccessPageObjects {
	
	private WebDriver driver;
	
	@FindBy(how=How.XPATH, using="//div[@class='row justify-content-center']/h2")
	private WebElement paymentMessage;
	
	public PaymentSuccessPageObjects(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public String getPaymentStatusMessage() {
		return paymentMessage.getText();
	}

}
