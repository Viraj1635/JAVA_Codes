import java.util.*;
public class Perfect{
	public static void main(String[] args) {
		Scanner prime= new Scanner(System.in);
		int a,b=0,i;
		System.out.println("Enter A :");
		a=prime.nextInt();
		for (i=1;i<a;i++) {
			if(a%i==0){
				b=b+i;	
			}
		}
		if(b==a){
			System.out.println("Number is Perfect");	
		}
		else{
			System.out.println("Number is not Perfect");		
		}
		
	}
}