package isp.lab3.exercise2;

public class Exercise2 {
    public static void main(String[]args){
        Rectangle r1 = new Rectangle();
        System.out.println(r1);
        Rectangle r2 = new Rectangle(5,5,"green");
        System.out.println(r2);
        System.out.println(r2.getLength());
        System.out.println(r2.getWidth());
        System.out.println(r2.getColor());
        System.out.println(r2.getArea());
        System.out.println(r2.getPerimeter());
    }
}
