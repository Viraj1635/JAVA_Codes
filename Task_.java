import java.util.*;
public class Task_{
    public static void main(String[] args) {
        Scanner enter=new Scanner(System.in);
        int i,j,n,a,b;
        System.out.print("enter a number:");
        n=enter.nextInt();
        for(i=0;i<(2*n-1);i++){
           for(j=0;j<(2*n-1);j++){
            a=0;
            b=2;
                for(a=0;a<n;a++){
                    if(i==a||j==a||i==(2*n-b)||j==(2*n-b)){
                        System.out.print(n);
                    }
                    else{
                        System.out.print((n-a+1));
                    }
                    
                }
            }
            System.out.println(" ");
        }
    }
}
