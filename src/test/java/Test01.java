import org.example.DriverUtil;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static jdk.nashorn.internal.runtime.Debug.id;
import static org.openqa.selenium.By.*;
import static org.openqa.selenium.By.id;
public class Test01 extends RunnerTest {
    private final DriverUtil driverUtil=getDriverUtil();

    By apparel=cssSelector(".subnav > ul > li:nth-of-type(2) > a");
    By FirstItem=cssSelector("div:nth-of-type(1) > .thumbnail > .jumbotron.pricetag > a[title='Add to Cart'] > .fa.fa-cart-plus.fa-fw");
    By ItemCart=id("option344747");
    By CartShoes=linkText("Add to Cart");
    By makeUp=linkText("MAKEUP");
    By itemMakeUp=cssSelector("div:nth-of-type(7) > .thumbnail > .jumbotron.pricetag > a[title='Add to Cart'] > .fa.fa-cart-plus.fa-fw");
    By Cart=cssSelector("div:nth-of-type(3) > a[title='Added to cart'] > .fa.fa-fw.fa-shopping-cart");
    By subtotal=cssSelector("tr:nth-of-type(1) > td:nth-of-type(2) > .bold");
    By Total=cssSelector(".dropdown-toggle > .cart_total");
    By deleteShoes=cssSelector("tr:nth-of-type(2) > td:nth-of-type(7) > .btn.btn-default.btn-sm > .fa.fa-fw.fa-trash-o");
    By deleteMakeUp=cssSelector(".btn.btn-default.btn-sm > .fa.fa-fw.fa-trash-o");
    By price= className("cart_total");
    By shoppingCartEmpty=cssSelector(".contentpanel");
    @Test
    public void test01() {

        try {

            driverUtil.findElement( apparel).click();
            driverUtil.findElement( FirstItem).click();
            driverUtil.findElement(ItemCart ).click();
            driverUtil.findElement( CartShoes).click();
            driverUtil.findElement( makeUp).click();
            driverUtil.findElement(itemMakeUp ).click();
            driverUtil.findElement(itemMakeUp ).click();
            driverUtil.findElement(itemMakeUp ).click();
            driverUtil.findElement(Cart).click();
            WebElement subTotal= driverUtil.findElement(subtotal);
            WebElement TotalHome= driverUtil.findElement(Total);
            Assert.assertEquals(subTotal.getText(),TotalHome.getText());
            driverUtil.findElement(deleteShoes).click();
            driverUtil.findElement(deleteMakeUp).click();
            WebElement PriceHome= driverUtil.findElement(price);
            Assert.assertEquals(PriceHome.getText(),"$0.00");
            Boolean CartEmpty =driverUtil.findElement(shoppingCartEmpty).isDisplayed();
            Assert.assertTrue(CartEmpty);



        } catch (Exception ex) {
            System.out.println("elemento non trovato");
            Assert.fail("Test non completato");
        }


    }





}
