package isp.lab3.exercise5;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class VendingMachineTest {
    VendingMachine V2 = new VendingMachine(5);
    @Test
    public void displayProducts(){
       final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
       System.setOut(new PrintStream(outContent));
       V2.displayProducts();
       assertEquals("Product Empty have id 0 ,price 0\r\n" +
               "Product Empty have id 1 ,price 0\r\n" +
               "Product Empty have id 2 ,price 0\r\n" +
               "Product Empty have id 3 ,price 0\r\n" +
               "Product Empty have id 4 ,price 0\r\n",outContent.toString());
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
