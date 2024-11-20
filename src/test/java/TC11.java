import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class TC11 extends BaseTest{
@Test
    public void validSubs(){
    new VerifySubscriptionInCartpage(driver).click();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    new VerifySubscriptionInCartpage(driver).enterEmail("karim1@gmil.com");
    Assert.assertEquals("You have been successfully subscribed!",new VerifySubscriptionInCartpage(driver).SucSub.getText());



}
}
