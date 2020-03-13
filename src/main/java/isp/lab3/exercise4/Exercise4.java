package isp.lab3.exercise4;

public class Exercise4 {
    public static void main(String [] args){
        MyPoint p1 = new MyPoint();
        System.out.println(p1);
        MyPoint p2 = new MyPoint();
        p2.setXYZ(1,1,1);
        System.out.println(p2.distance(3,3,3));
        System.out.println(p2.distance(p1));
    }
}
