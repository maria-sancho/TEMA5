import java.util.ArrayList;
import java.util.List;

public class Main5 {
    public static void main(String[] args) {
        List<Point> points = new ArrayList(List.of(
                new Point(0, 0),
                new Point(1, 1),
                new Point(2, 2),
                new Point(3, 3),
                new Point(4, 4),
                new Point(5, 5),
                new Point(6, 6),
                new Point(7, 7),
                new Point(8, 8),
                new Point(9, 9)
        ));

        points.forEach(point -> System.out.println(point.toString()));

        List<Rectangle> rectangles = new ArrayList();
        points.forEach(point -> rectangles.add(new Rectangle(point, 1, 1)));
        rectangles.forEach(rectangle -> System.out.println(rectangle.toString()));

    }
}