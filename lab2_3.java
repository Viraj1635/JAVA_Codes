import java.util.*;
public class lab2_3{
	public static void main(String[] args) {
		Scanner circle=new Scanner(System.in);
		double a,d,rs,r;
		System.out.println("Enter meter:");
		a=circle.nextDouble();
		rs=a/3.14;
		r=Math.sqrt(rs);
		d=2*r;
		System.out.println("diameter of circle is :"+d);
	}
}