import java.util.*;
public class lab2_6{
	public static void main(String[] args) {
		Scanner lg=new Scanner(System.in);
		double n1,n2,n3,max=0;
		System.out.println("Enter a number:");
		n1=lg.nextDouble();
		System.out.println("Enter a number:");
		n2=lg.nextDouble();
		System.out.println("Enter a number:");
		n3=lg.nextDouble();
		if(n1>n2){
			if (n1>n3) {
				max=n1;
			}
		}
		else {
			if(n2>n3){
				max=n2;
			}
			else{
				max=n3;
			}
		}
		System.out.println("bigest number is:"+max);
		
	}
}