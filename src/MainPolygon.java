import java.util.List;

public class MainPolygon {
    public static void main(String[] args) {
        Point point1 = new Point(4,5);
        Point point2 = new Point(6,8);
        Point point3 = new Point(8,10);
        Point point4 = new Point(12,14);

        Polygon polygon = new Polygon(List.of(point1, point2, point3, point4));
        polygon.setOffset(4, 4);
        System.out.println(polygon.toString());
        System.out.println(polygon.getLength());

    }
}