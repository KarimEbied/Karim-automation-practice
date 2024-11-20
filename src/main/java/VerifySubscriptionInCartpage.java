import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VerifySubscriptionInCartpage extends BasePage{
    public VerifySubscriptionInCartpage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css="a[href='/view_cart']")   WebElement cartbtn;

    @FindBy(id = "subscribe")   WebElement arrow;
    @FindBy(id = "susbscribe_email")   WebElement subs;
    @FindBy(id = "success-subscribe") public WebElement SucSub;
public void click(){
    cartbtn.click();
}
public void enterEmail(String mail) {
    subs.sendKeys(mail);
    arrow.click();

}

}
