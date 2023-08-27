import java.util.*;
public class lab3_5 {
    public static void main(String[] args) {
        Scanner fac=new Scanner(System.in);
        int a,b=1,c,n;
        System.out.print("enter a:");
        a=fac.nextInt();
        for(int i=1;i<=a;i++){
            b=b*i;
            }
            System.out.println("factorial is:"+b);
        }
    }
