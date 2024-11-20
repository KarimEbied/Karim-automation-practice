import org.testng.Assert;
import org.testng.annotations.Test;

public class TC15 extends BaseTest {
    @Test
    public void ValidPlaceBeforeCheckout(){
        new PlaceOrderRegisterbeforeCheckout(driver).Signup();
        Assert.assertEquals("ACCOUNT CREATED!",new PlaceOrderRegisterbeforeCheckout(driver).ACCcreatedmsg.getText());
        new PlaceOrderRegisterbeforeCheckout(driver).addProduct();
        Assert.assertEquals("ACCOUNT DELETED!",new PlaceOrderRegisterbeforeCheckout(driver).ACCdelete.getText());
        new PlaceOrderRegisterbeforeCheckout(driver).Finish();



    }

}
