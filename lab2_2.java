import java.util.*;
public class lab2_2{
	public static void main(String[] args) {
		Scanner bmi=new Scanner(System.in);
		double hm=0,wk=0,wp,hi,index;
		System.out.println("Enter Height in inches:");
		hi=bmi.nextDouble();
		System.out.println("Enter weight in pounds:");
		wp=bmi.nextDouble();
		wk=wp*0.45359237;
		hm=hi*0.0254;
		index=wk/(hm*hm);
		System.out.println("Persons BMI is :"+index);
	}
}