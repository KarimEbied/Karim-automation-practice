import org.testng.Assert;
import org.testng.annotations.Test;

public class TC13 extends BaseTest {
@Test
public void ValidProductQuantity(){
    new VerifyProductquantityinCart(driver).addProducts();
    Assert.assertEquals("4",new VerifyProductquantityinCart(driver).CheckQuantity.getText());
}
}
