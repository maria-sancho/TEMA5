public class Main3 {
    public static void main(String[] args) {
        Point point1 = new Point(2,7);
        Point point2 = new Point(9,1);

        Segment segment = new Segment(point1, point2);
        segment.setOffset(1,1 );

        System.out.println(segment.toString());
        System.out.println("Module: " +  segment.getModule());

    }
}