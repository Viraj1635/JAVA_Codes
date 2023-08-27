import java.util.*;
public class lab2{
	public static void main(String[] args) {
		Scanner meter=new Scanner(System.in);
		double m,f=0;
		System.out.println("Enter meter:");
		m=meter.nextDouble();
		f=m*3.28;
		System.out.println("Meter in feet is:"+f);
	}
}