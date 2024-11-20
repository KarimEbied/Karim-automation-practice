import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class PlaceOrderRegisterwhileCheckout extends BasePage{
    public PlaceOrderRegisterwhileCheckout(WebDriver driver) {
        super(driver);
    }
 @FindBy(css = "a[href='/product_details/1']") WebElement Fproduct;
 @FindBy(xpath = "//button[@type='button']") WebElement Add;
 @FindBy(css = "a[href='/view_cart'] u") WebElement viewCart;
@FindBy(css = "a[class='btn btn-default check_out']") WebElement procced;
@FindBy(xpath = "//*[@id='checkoutModal']/div/div/div[2]/p[2]/a") WebElement register;
@FindBy(xpath = "//input[@type='text']") WebElement name;
@FindBy(xpath = "//input[@data-qa='signup-email']") WebElement email;
@FindBy(xpath = "//button[@data-qa='signup-button']") WebElement signIn;
@FindBy(id = "id_gender1") WebElement title;
@FindBy(id = "password") WebElement pass;
@FindBy(id = "days") WebElement days;
@FindBy(id = "months") WebElement months;
@FindBy(id = "years") WebElement years;
@FindBy(id = "first_name") WebElement Fname;
@FindBy(id = "last_name") WebElement Lname;
@FindBy(id = "company") WebElement company;
@FindBy(id = "address1") WebElement address1;
@FindBy(id = "address2") WebElement address2;
@FindBy(id = "country") WebElement country;
@FindBy(id = "state") WebElement state;
@FindBy(id = "city") WebElement city;
@FindBy(id = "zipcode") WebElement zipcode;
@FindBy(id = "mobile_number") WebElement mobile_number;
@FindBy(css = "button[data-qa='create-account']") WebElement create;
@FindBy(xpath = "//a[@class]") WebElement Continue;
@FindBy(xpath = "//*[@id='form']/div/div/div/h2/b") WebElement ACCcreatedmsg;
@FindBy(css="a[href='/view_cart']")   WebElement cartbtn;
@FindBy(tagName = "textarea") WebElement comment;
@FindBy(xpath ="//a[@class]") WebElement placeOrder;
@FindBy(xpath ="//input[@class='form-control']") WebElement nameOnCard;
@FindBy(xpath ="//input[@class='form-control card-number']") WebElement CardNumber;
@FindBy(xpath ="//input[@class='form-control card-cvc']") WebElement CVC;
@FindBy(xpath ="//input[@class='form-control card-expiry-month']") WebElement EXPmm;
@FindBy(xpath ="//input[@class='form-control card-expiry-year']") WebElement EXPyy;
@FindBy(id ="submit") WebElement submit;
@FindBy(xpath ="//*[@id='form']/div/div/div/div/a") WebElement Getcontinue;
@FindBy(xpath = "//*[@id='header']/div/div/div/div[2]/div/ul/li[5]/a") WebElement DeleteACC;
@FindBy(xpath = "//*[@id='form']/div/div/div/h2/b") WebElement Ordermsg;
@FindBy(xpath = "//*[@id='form']/div/div/div/h2/b") WebElement ACCdeletemsg;
@FindBy(xpath = "//*[@id='form']/div/div/div/div/a") WebElement Finish;


public void signup(){
    Fproduct.click();
    Add.click();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    viewCart.click();
    procced.click();
    register.click();
    name.sendKeys("karim");
    email.sendKeys("karim826@gmail.com");
    signIn.click();
    title.click();
    pass.sendKeys("123456789");
    days.sendKeys("1");
    Select makeMonthsList= new Select(months);
    Select makeyearsList= new Select(years);
    makeMonthsList.selectByValue("1");
    makeyearsList.selectByValue("2000");
    Fname.sendKeys("Karim");
    Lname.sendKeys("Ebied");
    company.sendKeys("MountainView");
    address1.sendKeys("ELShourouk");
    address2.sendKeys("cairo");
    new Select(country).selectByIndex(3);
    state.sendKeys("cairo");
    city.sendKeys("cairo");
    zipcode.sendKeys("13703");
    mobile_number.sendKeys("01095289293");
    create.click();
}
public void checout(){
    Continue.click();
    cartbtn.click();
    procced.click();
    comment.sendKeys("nice Job");
    placeOrder.click();
    nameOnCard.sendKeys("karimEbied");
    CardNumber.sendKeys("123456789");
    CVC.sendKeys("407");
    EXPmm.sendKeys("23/7");
    EXPyy.sendKeys("2028");
    submit.click();
}
public void DelteACC(){
    Getcontinue.click();
    DeleteACC.click();
}
public void finish(){
    Finish.click();
}

}
