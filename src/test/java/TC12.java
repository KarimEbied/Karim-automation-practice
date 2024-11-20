import org.testng.Assert;
import org.testng.annotations.Test;

public class TC12 extends BaseTest {
@Test
 public void validAddProducts(){
    new AddProductsInCart(driver).addProducts();
    Assert.assertEquals("Rs. 500",new AddProductsInCart(driver).FPprice.getText());
    Assert.assertEquals("Rs. 400",new AddProductsInCart(driver).SPprice.getText());
}
}
