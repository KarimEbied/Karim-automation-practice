import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.time.Duration;

public class VerifyProductquantityinCart extends BasePage{
    public VerifyProductquantityinCart(WebDriver driver) {
        super(driver);
    }
@FindBy(css = "a[href='/product_details/1']") WebElement Fproduct;
@FindBy(id = "quantity") WebElement quantity;
@FindBy(xpath = "//button[@type='button']") WebElement Add;
@FindBy(css = "a[href='/view_cart'] u") WebElement viewCart;
@FindBy(xpath = "//button[@class='disabled']") WebElement CheckQuantity;
public void addProducts(){
    Fproduct.click();
    quantity.clear();
    quantity.sendKeys("4");
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    Add.click();
    viewCart.click();
}



}
