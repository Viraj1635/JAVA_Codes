import java.util.*;

class Point{
    private int x;
    private int y;

    Point(){
        x=0;
        y=0;
    }
    void setX(int x){
        this.x=x;
    }
    int getX(int x){
        return x;
    }
    void setY(int y){
        this.y=y;
    }
    int getY(int y){
        return y;
    }
    double getDistance(Point p){
        return Math.sqrt(Math.pow((p.x-this.x),2)+Math.pow((p.y-this.y),2));
    }

}

public class Point2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Point p1=new Point();
        System.out.println("Enter X of point 1:");
        int a=sc.nextInt();
        p1.setX(a);
        System.out.println("Enter Y of point 1:");
        a=sc.nextInt();
        p1.setY(a);
        Point p2=new Point();
        System.out.println("Enter X of point 2:");
        a=sc.nextInt();
        p2.setX(a);
        System.out.println("Enter Y of point 2:");
        a=sc.nextInt();
        p2.setY(a);
        System.out.println("Distance between two points is:"+p1.getDistance(p2));
    }
}
