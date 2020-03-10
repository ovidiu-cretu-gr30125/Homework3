package isp.lab3.exercise1;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Exercise1Test {
    @Test
    public void testIncrement(){
        Tree t1 = new Tree();
        t1.grow(3);
        assertEquals(18,t1.getValue());
    }

    @Test
    public void testToString(){
        Tree t1 = new Tree();
        assertEquals("Tree{Height=15}",t1.toString());
    }

    @Test
    public void testTree(){
        Tree t1 = new Tree();
        assertEquals(15,t1.getValue());
    }
}
