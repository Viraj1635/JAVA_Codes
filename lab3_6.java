import java.util.*;
public class lab3_6 {
    public static void main(String[] args){
        System.out.print("enter number:");
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int temp=0,n=0;
        for(int i=1;i<=a/2;i++){
            n=a%i;
            if (n==0){
                temp++;
            }
        }
        if (temp>0){
            System.out.println("number is not prime");
        }
        else{
            System.out.println("number is prime");
        }
    }
}
