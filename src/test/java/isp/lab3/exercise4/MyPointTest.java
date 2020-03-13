package isp.lab3.exercise4;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MyPointTest {
    MyPoint p1 = new MyPoint(1,2,3);
    MyPoint p2 = new MyPoint();
    @Test
    public void MyPointTest(){
        assertEquals("x should be 0",0,p2.getX());
        assertEquals("y should be 0",0,p2.getY());
        assertEquals("z should be 0",0,p2.getZ());
    }
    @Test
    public void MyPointXYZTest(){
        assertEquals("x should be 1",1,p1.getX());
        assertEquals("x should be 2",2,p1.getY());
        assertEquals("x should be 3",3,p1.getZ());
    }
    @Test
    public void getXTest(){
        assertEquals("x should be 1",1,p1.getX());
    }
    @Test
    public void getYTest(){
        assertEquals("y should be 2",2,p1.getY());
    }
    @Test
    public void getZTest(){
        assertEquals("z should be 3",3,p1.getZ());
    }
    @Test
    public void setXTest(){
        p2.setX(10);
        assertEquals("x should be 10",10,p2.getX());
    }
    @Test
    public void setYTest(){
        p2.setY(10);
        assertEquals("x should be 10",10,p2.getY());
    }
    @Test
    public void setZTest(){
        p2.setZ(10);
        assertEquals("x should be 10",10,p2.getZ());
    }
    @Test
    public void setXYZTest(){
        p2.setXYZ(5,5,5);
        assertEquals("x should be 5",5,p2.getX());
        assertEquals("y should be 5",5,p2.getY());
        assertEquals("z should be 5",5,p2.getZ());
    }
    @Test
    public void toStringTest(){
        assertEquals("Should print (1 2 3)","(1 2 3)",p1.toString());
    }
    @Test
    public void distanceTest(){
        assertEquals("Distance should be 3",3,p2.distance(1,2,3));
    }
    @Test
    public void distanceAnotherPointTest(){
        assertEquals("Distance should be 3",3,p2.distance(p1));
    }
}
