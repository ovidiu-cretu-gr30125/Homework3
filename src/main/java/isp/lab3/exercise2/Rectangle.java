package isp.lab3.exercise2;

public class Rectangle {
    private int length;
    private int width;
    private String color;

    public Rectangle(){
        this.length=2;
        this.width=1;
        this.color="red";
    }
    public Rectangle(int length,int width){
        this.length=length;
        this.width=width;
    }
    public Rectangle(int length,int width,String color){
        this.length=length;
        this.width=width;
        this.color=color;
    }

    public int getLength(){ return length;}
    public int getWidth(){return width;}
    public String getColor(){return color;}
    public int getPerimeter(){return 2*length+2*width;}
    public int getArea(){return length*width;}

    public  String toString(){
        return "Rectangle: length="+length+" width="+width+" color="+color+" Perimeter="+getPerimeter()+" Area="+getArea()+"";
    }
}
