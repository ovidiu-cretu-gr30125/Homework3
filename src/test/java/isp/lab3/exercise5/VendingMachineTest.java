package isp.lab3.exercise5;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class VendingMachineTest {
    VendingMachine V2 = new VendingMachine(5);
    @Test
    public void displayProducts(){
       /// assertEquals("Product Empty have id 0 ,price 0 and there are 0 of this product","Product Empty have id 1 ,price 0 and there are 0 of this product",V2.displayProducts());
        ///i do not know how to test a void method
    }
    @Test
    public void insertCoinTest(){
        assertEquals("The credit should ne 10",10,V2.insertCoin(10));
    }
    @Test
    public void selectProductTest(){
        assertEquals("Should be Empty","Empty",V2.selectProduct(0));
    }
}
