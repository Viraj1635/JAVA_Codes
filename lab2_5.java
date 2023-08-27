import java.util.*;
public class lab2_5{
	public static void main(String[] args) {
		Scanner ch=new Scanner(System.in);
		char n;
		System.out.println("enter a character");
		n=ch.next().charAt(0);
		if(n=='a'||n=='e'||n=='i'||n=='o'||n=='u'||n=='A'||n=='E'||n=='I'||n=='O'||n=='U'){
			System.out.println("CHARACTER IS VOWEL");
		}
		else{
			System.out.println("CHARACTER IS CONSONANT");
		}
		
	}
}