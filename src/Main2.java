public class Main2 {
    public static void main(String[] args) {
        Point point1 = new Point(2,6);
        Point point2 = new Point(7,10);

        point1.setOffset(3, 2);
        point2.setOffset(1,1);

        System.out.println(point1.toString());
        System.out.println(point2.toString());

    }
}