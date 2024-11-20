import org.testng.Assert;
import org.testng.annotations.Test;

public class TC14 extends BaseTest{
    @Test
    public void ValidPlacewhileCheckout(){
        new PlaceOrderRegisterwhileCheckout(driver).signup();
        Assert.assertEquals("ACCOUNT CREATED!",new PlaceOrderRegisterwhileCheckout(driver).ACCcreatedmsg.getText());
        new PlaceOrderRegisterwhileCheckout(driver).checout();
        Assert.assertEquals("ORDER PLACED!",new PlaceOrderRegisterwhileCheckout(driver).Ordermsg.getText());
        new PlaceOrderRegisterwhileCheckout(driver).DelteACC();
        Assert.assertEquals("ACCOUNT DELETED!", new PlaceOrderRegisterwhileCheckout(driver).ACCcreatedmsg.getText());
        new PlaceOrderRegisterwhileCheckout(driver).finish();
    }
}
