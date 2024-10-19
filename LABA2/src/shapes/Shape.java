package shapes;

import colors.Color;

public abstract class Shape {
    private Color color = Color.TRANSPARENT;
    private double perimeter, area;
    public void setter(Color newColor){
        this.color = newColor;
    }
    public Color getter(){
        return color;
    }
    public double getPerimeter(){
        return perimeter;
    }
    public double getArea(){
        return area;
    }
    public void move(double moveX, double moveY){

    }
    public void draw(){

    }
}
