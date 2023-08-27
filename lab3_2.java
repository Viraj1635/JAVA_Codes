import java.util.*; 
public class lab3_2 {
    public static void main(String[] args) {
        Scanner side=new Scanner(System.in);
        int a,b,c,n;
        System.out.print("enter 1st side:");
        a=side.nextInt();
        System.out.print("enter 2nd side:");
        b=side.nextInt();
        System.out.print("enter 3rd side:");
        c=side.nextInt();
        
        if(a==b && b==c){
            System.out.print("triangle is equilateral");
        }
        else if (a==b||b==c||a==c){
            System.out.print("triangle is isosceles");
        }
        else if((a*a)==(b*b)+(c*c)||(c*c)==(b*b)+(a*a)||(b*b)==(a*a)+(c*c)){
            System.out.print("triangle is right-angled triangle");
        }
        else{
            System.out.print("triangle is scalene");
        }
    }
}
