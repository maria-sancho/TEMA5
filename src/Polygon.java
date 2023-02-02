import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Polygon {
    private List<Point> points;

    public Polygon (){
        this.points = new ArrayList<>();
    }

    public Polygon(List<Point> points) {
        this.points = points;
    }

    public double getLength(){
        Point startPoint = new Point();
        return points.stream().map(point -> {
            Segment temporalSegment = new Segment(startPoint, point);
            startPoint.setOffset(point.getX(), point.getY());
            return temporalSegment.getModule();
        }).reduce(0d, Double::sum);
    }

    public void setOffset(int offsetX, int offsetY){
        points.forEach(point -> point.setOffset(offsetX, offsetY));
    }

    public String toString() {
        return points.stream().map(point -> {
            return "(" + point.getX() + ", " + point.getY() + ")";
        }).collect(Collectors.joining(" - "));
    }
}