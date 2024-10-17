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

class Point extends Shape{
      private double x, y;
      public void setterX(double newX){
          x = newX;
      }
      public void setterY(double newY){
          y = newY;
      }
      public double getterX(){
          return x;
      }
      public double getterY(){
          return y;
      }
      public Point(){
          x = 0.0;
          y = 0.0;
      }
      public Point(double setX, double setY){
          setterX(setX);
          setterY(setY);
      }
    @Override
    public void move(double moveX, double moveY) {
        this.x = moveX;
        this.y = moveY;
    }
}
class Circle extends Shape{
    private Shape circle;
    private Point point;
    private double radius, pCircle = 2 * 3.14 * radius, aCircle = 3.14 * radius * radius;
    public void setterPoint(double x, double y){
        point.setterX(x);
        point.setterY(y);
    }
    public void setterR(double r){
        this.radius = r;
    }
    public Point getterPoint(){
        return point;
    }
    public double getterR(){
        return radius;
    }
    private boolean validate(){
        if(radius < 0) {
            Exception();
            return false;
        }
        return true;
    }
    private void Exception(){
        System.out.println("Ошибка(радиус меньше нуля");
    }
    public Circle(){
        point = new Point(0,0);
        radius = 0.0;
    }
    public Circle(double newX, double newY, double newR){
         point = new Point(newX, newY);
         radius = newR;
    }

    @Override
    public void move(double moveX, double moveY) {
        this.point.setterX(moveX);
        this.point.setterY(moveY);
    }

    @Override
    public double getPerimeter() {
        return pCircle;
    }

    @Override
    public double getArea() {
        return aCircle;
    }

    @Override
    public void draw() {
        if(!validate()) return;
        System.out.println("Фигура круг");
        System.out.println("Центр круга: (х = " + point.getterX() + ", y = " + point.getterY() + ")");
        System.out.println("Радиус круга: " + radius);
        System.out.println("Площадь круга: " + getArea());
        System.out.println("Периметр круга: " + getPerimeter());
        System.out.println("Цвет круга: " + getter());
    }

}
