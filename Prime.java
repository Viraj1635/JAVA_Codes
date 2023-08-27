import java.util.*;
public class Prime{
	public static void main(String[] args) {
		Scanner prime= new Scanner(System.in);
		int a,b=0,i;
		System.out.println("Enter A :");
		a=prime.nextInt();
		for (i=2;i<=a/2;i++) {
			if (a%i==0) {
				b++;	
			}
		}
		if (b>0) {
			System.out.println("Number is not prime");	
		}
		else {
			System.out.println("Number is prime");		
		}
		
	}
}