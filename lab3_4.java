import java.util.*;
public class lab3_4 {
    public static void main(String[] args) {
        Scanner not=new Scanner(System.in);
        int a,b,c,n;
        System.out.print("enter a:");
        a=not.nextInt();
        System.out.print("enter b:");
        b=not.nextInt();
        for(int i=a+1;i<b;i++){
            if(i%2==0&&i%3!=0){
                System.out.println(i);
            }
        }
    }
}
