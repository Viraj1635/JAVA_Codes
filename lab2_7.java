import java.util.*;
public class lab2_7{
	public static void main(String[] args) {
		Scanner res=new Scanner(System.in);
		double m1,m2,m3,m4,m5,per=0;
		System.out.println("Enter a marks out of 100:");
		m1=res.nextDouble();
		System.out.println("Enter a marks out of 100:");
		m2=res.nextDouble();
		System.out.println("Enter a marks out of 100:");
		m3=res.nextDouble();
		System.out.println("Enter a marks out of 100:");
		m4=res.nextDouble();
		System.out.println("Enter a marks out of 100:");
		m5=res.nextDouble();
		per=(m1+m2+m3+m4+m5)/5;
		if (per<35) {
			System.out.println("Student class is fail");
		}
		else if (per<45) {
			System.out.println("Student class is pass");
		}
		else if (per<60) {
			System.out.println("Student class is second class");
		}
		else if (per<70) {
			System.out.println("Student class is first class");
		}
		else if (per>70) {
			System.out.println("Student class is distinction");
		}
		
		
	}
}