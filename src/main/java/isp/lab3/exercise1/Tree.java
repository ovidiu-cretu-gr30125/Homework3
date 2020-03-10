package isp.lab3.exercise1;

public class Tree {
    private int height;

    public Tree() {
        this.height = 15;
    }

    public void grow(int meters){
        if(meters>=1)
            height+=meters;
    }

    public int getValue() {
        return height;
    }

    public String toString() {
        return "Tree{" +
                "Height=" + height +
                '}';
    }
}
