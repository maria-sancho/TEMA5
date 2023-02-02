public class Point {
    private Integer x;
    private Integer y;


    public Point(){
        this.x = 0;
        this.y = 0;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void moveTo(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void setOffset(int offsetX, int offsetY){
        this.x += offsetX;
        this.y += offsetY;
    }


    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }
}