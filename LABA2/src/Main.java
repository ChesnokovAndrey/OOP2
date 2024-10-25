import colors.Color;
import service.impl.ShapeServiceImpl;
import shapes.*;


import java.util.Arrays;
import java.util.List;
public class Main{
    public static void main(String[] args) {
        Triangle redTri = new Triangle(new Point(0,0),new Point(4,0), new Point(0,4));
        redTri.setColor(Color.RED);

        Circle whiteCircle = new Circle(new Point(3,3), 2);
        whiteCircle.setColor(Color.WHITE);

        Circle yellowCircle = new Circle(new Point(2,5), 4);
        yellowCircle.setColor(Color.YELLOW);

        Rectangle rect = new Rectangle(new Point(1,1),new Point(5,2));

        Point point = new Point(100,100);

        Triangle blueTri = new Triangle(new Point(-2,3),new Point(4,3),new Point(2,5));
        blueTri.setColor(Color.BLUE);

        List<Shape> shapes = Arrays.asList(redTri,blueTri,whiteCircle,yellowCircle,rect,point);
        ShapeServiceImpl impl = new ShapeServiceImpl();
        System.out.println(impl.getSquares(shapes));
        System.out.println(impl.getMaxPerimeters(shapes));
        System.out.println(impl.getColors(shapes));
    }
}