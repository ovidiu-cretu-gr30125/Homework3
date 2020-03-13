package isp.lab3.exercise4;

public class MyPoint {
    int x , y , z;
    public  MyPoint(){
        this.x=0;
        this.y=0;
        this.z=0;
    }
    public MyPoint(int x,int y,int z){
        this.x=x;
        this.y=y;
        this.z=z;
    }
    public int getX(){return x;}

    public int getY(){return y;}

    public int getZ(){return z;}

    public void setX(int x){this.x=x;}

    public void setY(int y){this.y=y;}

    public void setZ(int z){this.z=z;}

    public void setXYZ(int x,int y,int z){
        this.x=x;
        this.y=y;
        this.z=z;
    }
    public String toString(){
        return "("+getX()+" "+getY()+" "+getZ()+")";
    }
    public int distance(int x,int y,int z){
        return(int) Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2) + Math.pow(z - this.z, 2));
    }
    public int distance(MyPoint another){
        return(int) Math.sqrt(Math.pow(another.getX() - this.x, 2) + Math.pow(another.getY() - this.y, 2) + Math.pow(another.getZ() - this.z, 2));
    }
}
