public class Point{
    private double x=0,y=0;
    public Point(){
        x=0;
        y=0;
    }
    public Point(double x,double y){
        this.x=x;
        this.y=y;
    }

    public static double distance(double x1,double y1,double x2,double y2){
        return Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setLocation(double newx,double newy){
        x=newx;
        y=newy;
    }

    public double distanceFromOrigin(){
        return Math.sqrt(x*x+y*y);
    }

    public void translate(int dx,int dy){
        x+=dx;
        y+=dy;
    }

    public double distance(Point p1,Point p2){
        return Math.sqrt((p2.x-p1.x)*(p2.x-p1.x)+(p2.y-p1.y)*(p2.y-p1.y));
    }

    public double distance(Point p){
        return distance(this, p);
    }

    public String toString(){
        return "Point x is "+x+", y is "+y;
    }
}
class TestPoint {

    public static void main(String[] args) {
        Point p1=new Point(1,1);
        Point p2=new Point(10,30.5);
        System.out.println(p1.distance(p1,p2));
        p1.translate(3,5);
        System.out.println(p1);
    }
}