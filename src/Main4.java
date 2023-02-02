public class Main4 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle.toString());
        rectangle.moveTo(4, 7);
        System.out.println(rectangle.toString());

        Point point1 = new Point(1, 1);
        Point point2 = new Point(4, 8);

        Rectangle rectangle2 = new Rectangle(point1, 6, 3);
        System.out.println(rectangle2.toString());

        Rectangle rectangle3 = new Rectangle(point1, point2);
        System.out.println(rectangle3.toString());

        Rectangle rectangle4 = new Rectangle(new Point(2,4), 3, 7);
        System.out.println(rectangle4.toString());
    }
}