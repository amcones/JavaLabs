public class Circle2D{
    private Point p;
    private double radius;
    public Circle2D(double x,double y,double radius){
        p=new Point(x,y);
        this.radius=radius;
    }
    public Circle2D(){
        this.p=new Point();
        this.radius=1;
    }

    public Point getP() {
        return p;
    }

    public void setP(Point p) {
        this.p = p;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI*radius*radius;
    }
    public double getPerimeter(){
        return 2*Math.PI*radius;
    }
    public double distance(Point p){
        return p.distance(this.p);
    }
    public boolean contains(double x,double y){
        return Point.distance(x,y,p.getX(),p.getY())<radius;
    }
    public boolean contains(Point p1){
        return p.distance(p1) < radius;
    }
    public boolean contains(Circle2D circle){
        return p.distance(circle.getP()) < Math.abs(radius - circle.getRadius());
    }
    public boolean overlaps(Circle2D circle){//圆心的距离小于两圆的半径和，且小圆不在圆内
        return p.distance(circle.getP()) < radius + circle.getRadius();
    }
}
class TestCircle2D{
    public static void main(String[] args) {
        Circle2D c1=new Circle2D(2,2,5.5);
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getArea());
        System.out.println(c1.contains(3,3));
        System.out.println(c1.contains(new Circle2D(4,5,10.5)));
        System.out.println(c1.overlaps(new Circle2D(3,5,2.3)));
    }
}
