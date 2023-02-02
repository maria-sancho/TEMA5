public class Segment {
    Point startPoint;
    Point endPoint;

    public Segment(){
        this.startPoint = new Point(0, 0);
        this.endPoint = new Point(0, 0);
    }

    public Segment(Point startPoint, Point endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    public double getModule(){
        return Math.sqrt(Math.pow(endPoint.getX() - startPoint.getX(), 2)
                + Math.pow(endPoint.getY() - startPoint.getY(), 2) * 1.0);
    }

    public void setOffset(int offX, int offY){
        this.startPoint.setOffset(offX, offY);
        this.endPoint.setOffset(offX, offY);
    }

    public void setStartPoint(Point startPoint) {
        this.startPoint = startPoint;
    }

    public void setEndPoint(Point endPoint) {
        this.endPoint = endPoint;
    }


    public Point getStartPoint() {
        return startPoint;
    }

    public Point getEndPoint() {
        return endPoint;
    }

    public String toString() {
        return "(" +  startPoint.getX() + ", " + startPoint.getY() + ") " +
                "- (" + endPoint.getX() + ", " + endPoint.getY() + ")";
    }
}