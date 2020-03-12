package isp.lab3.exercise2;

import org.junit.Test;
import static  org.junit.Assert.assertEquals;

public class RectangleTest {
    @Test
    public  void RectangleTest(){
        Rectangle r1 = new Rectangle();
        assertEquals(2,r1.getLength());
        assertEquals(1,r1.getWidth());
        assertEquals("red",r1.getColor());
    }

    @Test
    public void RectangleTestwithLengthAndWidth(){
        Rectangle r1 = new Rectangle(5,5);
        assertEquals("Length should be 5",5,r1.getLength());
        assertEquals("Width should be 5",5,r1.getWidth());
    }

    @Test
    public void RectangleTestwithLengthWidthAndColor(){
        Rectangle r1 = new Rectangle(6 ,6 ,"blue");
        assertEquals("Length should be 6",6,r1.getLength());
        assertEquals("Width should be 6",6,r1.getWidth());
        assertEquals("color should be blue","blue",r1.getColor());
    }
    @Test
    public void TestGetLength(){
        Rectangle r1 = new Rectangle();
        assertEquals("Length should be 2",2,r1.getLength());
    }
    @Test
    public void TestGetWidth(){
        Rectangle r1 = new Rectangle();
        assertEquals("Width should be 1",1,r1.getWidth());
    }
    @Test
    public void TestGetColor(){
        Rectangle r1 = new Rectangle();
        assertEquals("Color should be red","red",r1.getColor());
    }
    @Test
    public void TestGetPerimeter(){
        Rectangle r1 = new Rectangle();
        assertEquals("Perimeter should be 6",6,r1.getPerimeter());
    }
    @Test
    public void TestGetArea(){
        Rectangle r1 = new Rectangle();
        assertEquals("Area should be 2",2,r1.getArea());
    }
    @Test
    public void TestToString(){
        Rectangle r1= new Rectangle(3,3,"orange");
        assertEquals("Rectangle: length=3 width=3 color=orange Perimeter=12 Area=9",r1.toString());
    }

}
