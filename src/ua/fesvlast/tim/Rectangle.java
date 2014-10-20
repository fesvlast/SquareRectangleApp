package ua.fesvlast.tim;

/**
 * Created by Tim on 28.09.2014.
 */
public class Rectangle {
    private double width =0D;
    private double height=0D;

    public Rectangle() {
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectangle width: "+width+" height: "+height;
    }

    public double countSquare(){
        return  width*height;
    }
}
