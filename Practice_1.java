import java.util.*;
public class Practice_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter base x:");
        int x=s.nextInt();
        System.out.println("enter power y:");
        int y=s.nextInt();
        int a=x;
        for (int i=1; i<y ; i++) {
            int ans=0;            
            for (int j=1; j<=x ; j++) {
                ans=ans+a;
            }
            a=ans;
        }

        System.out.println("answer of y power of x:"+a);

    }
}