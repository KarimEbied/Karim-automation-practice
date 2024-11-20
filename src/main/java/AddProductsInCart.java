import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import javax.swing.*;
import java.time.Duration;

public class AddProductsInCart extends BasePage{
    public AddProductsInCart(WebDriver driver) {
        super(driver);
    }
@FindBy(css = "a[href='/products']") WebElement products;
@FindBy(css = "a[href='/product_details/1']") WebElement Fproduct;
@FindBy(xpath = "//button[@type='button']") WebElement Add;
@FindBy(css = "a[href='/product_details/2']") WebElement Sproducrt;
@FindBy(css = "a[href='/view_cart'] u") WebElement viewCart;
@FindBy(xpath = "//*[@id='cartModal']/div/div/div[3]/button") WebElement cShopping;
@FindBy(xpath = "//*[@id='product-1']/td[5]/p") WebElement FPprice;
@FindBy(xpath = "//*[@id='product-2']/td[5]/p") WebElement SPprice;
public void addProducts(){
    products.click();
    Fproduct.click();
    Add.click();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    cShopping.click();
    products.click();
    Sproducrt.click();
    Add.click();
    viewCart.click();
}


}
