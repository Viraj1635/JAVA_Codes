import java.util.*;
public class lab4_2{
    public static int intr (int a,int b) {
        if(a>b){
        return a;
    }
    else{
        return b;
    }
    }
    public static void main(String[] args) {
        Scanner side=new Scanner(System.in);
        int a,b,c;
        System.out.print("enter number:");
        a=side.nextInt();
        System.out.print("enter number:");
        b=side.nextInt();
        int n=intr(a,b);
        System.out.print("Maximum number is :"+n);
    }
}
