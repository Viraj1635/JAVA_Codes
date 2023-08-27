import java.util.*;
public class lab4 {
    public int intr (int a,int b,int c) {
        return (a*b*c)/100;
    }
    public static void main(String[] args) {
        Scanner side=new Scanner(System.in);
        int a,b,c;
        double n=0.00;
        System.out.print("enter principal amount:");
        a=side.nextInt();
        System.out.print("enter intrest:");
        b=side.nextInt();
        System.out.print("enter time:");
        c=side.nextInt();
        lab4 t1=new lab4();
        n=t1.intr(a,b,c);
        System.out.print("simple intrest is :"+n);
    }
}
