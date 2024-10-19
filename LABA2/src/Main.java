import shapes.Shape;

import static java.lang.Math.abs;
import static java.lang.Math.sqrt;

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
        System.out.println("Ошибка(радиус меньше нуля)");
    }
    public Circle(){
        point = new Point(0,0);
        radius = 0.0;
    }
    public Circle(Point newP, double newR){
        point = newP;
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
class Rectangle extends Shape{
    private Point A, C;
    private double dx = A.getterX() - C.getterX(), dy = A.getterY() - C.getterY(), pRect = (abs(dx) + abs(dy)) * 2, aRect = abs(dx) * abs(dy);
    public Point getter1(){
        return A;
    }
    public Point getter2(){
        return C;
    }
    public void setter1(double x, double y){
        A.setterX(x);
        A.setterY(y);
    }
    public void setter2(double x, double y){
        C.setterX(x);
        C.setterY(y);
    }
    private boolean validate(){
        if(A.getterX() == C.getterX() || A.getterY() == C.getterY()){
            Exception();
            return false;
        }
        return true;
    }
    private void Exception(){
        System.out.println("Ошибка(точки х или у лежат на одной прямой)");
    }
    public Rectangle(Point p1, Point p2){
        A = p1;
        C = p2;
    }
    public Rectangle(){
        A = new Point();
        C = new Point();
    }
    public double getPerimeter(){
         return pRect;
    }
    public double getArea(){
        return aRect;
    }

    @Override
    public void move(double moveX, double moveY) {
        C = new Point(moveX,moveY);
        A = new Point(moveX + dx, moveY + dy);
    }
    public void draw(){
        if(!validate()) return;
        System.out.println("Фигура Прямоугольник");
        System.out.println("Точки диагонали прямоугольника: Р1(x = " + A.getterX() + "; y = " + A.getterY() + ") , Р2(x = " + C.getterX() + "; y = " + C.getterY() + ")");
        System.out.println("Площадь прямоугольника: " + getArea());
        System.out.println("Периметр прямоугольника: " + getPerimeter());
        System.out.println("Цвет прямоугольника: " + getter());
    }
}
class Triangle extends Shape {
    private Point P1, P2, P3;
    private double P1P2 = sqrt((P1.getterX() - P2.getterX()) * (P1.getterX() - P2.getterX()) + (P1.getterY() - P2.getterY()) * (P1.getterY() - P2.getterY())),
    P1P3 = sqrt((P1.getterX() - P3.getterX()) * (P1.getterX() - P3.getterX()) + (P1.getterY() - P3.getterY()) * (P1.getterY() - P3.getterY())),
    P2P3 = sqrt((P3.getterX() - P2.getterX()) * (P3.getterX() - P2.getterX()) + (P3.getterY() - P2.getterY()) * (P3.getterY() - P2.getterY())),
    pTr = P1P2 + P1P3 + P2P3, aTr = sqrt((pTr/2) * (pTr/2 - P1P2) * (pTr/2 - P1P3) * (pTr/2 - P2P3));
    public Point getter1() {
        return P1;
    }

    public Point getter2() {
        return P2;
    }

    public Point getter3() {
        return P3;
    }

    public void setter1(Point newP) {
        P1 = newP;
    }

    public void setter2(Point newP) {
        P2 = newP;
    }

    public void setter3(Point newP) {
        P3 = newP;
    }

    private boolean validate() {
        if ((P3.getterX() - P2.getterX()) / (P2.getterX() - P1.getterX()) == (P3.getterY() - P2.getterY()) / (P2.getterY() - P1.getterY())) {
            Exception();
            return false;
        }
        return true;
    }

    private void Exception() {
        System.out.println("Ошибка(три точки на одной прямой)");
    }
    public Triangle(){
        P1 = new Point();
        P2 = new Point();
        P3 = new Point();
    }
    public Triangle(Point newP1, Point newP2, Point newP3){
        P1 = newP1;
        P2 = newP2;
        P3 = newP3;
    }

    @Override
    public double getPerimeter() {
        return pTr;
    }

    @Override
    public double getArea() {
        return aTr;
    }
    public void draw(){
        System.out.println("Фигура Треугольник");
        System.out.println("Точки диагонали треугольника:");
        System.out.println("Р1(x = " + P1.getterX() + "; y = " + P1.getterY() + ")");
        System.out.println("Р2(x = " + P2.getterX() + "; y = " + P2.getterY() + ")");
        System.out.println("Р3(x = " + P3.getterX() + "; y = " + P3.getterY() + ")");
        System.out.println("Площадь треугольника: " + getArea());
        System.out.println("Периметр треугольника: " + getPerimeter());
        System.out.println("Цвет треугольника: " + getter());
    }
}

public class Main {
    public static void main(String[] args) {
        Point point = new Point(2, 1);
        Circle circle = new Circle(point, 1);
        circle.draw();
    }
}