import java.util.*;
public class lab4_3 {
    public static void fib (int n){
        int a1=0,a2=1,a3;
        for(int i=0;i<=n;i++){
            System.out.print(a1+" ");
            a3=a1+a2;
            a1=a2;
            a2=a3;
        }
    }
    public static void main(String[] args) {
        Scanner side=new Scanner(System.in);
        int n;
        System.out.print("enter n number:");
        n=side.nextInt();
        fib(n);
    }
}
